
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000556-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000556-0000-0010-8000-00AA006D2EA4}")
public interface _Recordset_Deprecated extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x1f4)
    Properties getProperties();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "AbsolutePosition", dispId = 0x3e8)
    PositionEnum getAbsolutePosition();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code PositionEnum}
     */
    @ComProperty(name = "AbsolutePosition", dispId = 0x3e8)
    void setAbsolutePosition(PositionEnum param0);
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ActiveConnection", dispId = 0x3e9)
    void setActiveConnection(Object param0);
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ActiveConnection", dispId = 0x3e9)
    Object getActiveConnection();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "BOF", dispId = 0x3ea)
    Boolean getBOF();
            
    /**
     * <p>id(0x3eb)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Bookmark", dispId = 0x3eb)
    Object getBookmark();
            
    /**
     * <p>id(0x3eb)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Bookmark", dispId = 0x3eb)
    void setBookmark(Object param0);
            
    /**
     * <p>id(0x3ec)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "CacheSize", dispId = 0x3ec)
    Integer getCacheSize();
            
    /**
     * <p>id(0x3ec)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "CacheSize", dispId = 0x3ec)
    void setCacheSize(Integer param0);
            
    /**
     * <p>id(0x3ed)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "CursorType", dispId = 0x3ed)
    CursorTypeEnum getCursorType();
            
    /**
     * <p>id(0x3ed)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code CursorTypeEnum}
     */
    @ComProperty(name = "CursorType", dispId = 0x3ed)
    void setCursorType(CursorTypeEnum param0);
            
    /**
     * <p>id(0x3ee)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "EOF", dispId = 0x3ee)
    Boolean getEOF();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Fields", dispId = 0x0)
    Fields_Deprecated getFields();
            
    /**
     * <p>id(0x3f0)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "LockType", dispId = 0x3f0)
    LockTypeEnum getLockType();
            
    /**
     * <p>id(0x3f0)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code LockTypeEnum}
     */
    @ComProperty(name = "LockType", dispId = 0x3f0)
    void setLockType(LockTypeEnum param0);
            
    /**
     * <p>id(0x3f1)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "MaxRecords", dispId = 0x3f1)
    Integer getMaxRecords();
            
    /**
     * <p>id(0x3f1)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MaxRecords", dispId = 0x3f1)
    void setMaxRecords(Integer param0);
            
    /**
     * <p>id(0x3f2)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "RecordCount", dispId = 0x3f2)
    Integer getRecordCount();
            
    /**
     * <p>id(0x3f3)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Source", dispId = 0x3f3)
    void setSource(String param0);
            
    /**
     * <p>id(0x3f3)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Source", dispId = 0x3f3)
    Object getSource();
            
    /**
     * <p>id(0x3f4)</p>
     * <p>vtableId(30)</p>
     * @param FieldList [in, optional] {@code Object}
     * @param Values [in, optional] {@code Object}
     */
    @ComMethod(name = "AddNew", dispId = 0x3f4)
    void AddNew(Object FieldList,
            Object Values);
            
    /**
     * <p>id(0x3f5)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "CancelUpdate", dispId = 0x3f5)
    void CancelUpdate();
            
    /**
     * <p>id(0x3f6)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "Close", dispId = 0x3f6)
    void Close();
            
    /**
     * <p>id(0x3f7)</p>
     * <p>vtableId(33)</p>
     * @param AffectRecords [in, optional] {@code AffectEnum}
     */
    @ComMethod(name = "Delete", dispId = 0x3f7)
    void Delete(AffectEnum AffectRecords);
            
    /**
     * <p>id(0x3f8)</p>
     * <p>vtableId(34)</p>
     * @param Rows [in, optional] {@code Integer}
     * @param Start [in, optional] {@code Object}
     * @param Fields [in, optional] {@code Object}
     */
    @ComMethod(name = "GetRows", dispId = 0x3f8)
    Object GetRows(Integer Rows,
            Object Start,
            Object Fields);
            
    /**
     * <p>id(0x3f9)</p>
     * <p>vtableId(35)</p>
     * @param NumRecords [in] {@code Integer}
     * @param Start [in, optional] {@code Object}
     */
    @ComMethod(name = "Move", dispId = 0x3f9)
    void Move(Integer NumRecords,
            Object Start);
            
    /**
     * <p>id(0x3fa)</p>
     * <p>vtableId(36)</p>
     */
    @ComMethod(name = "MoveNext", dispId = 0x3fa)
    void MoveNext();
            
    /**
     * <p>id(0x3fb)</p>
     * <p>vtableId(37)</p>
     */
    @ComMethod(name = "MovePrevious", dispId = 0x3fb)
    void MovePrevious();
            
    /**
     * <p>id(0x3fc)</p>
     * <p>vtableId(38)</p>
     */
    @ComMethod(name = "MoveFirst", dispId = 0x3fc)
    void MoveFirst();
            
    /**
     * <p>id(0x3fd)</p>
     * <p>vtableId(39)</p>
     */
    @ComMethod(name = "MoveLast", dispId = 0x3fd)
    void MoveLast();
            
    /**
     * <p>id(0x3fe)</p>
     * <p>vtableId(40)</p>
     * @param Source [in, optional] {@code Object}
     * @param ActiveConnection [in, optional] {@code Object}
     * @param CursorType [in, optional] {@code CursorTypeEnum}
     * @param LockType [in, optional] {@code LockTypeEnum}
     * @param Options [in, optional] {@code Integer}
     */
    @ComMethod(name = "Open", dispId = 0x3fe)
    void Open(Object Source,
            Object ActiveConnection,
            CursorTypeEnum CursorType,
            LockTypeEnum LockType,
            Integer Options);
            
    /**
     * <p>id(0x3ff)</p>
     * <p>vtableId(41)</p>
     * @param Options [in, optional] {@code Integer}
     */
    @ComMethod(name = "Requery", dispId = 0x3ff)
    void Requery(Integer Options);
            
    /**
     * <p>id(0x60030022)</p>
     * <p>vtableId(42)</p>
     * @param AffectRecords [in, optional] {@code AffectEnum}
     */
    @ComMethod(name = "_xResync", dispId = 0x60030022)
    void _xResync(AffectEnum AffectRecords);
            
    /**
     * <p>id(0x401)</p>
     * <p>vtableId(43)</p>
     * @param Fields [in, optional] {@code Object}
     * @param Values [in, optional] {@code Object}
     */
    @ComMethod(name = "Update", dispId = 0x401)
    void Update(Object Fields,
            Object Values);
            
    /**
     * <p>id(0x417)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "AbsolutePage", dispId = 0x417)
    PositionEnum getAbsolutePage();
            
    /**
     * <p>id(0x417)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code PositionEnum}
     */
    @ComProperty(name = "AbsolutePage", dispId = 0x417)
    void setAbsolutePage(PositionEnum param0);
            
    /**
     * <p>id(0x402)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "EditMode", dispId = 0x402)
    EditModeEnum getEditMode();
            
    /**
     * <p>id(0x406)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "Filter", dispId = 0x406)
    Object getFilter();
            
    /**
     * <p>id(0x406)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Filter", dispId = 0x406)
    void setFilter(Object param0);
            
    /**
     * <p>id(0x41a)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "PageCount", dispId = 0x41a)
    Integer getPageCount();
            
    /**
     * <p>id(0x418)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "PageSize", dispId = 0x418)
    Integer getPageSize();
            
    /**
     * <p>id(0x418)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PageSize", dispId = 0x418)
    void setPageSize(Integer param0);
            
    /**
     * <p>id(0x407)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "Sort", dispId = 0x407)
    String getSort();
            
    /**
     * <p>id(0x407)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Sort", dispId = 0x407)
    void setSort(String param0);
            
    /**
     * <p>id(0x405)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "Status", dispId = 0x405)
    Integer getStatus();
            
    /**
     * <p>id(0x41e)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "State", dispId = 0x41e)
    Integer getState();
            
    /**
     * <p>id(0x60030030)</p>
     * <p>vtableId(56)</p>
     */
    @ComMethod(name = "_xClone", dispId = 0x60030030)
    _Recordset_Deprecated _xClone();
            
    /**
     * <p>id(0x40b)</p>
     * <p>vtableId(57)</p>
     * @param AffectRecords [in, optional] {@code AffectEnum}
     */
    @ComMethod(name = "UpdateBatch", dispId = 0x40b)
    void UpdateBatch(AffectEnum AffectRecords);
            
    /**
     * <p>id(0x419)</p>
     * <p>vtableId(58)</p>
     * @param AffectRecords [in, optional] {@code AffectEnum}
     */
    @ComMethod(name = "CancelBatch", dispId = 0x419)
    void CancelBatch(AffectEnum AffectRecords);
            
    /**
     * <p>id(0x41b)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "CursorLocation", dispId = 0x41b)
    CursorLocationEnum getCursorLocation();
            
    /**
     * <p>id(0x41b)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code CursorLocationEnum}
     */
    @ComProperty(name = "CursorLocation", dispId = 0x41b)
    void setCursorLocation(CursorLocationEnum param0);
            
    /**
     * <p>id(0x41c)</p>
     * <p>vtableId(61)</p>
     * @param RecordsAffected [out, optional] {@code Object}
     */
    @ComMethod(name = "NextRecordset", dispId = 0x41c)
    _Recordset_Deprecated NextRecordset(VARIANT RecordsAffected);
            
    /**
     * <p>id(0x40c)</p>
     * <p>vtableId(62)</p>
     * @param CursorOptions [in] {@code CursorOptionEnum}
     */
    @ComMethod(name = "Supports", dispId = 0x40c)
    Boolean Supports(CursorOptionEnum CursorOptions);
            
    /**
     * <p>id(0xfffffff8)</p>
     * <p>vtableId(63)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Collect", dispId = 0xfffffff8)
    Object getCollect(Object Index);
            
    /**
     * <p>id(0xfffffff8)</p>
     * <p>vtableId(64)</p>
     * @param Index [in] {@code Object}
     * @param param1 [in] {@code Object}
     */
    @ComProperty(name = "Collect", dispId = 0xfffffff8)
    void setCollect(Object Index,
            Object param1);
            
    /**
     * <p>id(0x41d)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "MarshalOptions", dispId = 0x41d)
    MarshalOptionsEnum getMarshalOptions();
            
    /**
     * <p>id(0x41d)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code MarshalOptionsEnum}
     */
    @ComProperty(name = "MarshalOptions", dispId = 0x41d)
    void setMarshalOptions(MarshalOptionsEnum param0);
            
    /**
     * <p>id(0x422)</p>
     * <p>vtableId(67)</p>
     * @param Criteria [in] {@code String}
     * @param SkipRecords [in, optional] {@code Integer}
     * @param SearchDirection [in, optional] {@code SearchDirectionEnum}
     * @param Start [in, optional] {@code Object}
     */
    @ComMethod(name = "Find", dispId = 0x422)
    void Find(String Criteria,
            Integer SkipRecords,
            SearchDirectionEnum SearchDirection,
            Object Start);
            
    /**
     * <p>id(0x41f)</p>
     * <p>vtableId(68)</p>
     */
    @ComMethod(name = "Cancel", dispId = 0x41f)
    void Cancel();
            
    /**
     * <p>id(0x420)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "DataSource", dispId = 0x420)
    com.sun.jna.platform.win32.COM.util.IUnknown getDataSource();
            
    /**
     * <p>id(0x60040003)</p>
     * <p>vtableId(71)</p>
     * @param FileName [in, optional] {@code String}
     * @param PersistFormat [in, optional] {@code PersistFormatEnum}
     */
    @ComMethod(name = "_xSave", dispId = 0x60040003)
    void _xSave(String FileName,
            PersistFormatEnum PersistFormat);
            
    /**
     * <p>id(0x425)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "ActiveCommand", dispId = 0x425)
    com.sun.jna.platform.win32.COM.util.IDispatch getActiveCommand();
            
    /**
     * <p>id(0x427)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "StayInSync", dispId = 0x427)
    void setStayInSync(Boolean param0);
            
    /**
     * <p>id(0x427)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "StayInSync", dispId = 0x427)
    Boolean getStayInSync();
            
    /**
     * <p>id(0x426)</p>
     * <p>vtableId(75)</p>
     * @param StringFormat [in, optional] {@code StringFormatEnum}
     * @param NumRows [in, optional] {@code Integer}
     * @param ColumnDelimeter [in, optional] {@code String}
     * @param RowDelimeter [in, optional] {@code String}
     * @param NullExpr [in, optional] {@code String}
     */
    @ComMethod(name = "GetString", dispId = 0x426)
    String GetString(StringFormatEnum StringFormat,
            Integer NumRows,
            String ColumnDelimeter,
            String RowDelimeter,
            String NullExpr);
            
    /**
     * <p>id(0x428)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "DataMember", dispId = 0x428)
    String getDataMember();
            
    /**
     * <p>id(0x428)</p>
     * <p>vtableId(77)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DataMember", dispId = 0x428)
    void setDataMember(String param0);
            
    /**
     * <p>id(0x429)</p>
     * <p>vtableId(78)</p>
     * @param Bookmark1 [in] {@code Object}
     * @param Bookmark2 [in] {@code Object}
     */
    @ComMethod(name = "CompareBookmarks", dispId = 0x429)
    CompareEnum CompareBookmarks(Object Bookmark1,
            Object Bookmark2);
            
    /**
     * <p>id(0x40a)</p>
     * <p>vtableId(79)</p>
     * @param LockType [in, optional] {@code LockTypeEnum}
     */
    @ComMethod(name = "Clone", dispId = 0x40a)
    _Recordset_Deprecated Clone(LockTypeEnum LockType);
            
    /**
     * <p>id(0x400)</p>
     * <p>vtableId(80)</p>
     * @param AffectRecords [in, optional] {@code AffectEnum}
     * @param ResyncValues [in, optional] {@code ResyncEnum}
     */
    @ComMethod(name = "Resync", dispId = 0x400)
    void Resync(AffectEnum AffectRecords,
            ResyncEnum ResyncValues);
            
    /**
     * <p>id(0x42a)</p>
     * <p>vtableId(81)</p>
     * @param KeyValues [in] {@code Object}
     * @param SeekOption [in, optional] {@code SeekEnum}
     */
    @ComMethod(name = "Seek", dispId = 0x42a)
    void Seek(Object KeyValues,
            SeekEnum SeekOption);
            
    /**
     * <p>id(0x42b)</p>
     * <p>vtableId(82)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Index", dispId = 0x42b)
    void setIndex(String param0);
            
    /**
     * <p>id(0x42b)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "Index", dispId = 0x42b)
    String getIndex();
            
    /**
     * <p>id(0x421)</p>
     * <p>vtableId(84)</p>
     * @param Destination [in, optional] {@code Object}
     * @param PersistFormat [in, optional] {@code PersistFormatEnum}
     */
    @ComMethod(name = "Save", dispId = 0x421)
    void Save(Object Destination,
            PersistFormatEnum PersistFormat);
            
    
}