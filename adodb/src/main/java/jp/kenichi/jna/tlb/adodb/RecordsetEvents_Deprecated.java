
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000266-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000266-0000-0010-8000-00AA006D2EA4}")
public interface RecordsetEvents_Deprecated extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x9)</p>
     * @param cFields [in] {@code Integer}
     * @param Fields [in] {@code Object}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pRecordset [in] {@code _Recordset_Deprecated}
     */
    @ComMethod(name = "WillChangeField", dispId = 0x9)
    com.sun.jna.platform.win32.WinNT.HRESULT WillChangeField(Integer cFields,
            Object Fields,
            VARIANT adStatus,
            _Recordset_Deprecated pRecordset);
            
    /**
     * <p>id(0xa)</p>
     * @param cFields [in] {@code Integer}
     * @param Fields [in] {@code Object}
     * @param pError [in] {@code Error}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pRecordset [in] {@code _Recordset_Deprecated}
     */
    @ComMethod(name = "FieldChangeComplete", dispId = 0xa)
    com.sun.jna.platform.win32.WinNT.HRESULT FieldChangeComplete(Integer cFields,
            Object Fields,
            Error pError,
            VARIANT adStatus,
            _Recordset_Deprecated pRecordset);
            
    /**
     * <p>id(0xb)</p>
     * @param adReason [in] {@code EventReasonEnum}
     * @param cRecords [in] {@code Integer}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pRecordset [in] {@code _Recordset_Deprecated}
     */
    @ComMethod(name = "WillChangeRecord", dispId = 0xb)
    com.sun.jna.platform.win32.WinNT.HRESULT WillChangeRecord(EventReasonEnum adReason,
            Integer cRecords,
            VARIANT adStatus,
            _Recordset_Deprecated pRecordset);
            
    /**
     * <p>id(0xc)</p>
     * @param adReason [in] {@code EventReasonEnum}
     * @param cRecords [in] {@code Integer}
     * @param pError [in] {@code Error}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pRecordset [in] {@code _Recordset_Deprecated}
     */
    @ComMethod(name = "RecordChangeComplete", dispId = 0xc)
    com.sun.jna.platform.win32.WinNT.HRESULT RecordChangeComplete(EventReasonEnum adReason,
            Integer cRecords,
            Error pError,
            VARIANT adStatus,
            _Recordset_Deprecated pRecordset);
            
    /**
     * <p>id(0xd)</p>
     * @param adReason [in] {@code EventReasonEnum}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pRecordset [in] {@code _Recordset_Deprecated}
     */
    @ComMethod(name = "WillChangeRecordset", dispId = 0xd)
    com.sun.jna.platform.win32.WinNT.HRESULT WillChangeRecordset(EventReasonEnum adReason,
            VARIANT adStatus,
            _Recordset_Deprecated pRecordset);
            
    /**
     * <p>id(0xe)</p>
     * @param adReason [in] {@code EventReasonEnum}
     * @param pError [in] {@code Error}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pRecordset [in] {@code _Recordset_Deprecated}
     */
    @ComMethod(name = "RecordsetChangeComplete", dispId = 0xe)
    com.sun.jna.platform.win32.WinNT.HRESULT RecordsetChangeComplete(EventReasonEnum adReason,
            Error pError,
            VARIANT adStatus,
            _Recordset_Deprecated pRecordset);
            
    /**
     * <p>id(0xf)</p>
     * @param adReason [in] {@code EventReasonEnum}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pRecordset [in] {@code _Recordset_Deprecated}
     */
    @ComMethod(name = "WillMove", dispId = 0xf)
    com.sun.jna.platform.win32.WinNT.HRESULT WillMove(EventReasonEnum adReason,
            VARIANT adStatus,
            _Recordset_Deprecated pRecordset);
            
    /**
     * <p>id(0x10)</p>
     * @param adReason [in] {@code EventReasonEnum}
     * @param pError [in] {@code Error}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pRecordset [in] {@code _Recordset_Deprecated}
     */
    @ComMethod(name = "MoveComplete", dispId = 0x10)
    com.sun.jna.platform.win32.WinNT.HRESULT MoveComplete(EventReasonEnum adReason,
            Error pError,
            VARIANT adStatus,
            _Recordset_Deprecated pRecordset);
            
    /**
     * <p>id(0x11)</p>
     * @param fMoreData [inout] {@code Boolean}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pRecordset [in] {@code _Recordset_Deprecated}
     */
    @ComMethod(name = "EndOfRecordset", dispId = 0x11)
    com.sun.jna.platform.win32.WinNT.HRESULT EndOfRecordset(VARIANT fMoreData,
            VARIANT adStatus,
            _Recordset_Deprecated pRecordset);
            
    /**
     * <p>id(0x12)</p>
     * @param Progress [in] {@code Integer}
     * @param MaxProgress [in] {@code Integer}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pRecordset [in] {@code _Recordset_Deprecated}
     */
    @ComMethod(name = "FetchProgress", dispId = 0x12)
    com.sun.jna.platform.win32.WinNT.HRESULT FetchProgress(Integer Progress,
            Integer MaxProgress,
            VARIANT adStatus,
            _Recordset_Deprecated pRecordset);
            
    /**
     * <p>id(0x13)</p>
     * @param pError [in] {@code Error}
     * @param adStatus [inout] {@code EventStatusEnum}
     * @param pRecordset [in] {@code _Recordset_Deprecated}
     */
    @ComMethod(name = "FetchComplete", dispId = 0x13)
    com.sun.jna.platform.win32.WinNT.HRESULT FetchComplete(Error pError,
            VARIANT adStatus,
            _Recordset_Deprecated pRecordset);
            
    
}