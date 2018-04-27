
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({9212BA73-3E79-11D1-98BD-006008197D41})</p>
 */
@ComInterface(iid="{9212BA73-3E79-11D1-98BD-006008197D41}")
public interface _CurrentData extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x8b1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "AllTables", dispId = 0x8b1)
    AllTables getAllTables();
            
    /**
     * <p>id(0x8b2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "AllQueries", dispId = 0x8b2)
    AllQueries getAllQueries();
            
    /**
     * <p>id(0x8b4)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "AllViews", dispId = 0x8b4)
    AllViews getAllViews();
            
    /**
     * <p>id(0x8b5)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "AllStoredProcedures", dispId = 0x8b5)
    AllStoredProcedures getAllStoredProcedures();
            
    /**
     * <p>id(0x8b6)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "AllDatabaseDiagrams", dispId = 0x8b6)
    AllDatabaseDiagrams getAllDatabaseDiagrams();
            
    /**
     * <p>id(0x976)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "AllFunctions", dispId = 0x976)
    AllFunctions getAllFunctions();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(13)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}