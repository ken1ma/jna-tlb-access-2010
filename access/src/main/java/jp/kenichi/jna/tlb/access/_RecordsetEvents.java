
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({45165490-EF32-11D0-86FB-006097C9818C})</p>
 */
@ComInterface(iid="{45165490-EF32-11D0-86FB-006097C9818C}")
public interface _RecordsetEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(7)</p>
     * @param cFields [in] {@code Integer}
     * @param Fields [in] {@code Object}
     * @param adStatus [inout] {@code jp.kenichi.jna.tlb.adodb.EventStatusEnum}
     * @param pRecordset [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "WillChangeField", dispId = 0x9)
    void WillChangeField(Integer cFields,
            Object Fields,
            VARIANT adStatus,
            com.sun.jna.platform.win32.COM.util.IUnknown pRecordset);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(8)</p>
     * @param cFields [in] {@code Integer}
     * @param Fields [in] {@code Object}
     * @param pError [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param adStatus [inout] {@code jp.kenichi.jna.tlb.adodb.EventStatusEnum}
     * @param pRecordset [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "FieldChangeComplete", dispId = 0xa)
    void FieldChangeComplete(Integer cFields,
            Object Fields,
            com.sun.jna.platform.win32.COM.util.IUnknown pError,
            VARIANT adStatus,
            com.sun.jna.platform.win32.COM.util.IUnknown pRecordset);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(9)</p>
     * @param adReason [in] {@code jp.kenichi.jna.tlb.adodb.EventReasonEnum}
     * @param cRecords [in] {@code Integer}
     * @param adStatus [inout] {@code jp.kenichi.jna.tlb.adodb.EventStatusEnum}
     * @param pRecordset [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "WillChangeRecord", dispId = 0xb)
    void WillChangeRecord(jp.kenichi.jna.tlb.adodb.EventReasonEnum adReason,
            Integer cRecords,
            VARIANT adStatus,
            com.sun.jna.platform.win32.COM.util.IUnknown pRecordset);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(10)</p>
     * @param adReason [in] {@code jp.kenichi.jna.tlb.adodb.EventReasonEnum}
     * @param cRecords [in] {@code Integer}
     * @param pError [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param adStatus [inout] {@code jp.kenichi.jna.tlb.adodb.EventStatusEnum}
     * @param pRecordset [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "RecordChangeComplete", dispId = 0xc)
    void RecordChangeComplete(jp.kenichi.jna.tlb.adodb.EventReasonEnum adReason,
            Integer cRecords,
            com.sun.jna.platform.win32.COM.util.IUnknown pError,
            VARIANT adStatus,
            com.sun.jna.platform.win32.COM.util.IUnknown pRecordset);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(11)</p>
     * @param adReason [in] {@code jp.kenichi.jna.tlb.adodb.EventReasonEnum}
     * @param adStatus [inout] {@code jp.kenichi.jna.tlb.adodb.EventStatusEnum}
     * @param pRecordset [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "WillChangeRecordset", dispId = 0xd)
    void WillChangeRecordset(jp.kenichi.jna.tlb.adodb.EventReasonEnum adReason,
            VARIANT adStatus,
            com.sun.jna.platform.win32.COM.util.IUnknown pRecordset);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(12)</p>
     * @param adReason [in] {@code jp.kenichi.jna.tlb.adodb.EventReasonEnum}
     * @param pError [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param adStatus [inout] {@code jp.kenichi.jna.tlb.adodb.EventStatusEnum}
     * @param pRecordset [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "RecordsetChangeComplete", dispId = 0xe)
    void RecordsetChangeComplete(jp.kenichi.jna.tlb.adodb.EventReasonEnum adReason,
            com.sun.jna.platform.win32.COM.util.IUnknown pError,
            VARIANT adStatus,
            com.sun.jna.platform.win32.COM.util.IUnknown pRecordset);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(13)</p>
     * @param adReason [in] {@code jp.kenichi.jna.tlb.adodb.EventReasonEnum}
     * @param adStatus [inout] {@code jp.kenichi.jna.tlb.adodb.EventStatusEnum}
     * @param pRecordset [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "WillMove", dispId = 0xf)
    void WillMove(jp.kenichi.jna.tlb.adodb.EventReasonEnum adReason,
            VARIANT adStatus,
            com.sun.jna.platform.win32.COM.util.IUnknown pRecordset);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(14)</p>
     * @param adReason [in] {@code jp.kenichi.jna.tlb.adodb.EventReasonEnum}
     * @param pError [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param adStatus [inout] {@code jp.kenichi.jna.tlb.adodb.EventStatusEnum}
     * @param pRecordset [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "MoveComplete", dispId = 0x10)
    void MoveComplete(jp.kenichi.jna.tlb.adodb.EventReasonEnum adReason,
            com.sun.jna.platform.win32.COM.util.IUnknown pError,
            VARIANT adStatus,
            com.sun.jna.platform.win32.COM.util.IUnknown pRecordset);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(15)</p>
     * @param fMoreData [inout] {@code Short}
     * @param adStatus [inout] {@code jp.kenichi.jna.tlb.adodb.EventStatusEnum}
     * @param pRecordset [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "EndOfRecordset", dispId = 0x11)
    void EndOfRecordset(VARIANT fMoreData,
            VARIANT adStatus,
            com.sun.jna.platform.win32.COM.util.IUnknown pRecordset);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(16)</p>
     * @param Progress [in] {@code Integer}
     * @param MaxProgress [in] {@code Integer}
     * @param adStatus [inout] {@code jp.kenichi.jna.tlb.adodb.EventStatusEnum}
     * @param pRecordset [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "FetchProgress", dispId = 0x12)
    void FetchProgress(Integer Progress,
            Integer MaxProgress,
            VARIANT adStatus,
            com.sun.jna.platform.win32.COM.util.IUnknown pRecordset);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(17)</p>
     * @param pError [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param adStatus [inout] {@code jp.kenichi.jna.tlb.adodb.EventStatusEnum}
     * @param pRecordset [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "FetchComplete", dispId = 0x13)
    void FetchComplete(com.sun.jna.platform.win32.COM.util.IUnknown pError,
            VARIANT adStatus,
            com.sun.jna.platform.win32.COM.util.IUnknown pRecordset);
            
    
}