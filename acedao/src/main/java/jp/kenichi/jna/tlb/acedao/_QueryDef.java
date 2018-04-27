
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000079-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000079-0000-0010-8000-00AA006D2EA4}")
public interface _QueryDef extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "DateCreated", dispId = 0x60030000)
    Object getDateCreated();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "LastUpdated", dispId = 0x60030001)
    Object getLastUpdated();
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60030002)
    String getName();
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x60030002)
    void setName(String param0);
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ODBCTimeout", dispId = 0x60030004)
    Short getODBCTimeout();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "ODBCTimeout", dispId = 0x60030004)
    void setODBCTimeout(Short param0);
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60030006)
    Short getType();
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "SQL", dispId = 0x60030007)
    String getSQL();
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SQL", dispId = 0x60030007)
    void setSQL(String param0);
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Updatable", dispId = 0x60030009)
    Boolean getUpdatable();
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Connect", dispId = 0x6003000a)
    String getConnect();
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Connect", dispId = 0x6003000a)
    void setConnect(String param0);
            
    /**
     * <p>id(0x6003000c)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "ReturnsRecords", dispId = 0x6003000c)
    Boolean getReturnsRecords();
            
    /**
     * <p>id(0x6003000c)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReturnsRecords", dispId = 0x6003000c)
    void setReturnsRecords(Boolean param0);
            
    /**
     * <p>id(0x6003000e)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "RecordsAffected", dispId = 0x6003000e)
    Integer getRecordsAffected();
            
    /**
     * <p>id(0x6003000f)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Fields", dispId = 0x6003000f)
    Fields getFields();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Parameters", dispId = 0x0)
    Parameters getParameters();
            
    /**
     * <p>id(0x60030011)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "Close", dispId = 0x60030011)
    void Close();
            
    /**
     * <p>id(0x60030012)</p>
     * <p>vtableId(26)</p>
     * @param Type [in, optional] {@code Object}
     * @param Options [in, optional] {@code Object}
     */
    @ComMethod(name = "_30_OpenRecordset", dispId = 0x60030012)
    Recordset _30_OpenRecordset(Object Type,
            Object Options);
            
    /**
     * <p>id(0x60030013)</p>
     * <p>vtableId(27)</p>
     * @param Type [in, optional] {@code Object}
     * @param Options [in, optional] {@code Object}
     */
    @ComMethod(name = "_30__OpenRecordset", dispId = 0x60030013)
    Recordset _30__OpenRecordset(Object Type,
            Object Options);
            
    /**
     * <p>id(0x60030014)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "_Copy", dispId = 0x60030014)
    QueryDef _Copy();
            
    /**
     * <p>id(0x60030015)</p>
     * <p>vtableId(29)</p>
     * @param Options [in, optional] {@code Object}
     */
    @ComMethod(name = "Execute", dispId = 0x60030015)
    void Execute(Object Options);
            
    /**
     * <p>id(0x60030016)</p>
     * <p>vtableId(30)</p>
     * @param pQdef [in] {@code QueryDef}
     * @param lps [in] {@code Short}
     */
    @ComMethod(name = "Compare", dispId = 0x60030016)
    void Compare(QueryDef pQdef,
            Short lps);
            
    /**
     * <p>id(0x60030017)</p>
     * <p>vtableId(31)</p>
     * @param Options [in, optional] {@code Object}
     * @param Inconsistent [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateDynaset", dispId = 0x60030017)
    Recordset CreateDynaset(Object Options,
            Object Inconsistent);
            
    /**
     * <p>id(0x60030018)</p>
     * <p>vtableId(32)</p>
     * @param Options [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateSnapshot", dispId = 0x60030018)
    Recordset CreateSnapshot(Object Options);
            
    /**
     * <p>id(0x60030019)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "ListParameters", dispId = 0x60030019)
    Recordset ListParameters();
            
    /**
     * <p>id(0x6003001a)</p>
     * <p>vtableId(34)</p>
     * @param Name [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     * @param Value [in, optional] {@code Object}
     * @param DDL [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateProperty", dispId = 0x6003001a)
    Property CreateProperty(Object Name,
            Object Type,
            Object Value,
            Object DDL);
            
    /**
     * <p>id(0x6003001b)</p>
     * <p>vtableId(35)</p>
     * @param Type [in, optional] {@code Object}
     * @param Options [in, optional] {@code Object}
     * @param LockEdit [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenRecordset", dispId = 0x6003001b)
    Recordset OpenRecordset(Object Type,
            Object Options,
            Object LockEdit);
            
    /**
     * <p>id(0x6003001c)</p>
     * <p>vtableId(36)</p>
     * @param Type [in, optional] {@code Object}
     * @param Options [in, optional] {@code Object}
     * @param LockEdit [in, optional] {@code Object}
     */
    @ComMethod(name = "_OpenRecordset", dispId = 0x6003001c)
    Recordset _OpenRecordset(Object Type,
            Object Options,
            Object LockEdit);
            
    /**
     * <p>id(0x6003001d)</p>
     * <p>vtableId(37)</p>
     */
    @ComMethod(name = "Cancel", dispId = 0x6003001d)
    void Cancel();
            
    /**
     * <p>id(0x6003001e)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "hStmt", dispId = 0x6003001e)
    Integer getHStmt();
            
    /**
     * <p>id(0x6003001f)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "MaxRecords", dispId = 0x6003001f)
    Integer getMaxRecords();
            
    /**
     * <p>id(0x6003001f)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MaxRecords", dispId = 0x6003001f)
    void setMaxRecords(Integer param0);
            
    /**
     * <p>id(0x60030021)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "StillExecuting", dispId = 0x60030021)
    Boolean getStillExecuting();
            
    /**
     * <p>id(0x60030022)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "CacheSize", dispId = 0x60030022)
    Integer getCacheSize();
            
    /**
     * <p>id(0x60030022)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "CacheSize", dispId = 0x60030022)
    void setCacheSize(Integer param0);
            
    /**
     * <p>id(0x60030024)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "Prepare", dispId = 0x60030024)
    Object getPrepare();
            
    /**
     * <p>id(0x60030024)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Prepare", dispId = 0x60030024)
    void setPrepare(Object param0);
            
    
}