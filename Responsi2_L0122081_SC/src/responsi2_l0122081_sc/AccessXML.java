/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi2_l0122081_sc;

/**
 *
 * @author franklynical
 */

import java.io.File;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class AccessXML {

    public static void readXML() {
        readAnggotaTetapXML("src/responsi2_l0122081_sc/dataAnggotaTetap.xml");
        readAnggotaBulananXML("src/responsi2_l0122081_sc/dataAnggotaBulanan.xml");
        readBukuXML("src/responsi2_l0122081_sc/dataBuku.xml");
        readUserXML("src/responsi2_l0122081_sc/dataUser.xml");
    }

    public static void writeXML() {
        writeAnggotaTetapXML("src/responsi2_l0122081_sc/dataAnggotaTetap.xml");
        writeAnggotaBulananXML("src/responsi2_l0122081_sc/dataAnggotaBulanan.xml");
        writeBukuXML("src/responsi2_l0122081_sc/dataBuku.xml");
    }

    private static void readAnggotaTetapXML(String filePath) {
        try {
            File xmlFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            NodeList anggotaNodes = doc.getElementsByTagName("AnggotaTetap");
            for (int i = 0; i < anggotaNodes.getLength(); i++) {
                Node anggotaNode = anggotaNodes.item(i);
                if (anggotaNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element anggotaElement = (Element) anggotaNode;

                    String id = anggotaElement.getAttribute("id");
                    String nama = anggotaElement.getAttribute("nama");

                    String jumlahPinjamAttribute = anggotaElement.getAttribute("jumlahPinjam");

                    int jumlahPinjam = (jumlahPinjamAttribute.isEmpty()) ? 0 : Integer.parseInt(jumlahPinjamAttribute);
                    AnggotaTetap anggota = new AnggotaTetap(id, nama, jumlahPinjam);
                    anggota.jumlahPinjam = jumlahPinjam;

                    Pinjam.tMap.put(id, anggota);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeAnggotaTetapXML(String filePath) {
        writeXMLTemplate(filePath, Pinjam.tMap.values(), "AnggotaTetap");
    }

    private static void readAnggotaBulananXML(String filePath) {
        try {
            File xmlFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            NodeList anggotaNodes = doc.getElementsByTagName("AnggotaBulanan");
            for (int i = 0; anggotaNodes != null && i < anggotaNodes.getLength(); i++) {
                Node anggotaNode = anggotaNodes.item(i);
                if (anggotaNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element anggotaElement = (Element) anggotaNode;

                    String id = anggotaElement.getAttribute("id");
                    String nama = anggotaElement.getAttribute("nama");
                    String jumlahPinjamAttribute = anggotaElement.getAttribute("jumlahPinjam");

                    int jumlahPinjam = (jumlahPinjamAttribute.isEmpty()) ? 0 : Integer.parseInt(jumlahPinjamAttribute);
                    AnggotaBulanan anggota = new AnggotaBulanan(id, nama, jumlahPinjam);
                    anggota.jumlahPinjam = jumlahPinjam;

                    Pinjam.bMap.put(id, anggota);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeAnggotaBulananXML(String filePath) {
        writeXMLTemplate(filePath, Pinjam.bMap.values(), "AnggotaBulanan");
    }

    private static void readBukuXML(String filePath) {
        try {
            File xmlFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            NodeList bukuNodes = doc.getElementsByTagName("Buku");
            for (int i = 0; bukuNodes != null && i < bukuNodes.getLength(); i++) {
                Node bukuNode = bukuNodes.item(i);
                if (bukuNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element bukuElement = (Element) bukuNode;

                    String id = bukuElement.getAttribute("id");
                    String judul = bukuElement.getAttribute("judul");
                    int tahun = Integer.parseInt(bukuElement.getAttribute("tahun"));
                    boolean tersedia = Boolean.parseBoolean(bukuElement.getAttribute("tersedia"));

                    Buku buku = new Buku(id, judul, tahun);
                    buku.tersedia = tersedia;

                    Pinjam.rakBuku.put(id, buku);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeBukuXML(String filePath) {
        writeXMLTemplate(filePath, Pinjam.rakBuku.values(), "Buku");
    }

    private static void readUserXML(String filePath) {
        try {
            File xmlFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("user");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    String username = eElement.getElementsByTagName("username").item(0).getTextContent();
                    String password = eElement.getElementsByTagName("password").item(0).getTextContent();

                    User.addUser(username, password);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static <T> void writeXMLTemplate(String filePath, Iterable<T> elements, String elementName) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            Element rootElement = doc.createElement(elementName + "Data");
            doc.appendChild(rootElement);

            for (T element : elements) {
                Element elementNode = doc.createElement(elementName);
                Map<String, String> attributes = getAttributes(element);
                for (Map.Entry<String, String> entry : attributes.entrySet()) {
                    elementNode.setAttribute(entry.getKey(), entry.getValue());
                }
                rootElement.appendChild(elementNode);
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filePath));
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static <T> Map<String, String> getAttributes(T element) {
        Map<String, String> attributes = new HashMap<>();
        if (element instanceof Anggota) {
            Anggota anggota = (Anggota) element;
            attributes.put("id", anggota.id);
            attributes.put("nama", anggota.nama);
            attributes.put("jumlahPinjam", String.valueOf(anggota.jumlahPinjam));
        } else if (element instanceof Buku) {
            Buku buku = (Buku) element;
            attributes.put("id", buku.id);
            attributes.put("judul", buku.judul);
            attributes.put("tahun", String.valueOf(buku.tahun));
            attributes.put("tersedia", String.valueOf(buku.tersedia));
        
        }
        return attributes;
    }
}