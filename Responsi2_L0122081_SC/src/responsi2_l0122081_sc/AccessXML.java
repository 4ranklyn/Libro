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

/**
 * The AccessXML class provides methods for reading and writing data from/to XML files.
 * It includes methods for reading and writing data for AnggotaTetap, AnggotaBulanan, Buku, and User entities.
 * The read and write operations are specifically implemented for each entity type.
 */

public class AccessXML {
    /**
     * Reads data from XML files for AnggotaTetap, AnggotaBulanan, Buku, and User.
     */
    public static void readXML() {
        readAnggotaTetapXML("src/responsi2_l0122081_sc/dataAnggotaTetap.xml");
        readAnggotaBulananXML("src/responsi2_l0122081_sc/dataAnggotaBulanan.xml");
        readBukuXML("src/responsi2_l0122081_sc/dataBuku.xml");
        readUserXML("src/responsi2_l0122081_sc/dataUser.xml");
    }
    /**
     * Writes data to XML files for AnggotaTetap, AnggotaBulanan, and Buku.
     */
    public static void writeXML() {
        writeAnggotaTetapXML("src/responsi2_l0122081_sc/dataAnggotaTetap.xml");
        writeAnggotaBulananXML("src/responsi2_l0122081_sc/dataAnggotaBulanan.xml");
        writeBukuXML("src/responsi2_l0122081_sc/dataBuku.xml");
    }
    /**
     * Reads AnggotaTetap data from the specified XML file and populates the Pinjam.tMap.
     *
     * @param filePath The path to the XML file containing AnggotaTetap data.
     */
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
    /**
     * Writes AnggotaTetap data to the specified XML file using the Pinjam.tMap.
     *
     * @param filePath The path to the XML file where AnggotaTetap data will be written.
     */
    private static void writeAnggotaTetapXML(String filePath) {
        writeXMLTemplate(filePath, Pinjam.tMap.values(), "AnggotaTetap");
    }
    /**
     * Reads AnggotaBulanan data from the specified XML file and populates the Pinjam.bMap.
     *
     * @param filePath The path to the XML file containing AnggotaBulanan data.
     */
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
    /**
     * Writes AnggotaBulanan data to the specified XML file using the Pinjam.bMap.
     *
     * @param filePath The path to the XML file where AnggotaBulanan data will be written.
     */
    private static void writeAnggotaBulananXML(String filePath) {
        writeXMLTemplate(filePath, Pinjam.bMap.values(), "AnggotaBulanan");
    }
    /**
     * Reads Buku data from the specified XML file and populates the Pinjam.rakBuku.
     *
     * @param filePath The path to the XML file containing Buku data.
     */
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
    /**
     * Writes Buku data to the specified XML file using the Pinjam.rakBuku.
     *
     * @param filePath The path to the XML file where Buku data will be written.
     */
    private static void writeBukuXML(String filePath) {
        writeXMLTemplate(filePath, Pinjam.rakBuku.values(), "Buku");
    }
    /**
     * Reads User data from the specified XML file and populates the User data structure.
     *
     * @param filePath The path to the XML file containing User data.
     */
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
    /**
     * Writes XML data for a generic entity using the specified file path and elements.
     *
     * @param filePath    The path to the XML file where data will be written.
     * @param elements    The iterable collection of elements to be written.
     * @param elementName The name of the XML element representing the entity.
     * @param <T>         The type of the entity.
     */
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
    /**
     * Gets the attributes of a generic entity for XML representation.
     *
     * @param element The entity for which attributes are to be obtained.
     * @param <T>     The type of the entity.
     * @return A map of attribute names and values.
     */
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