
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CDB05-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CDB05-0000-0000-C000-000000000046}")
public interface _CustomXMLPart extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "DocumentElement", dispId = 0x60030001)
    CustomXMLNode getDocumentElement();
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Id", dispId = 0x60030002)
    String getId();
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "NamespaceURI", dispId = 0x60030003)
    String getNamespaceURI();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "SchemaCollection", dispId = 0x60030004)
    CustomXMLSchemaCollection getSchemaCollection();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code CustomXMLSchemaCollection}
     */
    @ComProperty(name = "SchemaCollection", dispId = 0x60030004)
    void setSchemaCollection(CustomXMLSchemaCollection param0);
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "NamespaceManager", dispId = 0x60030006)
    CustomXMLPrefixMappings getNamespaceManager();
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "XML", dispId = 0x60030007)
    String getXML();
            
    /**
     * <p>id(0x60030008)</p>
     * <p>vtableId(17)</p>
     * @param Parent [in] {@code CustomXMLNode}
     * @param Name [in, optional] {@code String}
     * @param NamespaceURI [in, optional] {@code String}
     * @param NextSibling [in, optional] {@code CustomXMLNode}
     * @param NodeType [in, optional] {@code MsoCustomXMLNodeType}
     * @param NodeValue [in, optional] {@code String}
     */
    @ComMethod(name = "AddNode", dispId = 0x60030008)
    void AddNode(CustomXMLNode Parent,
            String Name,
            String NamespaceURI,
            CustomXMLNode NextSibling,
            MsoCustomXMLNodeType NodeType,
            String NodeValue);
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60030009)
    void Delete();
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(19)</p>
     * @param FilePath [in] {@code String}
     */
    @ComMethod(name = "Load", dispId = 0x6003000a)
    Boolean Load(String FilePath);
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(20)</p>
     * @param XML [in] {@code String}
     */
    @ComMethod(name = "LoadXML", dispId = 0x6003000b)
    Boolean LoadXML(String XML);
            
    /**
     * <p>id(0x6003000c)</p>
     * <p>vtableId(21)</p>
     * @param XPath [in] {@code String}
     */
    @ComMethod(name = "SelectNodes", dispId = 0x6003000c)
    CustomXMLNodes SelectNodes(String XPath);
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(22)</p>
     * @param XPath [in] {@code String}
     */
    @ComMethod(name = "SelectSingleNode", dispId = 0x6003000d)
    CustomXMLNode SelectSingleNode(String XPath);
            
    /**
     * <p>id(0x6003000e)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Errors", dispId = 0x6003000e)
    CustomXMLValidationErrors getErrors();
            
    /**
     * <p>id(0x6003000f)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "BuiltIn", dispId = 0x6003000f)
    Boolean getBuiltIn();
            
    
}