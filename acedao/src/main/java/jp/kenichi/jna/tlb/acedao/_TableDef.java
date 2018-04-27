
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000049-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000049-0000-0010-8000-00AA006D2EA4}")
public interface _TableDef extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Properties", dispId = 0xa)
    Properties getProperties();
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Attributes", dispId = 0x60030000)
    Integer getAttributes();
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Attributes", dispId = 0x60030000)
    void setAttributes(Integer param0);
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Connect", dispId = 0x60030002)
    String getConnect();
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Connect", dispId = 0x60030002)
    void setConnect(String param0);
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DateCreated", dispId = 0x60030004)
    Object getDateCreated();
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "LastUpdated", dispId = 0x60030005)
    Object getLastUpdated();
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60030006)
    String getName();
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x60030006)
    void setName(String param0);
            
    /**
     * <p>id(0x60030008)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "SourceTableName", dispId = 0x60030008)
    String getSourceTableName();
            
    /**
     * <p>id(0x60030008)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SourceTableName", dispId = 0x60030008)
    void setSourceTableName(String param0);
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Updatable", dispId = 0x6003000a)
    Boolean getUpdatable();
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "ValidationText", dispId = 0x6003000b)
    String getValidationText();
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ValidationText", dispId = 0x6003000b)
    void setValidationText(String param0);
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ValidationRule", dispId = 0x6003000d)
    String getValidationRule();
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ValidationRule", dispId = 0x6003000d)
    void setValidationRule(String param0);
            
    /**
     * <p>id(0x6003000f)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "RecordCount", dispId = 0x6003000f)
    Integer getRecordCount();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Fields", dispId = 0x0)
    Fields getFields();
            
    /**
     * <p>id(0x60030011)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Indexes", dispId = 0x60030011)
    Indexes getIndexes();
            
    /**
     * <p>id(0x60030012)</p>
     * <p>vtableId(26)</p>
     * @param Type [in, optional] {@code Object}
     * @param Options [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenRecordset", dispId = 0x60030012)
    Recordset OpenRecordset(Object Type,
            Object Options);
            
    /**
     * <p>id(0x60030013)</p>
     * <p>vtableId(27)</p>
     */
    @ComMethod(name = "RefreshLink", dispId = 0x60030013)
    void RefreshLink();
            
    /**
     * <p>id(0x60030014)</p>
     * <p>vtableId(28)</p>
     * @param Name [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     * @param Size [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateField", dispId = 0x60030014)
    Field CreateField(Object Name,
            Object Type,
            Object Size);
            
    /**
     * <p>id(0x60030015)</p>
     * <p>vtableId(29)</p>
     * @param Name [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateIndex", dispId = 0x60030015)
    Index CreateIndex(Object Name);
            
    /**
     * <p>id(0x60030016)</p>
     * <p>vtableId(30)</p>
     * @param Name [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     * @param Value [in, optional] {@code Object}
     * @param DDL [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateProperty", dispId = 0x60030016)
    Property CreateProperty(Object Name,
            Object Type,
            Object Value,
            Object DDL);
            
    /**
     * <p>id(0x60030017)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "ConflictTable", dispId = 0x60030017)
    String getConflictTable();
            
    /**
     * <p>id(0x60030018)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "ReplicaFilter", dispId = 0x60030018)
    Object getReplicaFilter();
            
    /**
     * <p>id(0x60030018)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ReplicaFilter", dispId = 0x60030018)
    void setReplicaFilter(Object param0);
            
    
}