
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000400-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000400-0000-0010-8000-00AA006D2EA4}")
public interface ConnectionEvents_Deprecated extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     * @param pError [in] {@code Error}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pConnection [in] {@code _Connection_Deprecated}
     */
    @ComMethod(name = "InfoMessage", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT InfoMessage(Error pError,
            VARIANT adStatus,
            _Connection_Deprecated pConnection);
            
    /**
     * <p>id(0x1)</p>
     * @param TransactionLevel [in] {@code Integer}
     * @param pError [in] {@code Error}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pConnection [in] {@code _Connection_Deprecated}
     */
    @ComMethod(name = "BeginTransComplete", dispId = 0x1)
    com.sun.jna.platform.win32.WinNT.HRESULT BeginTransComplete(Integer TransactionLevel,
            Error pError,
            VARIANT adStatus,
            _Connection_Deprecated pConnection);
            
    /**
     * <p>id(0x3)</p>
     * @param pError [in] {@code Error}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pConnection [in] {@code _Connection_Deprecated}
     */
    @ComMethod(name = "CommitTransComplete", dispId = 0x3)
    com.sun.jna.platform.win32.WinNT.HRESULT CommitTransComplete(Error pError,
            VARIANT adStatus,
            _Connection_Deprecated pConnection);
            
    /**
     * <p>id(0x2)</p>
     * @param pError [in] {@code Error}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pConnection [in] {@code _Connection_Deprecated}
     */
    @ComMethod(name = "RollbackTransComplete", dispId = 0x2)
    com.sun.jna.platform.win32.WinNT.HRESULT RollbackTransComplete(Error pError,
            VARIANT adStatus,
            _Connection_Deprecated pConnection);
            
    /**
     * <p>id(0x4)</p>
     * @param Source [inout] {@code String}
     * @param CursorType [inout] {@code CursorTypeEnum}
     * @param LockType [inout] {@code LockTypeEnum}
     * @param Options [inout] {@code Integer}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pCommand [in] {@code _Command_Deprecated}
     * @param pRecordset [in] {@code _Recordset_Deprecated}
     * @param pConnection [in] {@code _Connection_Deprecated}
     */
    @ComMethod(name = "WillExecute", dispId = 0x4)
    com.sun.jna.platform.win32.WinNT.HRESULT WillExecute(VARIANT Source,
            VARIANT CursorType,
            VARIANT LockType,
            VARIANT Options,
            VARIANT adStatus,
            _Command_Deprecated pCommand,
            _Recordset_Deprecated pRecordset,
            _Connection_Deprecated pConnection);
            
    /**
     * <p>id(0x5)</p>
     * @param RecordsAffected [in] {@code Integer}
     * @param pError [in] {@code Error}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pCommand [in] {@code _Command_Deprecated}
     * @param pRecordset [in] {@code _Recordset_Deprecated}
     * @param pConnection [in] {@code _Connection_Deprecated}
     */
    @ComMethod(name = "ExecuteComplete", dispId = 0x5)
    com.sun.jna.platform.win32.WinNT.HRESULT ExecuteComplete(Integer RecordsAffected,
            Error pError,
            VARIANT adStatus,
            _Command_Deprecated pCommand,
            _Recordset_Deprecated pRecordset,
            _Connection_Deprecated pConnection);
            
    /**
     * <p>id(0x6)</p>
     * @param ConnectionString [inout] {@code String}
     * @param UserID [inout] {@code String}
     * @param Password [inout] {@code String}
     * @param Options [inout] {@code Integer}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pConnection [in] {@code _Connection_Deprecated}
     */
    @ComMethod(name = "WillConnect", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT WillConnect(VARIANT ConnectionString,
            VARIANT UserID,
            VARIANT Password,
            VARIANT Options,
            VARIANT adStatus,
            _Connection_Deprecated pConnection);
            
    /**
     * <p>id(0x7)</p>
     * @param pError [in] {@code Error}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pConnection [in] {@code _Connection_Deprecated}
     */
    @ComMethod(name = "ConnectComplete", dispId = 0x7)
    com.sun.jna.platform.win32.WinNT.HRESULT ConnectComplete(Error pError,
            VARIANT adStatus,
            _Connection_Deprecated pConnection);
            
    /**
     * <p>id(0x8)</p>
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pConnection [in] {@code _Connection_Deprecated}
     */
    @ComMethod(name = "Disconnect", dispId = 0x8)
    com.sun.jna.platform.win32.WinNT.HRESULT Disconnect(VARIANT adStatus,
            _Connection_Deprecated pConnection);
            
    
}