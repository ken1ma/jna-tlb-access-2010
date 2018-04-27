
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000041-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000041-0000-0010-8000-00AA006D2EA4}")
public interface Connection extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60020000)
    String getName();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Connect", dispId = 0x60020001)
    String getConnect();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Database", dispId = 0x60020002)
    Database getDatabase();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "hDbc", dispId = 0x60020003)
    Integer getHDbc();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "QueryTimeout", dispId = 0x60020004)
    Short getQueryTimeout();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "QueryTimeout", dispId = 0x60020004)
    void setQueryTimeout(Short param0);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Transactions", dispId = 0x60020006)
    Boolean getTransactions();
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "RecordsAffected", dispId = 0x60020007)
    Integer getRecordsAffected();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "StillExecuting", dispId = 0x60020008)
    Boolean getStillExecuting();
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Updatable", dispId = 0x60020009)
    Boolean getUpdatable();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "QueryDefs", dispId = 0x0)
    QueryDefs getQueryDefs();
            
    /**
     * <p>id(0x6002000b)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Recordsets", dispId = 0x6002000b)
    Recordsets getRecordsets();
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Cancel", dispId = 0x6002000c)
    void Cancel();
            
    /**
     * <p>id(0x6002000d)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "Close", dispId = 0x6002000d)
    void Close();
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     * @param Name [in, optional] {@code Object}
     * @param SQLText [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateQueryDef", dispId = 0x6002000e)
    QueryDef CreateQueryDef(Object Name,
            Object SQLText);
            
    /**
     * <p>id(0x6002000f)</p>
     * <p>vtableId(22)</p>
     * @param Query [in] {@code String}
     * @param Options [in, optional] {@code Object}
     */
    @ComMethod(name = "Execute", dispId = 0x6002000f)
    void Execute(String Query,
            Object Options);
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(23)</p>
     * @param Name [in] {@code String}
     * @param Type [in, optional] {@code Object}
     * @param Options [in, optional] {@code Object}
     * @param LockEdit [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenRecordset", dispId = 0x60020010)
    Recordset OpenRecordset(String Name,
            Object Type,
            Object Options,
            Object LockEdit);
            
    
}