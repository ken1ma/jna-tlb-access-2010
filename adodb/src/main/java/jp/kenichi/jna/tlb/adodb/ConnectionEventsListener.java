
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00001400-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00001400-0000-0010-8000-00AA006D2EA4}")
public interface ConnectionEventsListener {
    /**
     * <p>id(0x0)</p>
     */
    @ComEventCallback(dispid = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT InfoMessage(Error pError,
            VARIANT adStatus,
            _Connection pConnection);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComEventCallback(dispid = 0x1)
    com.sun.jna.platform.win32.WinNT.HRESULT BeginTransComplete(Integer TransactionLevel,
            Error pError,
            VARIANT adStatus,
            _Connection pConnection);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComEventCallback(dispid = 0x3)
    com.sun.jna.platform.win32.WinNT.HRESULT CommitTransComplete(Error pError,
            VARIANT adStatus,
            _Connection pConnection);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComEventCallback(dispid = 0x2)
    com.sun.jna.platform.win32.WinNT.HRESULT RollbackTransComplete(Error pError,
            VARIANT adStatus,
            _Connection pConnection);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComEventCallback(dispid = 0x4)
    com.sun.jna.platform.win32.WinNT.HRESULT WillExecute(VARIANT Source,
            VARIANT CursorType,
            VARIANT LockType,
            VARIANT Options,
            VARIANT adStatus,
            _Command pCommand,
            _Recordset pRecordset,
            _Connection pConnection);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComEventCallback(dispid = 0x5)
    com.sun.jna.platform.win32.WinNT.HRESULT ExecuteComplete(Integer RecordsAffected,
            Error pError,
            VARIANT adStatus,
            _Command pCommand,
            _Recordset pRecordset,
            _Connection pConnection);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComEventCallback(dispid = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT WillConnect(VARIANT ConnectionString,
            VARIANT UserID,
            VARIANT Password,
            VARIANT Options,
            VARIANT adStatus,
            _Connection pConnection);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComEventCallback(dispid = 0x7)
    com.sun.jna.platform.win32.WinNT.HRESULT ConnectComplete(Error pError,
            VARIANT adStatus,
            _Connection pConnection);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComEventCallback(dispid = 0x8)
    com.sun.jna.platform.win32.WinNT.HRESULT Disconnect(VARIANT adStatus,
            _Connection pConnection);
            
    
}