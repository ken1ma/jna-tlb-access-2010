
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000035-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000035-0000-0010-8000-00AA006D2EA4}")
public interface Recordset2 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Properties", dispId = 0xa)
    Properties getProperties();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "BOF", dispId = 0x65)
    Boolean getBOF();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Bookmark", dispId = 0x66)
    Byte getBookmark();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "Bookmark", dispId = 0x66)
    void setBookmark(Byte param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Bookmarkable", dispId = 0x67)
    Boolean getBookmarkable();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DateCreated", dispId = 0x68)
    Object getDateCreated();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "EOF", dispId = 0x69)
    Boolean getEOF();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Filter", dispId = 0x6a)
    String getFilter();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Filter", dispId = 0x6a)
    void setFilter(String param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Index", dispId = 0x6b)
    String getIndex();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Index", dispId = 0x6b)
    void setIndex(String param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "LastModified", dispId = 0x6c)
    Byte getLastModified();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "LastUpdated", dispId = 0x6d)
    Object getLastUpdated();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "LockEdits", dispId = 0x6e)
    Boolean getLockEdits();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LockEdits", dispId = 0x6e)
    void setLockEdits(Boolean param0);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6f)
    String getName();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "NoMatch", dispId = 0x70)
    Boolean getNoMatch();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Sort", dispId = 0x71)
    String getSort();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Sort", dispId = 0x71)
    void setSort(String param0);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Transactions", dispId = 0x72)
    Boolean getTransactions();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Type", dispId = 0x73)
    Short getType();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "RecordCount", dispId = 0x74)
    Integer getRecordCount();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Updatable", dispId = 0x75)
    Boolean getUpdatable();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Restartable", dispId = 0x76)
    Boolean getRestartable();
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "ValidationText", dispId = 0x77)
    String getValidationText();
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "ValidationRule", dispId = 0x78)
    String getValidationRule();
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "CacheStart", dispId = 0x79)
    Byte getCacheStart();
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "CacheStart", dispId = 0x79)
    void setCacheStart(Byte param0);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "CacheSize", dispId = 0x7a)
    Integer getCacheSize();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "CacheSize", dispId = 0x7a)
    void setCacheSize(Integer param0);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "PercentPosition", dispId = 0x7b)
    Float getPercentPosition();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PercentPosition", dispId = 0x7b)
    void setPercentPosition(Float param0);
            
    /**
     * <p>id(0x7c)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "AbsolutePosition", dispId = 0x7c)
    Integer getAbsolutePosition();
            
    /**
     * <p>id(0x7c)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "AbsolutePosition", dispId = 0x7c)
    void setAbsolutePosition(Integer param0);
            
    /**
     * <p>id(0x7d)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "EditMode", dispId = 0x7d)
    Short getEditMode();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "ODBCFetchCount", dispId = 0x7e)
    Integer getODBCFetchCount();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "ODBCFetchDelay", dispId = 0x7f)
    Integer getODBCFetchDelay();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x80)
    Database getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "Fields", dispId = 0x0)
    Fields getFields();
            
    /**
     * <p>id(0x82)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "Indexes", dispId = 0x82)
    Indexes getIndexes();
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(47)</p>
     */
    @ComMethod(name = "_30_CancelUpdate", dispId = 0x83)
    void _30_CancelUpdate();
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(48)</p>
     */
    @ComMethod(name = "AddNew", dispId = 0x84)
    void AddNew();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(49)</p>
     */
    @ComMethod(name = "Close", dispId = 0x85)
    void Close();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(50)</p>
     * @param Type [in, optional] {@code Object}
     * @param Options [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenRecordset", dispId = 0x86)
    Recordset OpenRecordset(Object Type,
            Object Options);
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(51)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x87)
    void Delete();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(52)</p>
     */
    @ComMethod(name = "Edit", dispId = 0x88)
    void Edit();
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(53)</p>
     * @param Criteria [in] {@code String}
     */
    @ComMethod(name = "FindFirst", dispId = 0x89)
    void FindFirst(String Criteria);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(54)</p>
     * @param Criteria [in] {@code String}
     */
    @ComMethod(name = "FindLast", dispId = 0x8a)
    void FindLast(String Criteria);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(55)</p>
     * @param Criteria [in] {@code String}
     */
    @ComMethod(name = "FindNext", dispId = 0x8b)
    void FindNext(String Criteria);
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(56)</p>
     * @param Criteria [in] {@code String}
     */
    @ComMethod(name = "FindPrevious", dispId = 0x8c)
    void FindPrevious(String Criteria);
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(57)</p>
     */
    @ComMethod(name = "MoveFirst", dispId = 0x8d)
    void MoveFirst();
            
    /**
     * <p>id(0x8e)</p>
     * <p>vtableId(58)</p>
     */
    @ComMethod(name = "_30_MoveLast", dispId = 0x8e)
    void _30_MoveLast();
            
    /**
     * <p>id(0x8f)</p>
     * <p>vtableId(59)</p>
     */
    @ComMethod(name = "MoveNext", dispId = 0x8f)
    void MoveNext();
            
    /**
     * <p>id(0x90)</p>
     * <p>vtableId(60)</p>
     */
    @ComMethod(name = "MovePrevious", dispId = 0x90)
    void MovePrevious();
            
    /**
     * <p>id(0x91)</p>
     * <p>vtableId(61)</p>
     * @param Comparison [in] {@code String}
     * @param Key1 [in] {@code Object}
     * @param Key2 [in, optional] {@code Object}
     * @param Key3 [in, optional] {@code Object}
     * @param Key4 [in, optional] {@code Object}
     * @param Key5 [in, optional] {@code Object}
     * @param Key6 [in, optional] {@code Object}
     * @param Key7 [in, optional] {@code Object}
     * @param Key8 [in, optional] {@code Object}
     * @param Key9 [in, optional] {@code Object}
     * @param Key10 [in, optional] {@code Object}
     * @param Key11 [in, optional] {@code Object}
     * @param Key12 [in, optional] {@code Object}
     * @param Key13 [in, optional] {@code Object}
     */
    @ComMethod(name = "Seek", dispId = 0x91)
    void Seek(String Comparison,
            Object Key1,
            Object Key2,
            Object Key3,
            Object Key4,
            Object Key5,
            Object Key6,
            Object Key7,
            Object Key8,
            Object Key9,
            Object Key10,
            Object Key11,
            Object Key12,
            Object Key13);
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(62)</p>
     */
    @ComMethod(name = "_30_Update", dispId = 0x92)
    void _30_Update();
            
    /**
     * <p>id(0x93)</p>
     * <p>vtableId(63)</p>
     */
    @ComMethod(name = "Clone", dispId = 0x93)
    Recordset Clone();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(64)</p>
     * @param NewQueryDef [in, optional] {@code Object}
     */
    @ComMethod(name = "Requery", dispId = 0x94)
    void Requery(Object NewQueryDef);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(65)</p>
     * @param Rows [in] {@code Integer}
     * @param StartBookmark [in, optional] {@code Object}
     */
    @ComMethod(name = "Move", dispId = 0x95)
    void Move(Integer Rows,
            Object StartBookmark);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(66)</p>
     * @param Rows [in, optional] {@code Object}
     * @param StartBookmark [in, optional] {@code Object}
     */
    @ComMethod(name = "FillCache", dispId = 0x96)
    void FillCache(Object Rows,
            Object StartBookmark);
            
    /**
     * <p>id(0x97)</p>
     * <p>vtableId(67)</p>
     * @param Options [in, optional] {@code Object}
     * @param Inconsistent [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateDynaset", dispId = 0x97)
    Recordset CreateDynaset(Object Options,
            Object Inconsistent);
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(68)</p>
     * @param Options [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateSnapshot", dispId = 0x98)
    Recordset CreateSnapshot(Object Options);
            
    /**
     * <p>id(0x99)</p>
     * <p>vtableId(69)</p>
     */
    @ComMethod(name = "CopyQueryDef", dispId = 0x99)
    QueryDef CopyQueryDef();
            
    /**
     * <p>id(0x9a)</p>
     * <p>vtableId(70)</p>
     */
    @ComMethod(name = "ListFields", dispId = 0x9a)
    Recordset ListFields();
            
    /**
     * <p>id(0x9b)</p>
     * <p>vtableId(71)</p>
     */
    @ComMethod(name = "ListIndexes", dispId = 0x9b)
    Recordset ListIndexes();
            
    /**
     * <p>id(0x9c)</p>
     * <p>vtableId(72)</p>
     * @param NumRows [in, optional] {@code Object}
     */
    @ComMethod(name = "GetRows", dispId = 0x9c)
    Object GetRows(Object NumRows);
            
    /**
     * <p>id(0xfffffff8)</p>
     * <p>vtableId(73)</p>
     * @param Item [in] {@code Object}
     */
    @ComProperty(name = "Collect", dispId = 0xfffffff8)
    Object getCollect(Object Item);
            
    /**
     * <p>id(0xfffffff8)</p>
     * <p>vtableId(74)</p>
     * @param Item [in] {@code Object}
     * @param param1 [in] {@code Object}
     */
    @ComProperty(name = "Collect", dispId = 0xfffffff8)
    void setCollect(Object Item,
            Object param1);
            
    /**
     * <p>id(0x9d)</p>
     * <p>vtableId(75)</p>
     */
    @ComMethod(name = "Cancel", dispId = 0x9d)
    void Cancel();
            
    /**
     * <p>id(0x9e)</p>
     * <p>vtableId(76)</p>
     */
    @ComMethod(name = "NextRecordset", dispId = 0x9e)
    Boolean NextRecordset();
            
    /**
     * <p>id(0x9f)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "hStmt", dispId = 0x9f)
    Integer getHStmt();
            
    /**
     * <p>id(0xa0)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "StillExecuting", dispId = 0xa0)
    Boolean getStillExecuting();
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "BatchSize", dispId = 0xa1)
    Integer getBatchSize();
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BatchSize", dispId = 0xa1)
    void setBatchSize(Integer param0);
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "BatchCollisionCount", dispId = 0xa2)
    Integer getBatchCollisionCount();
            
    /**
     * <p>id(0xa3)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "BatchCollisions", dispId = 0xa3)
    Object getBatchCollisions();
            
    /**
     * <p>id(0xa4)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "Connection", dispId = 0xa4)
    Connection getConnection();
            
    /**
     * <p>id(0xa5)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "RecordStatus", dispId = 0xa5)
    Short getRecordStatus();
            
    /**
     * <p>id(0xa6)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "UpdateOptions", dispId = 0xa6)
    Integer getUpdateOptions();
            
    /**
     * <p>id(0xa6)</p>
     * <p>vtableId(87)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "UpdateOptions", dispId = 0xa6)
    void setUpdateOptions(Integer param0);
            
    /**
     * <p>id(0xa7)</p>
     * <p>vtableId(88)</p>
     * @param UpdateType [in, optional] {@code Integer}
     */
    @ComMethod(name = "CancelUpdate", dispId = 0xa7)
    void CancelUpdate(Integer UpdateType);
            
    /**
     * <p>id(0xa8)</p>
     * <p>vtableId(89)</p>
     * @param UpdateType [in, optional] {@code Integer}
     * @param Force [in, optional] {@code Boolean}
     */
    @ComMethod(name = "Update", dispId = 0xa8)
    void Update(Integer UpdateType,
            Boolean Force);
            
    /**
     * <p>id(0xa9)</p>
     * <p>vtableId(90)</p>
     * @param Options [in, optional] {@code Integer}
     */
    @ComMethod(name = "MoveLast", dispId = 0xa9)
    void MoveLast(Integer Options);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "ParentRecordset", dispId = 0xaa)
    Recordset getParentRecordset();
            
    
}