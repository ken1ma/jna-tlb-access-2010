
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000071-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000071-0000-0010-8000-00AA006D2EA4}")
public interface Database extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "CollatingOrder", dispId = 0x60030000)
    Integer getCollatingOrder();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Connect", dispId = 0x60030001)
    String getConnect();
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60030002)
    String getName();
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "QueryTimeout", dispId = 0x60030003)
    Short getQueryTimeout();
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "QueryTimeout", dispId = 0x60030003)
    void setQueryTimeout(Short param0);
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Transactions", dispId = 0x60030005)
    Boolean getTransactions();
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Updatable", dispId = 0x60030006)
    Boolean getUpdatable();
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Version", dispId = 0x60030007)
    String getVersion();
            
    /**
     * <p>id(0x60030008)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "RecordsAffected", dispId = 0x60030008)
    Integer getRecordsAffected();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "TableDefs", dispId = 0x0)
    TableDefs getTableDefs();
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "QueryDefs", dispId = 0x6003000a)
    QueryDefs getQueryDefs();
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Relations", dispId = 0x6003000b)
    Relations getRelations();
            
    /**
     * <p>id(0x6003000c)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Containers", dispId = 0x6003000c)
    Containers getContainers();
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Recordsets", dispId = 0x6003000d)
    Recordsets getRecordsets();
            
    /**
     * <p>id(0x6003000e)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "Close", dispId = 0x6003000e)
    void Close();
            
    /**
     * <p>id(0x6003000f)</p>
     * <p>vtableId(23)</p>
     * @param Query [in] {@code String}
     * @param Options [in, optional] {@code Object}
     */
    @ComMethod(name = "Execute", dispId = 0x6003000f)
    void Execute(String Query,
            Object Options);
            
    /**
     * <p>id(0x60030010)</p>
     * <p>vtableId(24)</p>
     * @param Name [in] {@code String}
     * @param Type [in, optional] {@code Object}
     * @param Options [in, optional] {@code Object}
     */
    @ComMethod(name = "_30_OpenRecordset", dispId = 0x60030010)
    Recordset _30_OpenRecordset(String Name,
            Object Type,
            Object Options);
            
    /**
     * <p>id(0x60030011)</p>
     * <p>vtableId(25)</p>
     * @param Name [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     * @param Value [in, optional] {@code Object}
     * @param DDL [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateProperty", dispId = 0x60030011)
    Property CreateProperty(Object Name,
            Object Type,
            Object Value,
            Object DDL);
            
    /**
     * <p>id(0x60030012)</p>
     * <p>vtableId(26)</p>
     * @param Name [in, optional] {@code Object}
     * @param Table [in, optional] {@code Object}
     * @param ForeignTable [in, optional] {@code Object}
     * @param Attributes [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateRelation", dispId = 0x60030012)
    Relation CreateRelation(Object Name,
            Object Table,
            Object ForeignTable,
            Object Attributes);
            
    /**
     * <p>id(0x60030013)</p>
     * <p>vtableId(27)</p>
     * @param Name [in, optional] {@code Object}
     * @param Attributes [in, optional] {@code Object}
     * @param SourceTableName [in, optional] {@code Object}
     * @param Connect [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateTableDef", dispId = 0x60030013)
    TableDef CreateTableDef(Object Name,
            Object Attributes,
            Object SourceTableName,
            Object Connect);
            
    /**
     * <p>id(0x60030014)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "BeginTrans", dispId = 0x60030014)
    void BeginTrans();
            
    /**
     * <p>id(0x60030015)</p>
     * <p>vtableId(29)</p>
     * @param Options [in, optional] {@code Integer}
     */
    @ComMethod(name = "CommitTrans", dispId = 0x60030015)
    void CommitTrans(Integer Options);
            
    /**
     * <p>id(0x60030016)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "Rollback", dispId = 0x60030016)
    void Rollback();
            
    /**
     * <p>id(0x60030017)</p>
     * <p>vtableId(31)</p>
     * @param Name [in] {@code String}
     * @param Options [in, optional] {@code Object}
     * @param Inconsistent [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateDynaset", dispId = 0x60030017)
    Recordset CreateDynaset(String Name,
            Object Options,
            Object Inconsistent);
            
    /**
     * <p>id(0x60030018)</p>
     * <p>vtableId(32)</p>
     * @param Name [in, optional] {@code Object}
     * @param SQLText [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateQueryDef", dispId = 0x60030018)
    QueryDef CreateQueryDef(Object Name,
            Object SQLText);
            
    /**
     * <p>id(0x60030019)</p>
     * <p>vtableId(33)</p>
     * @param Source [in] {@code String}
     * @param Options [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateSnapshot", dispId = 0x60030019)
    Recordset CreateSnapshot(String Source,
            Object Options);
            
    /**
     * <p>id(0x6003001a)</p>
     * <p>vtableId(34)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "DeleteQueryDef", dispId = 0x6003001a)
    void DeleteQueryDef(String Name);
            
    /**
     * <p>id(0x6003001b)</p>
     * <p>vtableId(35)</p>
     * @param SQL [in] {@code String}
     */
    @ComMethod(name = "ExecuteSQL", dispId = 0x6003001b)
    Integer ExecuteSQL(String SQL);
            
    /**
     * <p>id(0x6003001c)</p>
     * <p>vtableId(36)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "ListFields", dispId = 0x6003001c)
    Recordset ListFields(String Name);
            
    /**
     * <p>id(0x6003001d)</p>
     * <p>vtableId(37)</p>
     */
    @ComMethod(name = "ListTables", dispId = 0x6003001d)
    Recordset ListTables();
            
    /**
     * <p>id(0x6003001e)</p>
     * <p>vtableId(38)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "OpenQueryDef", dispId = 0x6003001e)
    QueryDef OpenQueryDef(String Name);
            
    /**
     * <p>id(0x6003001f)</p>
     * <p>vtableId(39)</p>
     * @param Name [in] {@code String}
     * @param Options [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenTable", dispId = 0x6003001f)
    Recordset OpenTable(String Name,
            Object Options);
            
    /**
     * <p>id(0x60030020)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "ReplicaID", dispId = 0x60030020)
    String getReplicaID();
            
    /**
     * <p>id(0x60030021)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "DesignMasterID", dispId = 0x60030021)
    String getDesignMasterID();
            
    /**
     * <p>id(0x60030021)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DesignMasterID", dispId = 0x60030021)
    void setDesignMasterID(String param0);
            
    /**
     * <p>id(0x60030023)</p>
     * <p>vtableId(43)</p>
     * @param DbPathName [in] {@code String}
     * @param ExchangeType [in, optional] {@code Object}
     */
    @ComMethod(name = "Synchronize", dispId = 0x60030023)
    void Synchronize(String DbPathName,
            Object ExchangeType);
            
    /**
     * <p>id(0x60030024)</p>
     * <p>vtableId(44)</p>
     * @param PathName [in] {@code String}
     * @param Description [in] {@code String}
     * @param Options [in, optional] {@code Object}
     */
    @ComMethod(name = "MakeReplica", dispId = 0x60030024)
    void MakeReplica(String PathName,
            String Description,
            Object Options);
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Connect", dispId = 0x60030001)
    void setConnect(String param0);
            
    /**
     * <p>id(0x60030026)</p>
     * <p>vtableId(46)</p>
     * @param bstrOld [in] {@code String}
     * @param bstrNew [in] {@code String}
     */
    @ComMethod(name = "NewPassword", dispId = 0x60030026)
    void NewPassword(String bstrOld,
            String bstrNew);
            
    /**
     * <p>id(0x60030027)</p>
     * <p>vtableId(47)</p>
     * @param Name [in] {@code String}
     * @param Type [in, optional] {@code Object}
     * @param Options [in, optional] {@code Object}
     * @param LockEdit [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenRecordset", dispId = 0x60030027)
    Recordset OpenRecordset(String Name,
            Object Type,
            Object Options,
            Object LockEdit);
            
    /**
     * <p>id(0x60030028)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x60030028)
    Connection getConnection();
            
    /**
     * <p>id(0x60030029)</p>
     * <p>vtableId(49)</p>
     * @param DbPathName [in] {@code String}
     */
    @ComMethod(name = "PopulatePartial", dispId = 0x60030029)
    void PopulatePartial(String DbPathName);
            
    
}