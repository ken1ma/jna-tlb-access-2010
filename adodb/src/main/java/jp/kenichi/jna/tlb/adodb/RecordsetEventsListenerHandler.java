
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00001266-0000-0010-8000-00AA006D2EA4})</p>
 */
public abstract class RecordsetEventsListenerHandler extends AbstractComEventCallbackListener implements RecordsetEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x9)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT WillChangeField(Integer cFields,
            Object Fields,
            VARIANT adStatus,
            _Recordset pRecordset);
            
    /**
     * <p>id(0xa)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT FieldChangeComplete(Integer cFields,
            Object Fields,
            Error pError,
            VARIANT adStatus,
            _Recordset pRecordset);
            
    /**
     * <p>id(0xb)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT WillChangeRecord(EventReasonEnum adReason,
            Integer cRecords,
            VARIANT adStatus,
            _Recordset pRecordset);
            
    /**
     * <p>id(0xc)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT RecordChangeComplete(EventReasonEnum adReason,
            Integer cRecords,
            Error pError,
            VARIANT adStatus,
            _Recordset pRecordset);
            
    /**
     * <p>id(0xd)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT WillChangeRecordset(EventReasonEnum adReason,
            VARIANT adStatus,
            _Recordset pRecordset);
            
    /**
     * <p>id(0xe)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT RecordsetChangeComplete(EventReasonEnum adReason,
            Error pError,
            VARIANT adStatus,
            _Recordset pRecordset);
            
    /**
     * <p>id(0xf)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT WillMove(EventReasonEnum adReason,
            VARIANT adStatus,
            _Recordset pRecordset);
            
    /**
     * <p>id(0x10)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT MoveComplete(EventReasonEnum adReason,
            Error pError,
            VARIANT adStatus,
            _Recordset pRecordset);
            
    /**
     * <p>id(0x11)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT EndOfRecordset(VARIANT fMoreData,
            VARIANT adStatus,
            _Recordset pRecordset);
            
    /**
     * <p>id(0x12)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT FetchProgress(Integer Progress,
            Integer MaxProgress,
            VARIANT adStatus,
            _Recordset pRecordset);
            
    /**
     * <p>id(0x13)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT FetchComplete(Error pError,
            VARIANT adStatus,
            _Recordset pRecordset);
            
    
}