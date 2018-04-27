
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3E8B6B00-91FF-101B-AF4E-00AA003F0F07})</p>
 */
@ComInterface(iid="{3E8B6B00-91FF-101B-AF4E-00AA003F0F07}")
public interface _Report extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x27)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "FormName", dispId = 0x27)
    String getFormName();
            
    /**
     * <p>id(0x27)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FormName", dispId = 0x27)
    void setFormName(String param0);
            
    /**
     * <p>id(0x9c)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "RecordSource", dispId = 0x9c)
    String getRecordSource();
            
    /**
     * <p>id(0x9c)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "RecordSource", dispId = 0x9c)
    void setRecordSource(String param0);
            
    /**
     * <p>id(0xf5)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Filter", dispId = 0xf5)
    String getFilter();
            
    /**
     * <p>id(0xf5)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Filter", dispId = 0xf5)
    void setFilter(String param0);
            
    /**
     * <p>id(0x14c)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "FilterOn", dispId = 0x14c)
    Boolean getFilterOn();
            
    /**
     * <p>id(0x14c)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FilterOn", dispId = 0x14c)
    void setFilterOn(Boolean param0);
            
    /**
     * <p>id(0x14b)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "OrderBy", dispId = 0x14b)
    String getOrderBy();
            
    /**
     * <p>id(0x14b)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OrderBy", dispId = 0x14b)
    void setOrderBy(String param0);
            
    /**
     * <p>id(0x150)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "OrderByOn", dispId = 0x150)
    Boolean getOrderByOn();
            
    /**
     * <p>id(0x150)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OrderByOn", dispId = 0x150)
    void setOrderByOn(Boolean param0);
            
    /**
     * <p>id(0xf6)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "ServerFilter", dispId = 0xf6)
    String getServerFilter();
            
    /**
     * <p>id(0xf6)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ServerFilter", dispId = 0xf6)
    void setServerFilter(String param0);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x11)
    String getCaption();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x11)
    void setCaption(String param0);
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "RecordLocks", dispId = 0x1a)
    Byte getRecordLocks();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "RecordLocks", dispId = 0x1a)
    void setRecordLocks(Byte param0);
            
    /**
     * <p>id(0x2b)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "PageHeader", dispId = 0x2b)
    Byte getPageHeader();
            
    /**
     * <p>id(0x2b)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "PageHeader", dispId = 0x2b)
    void setPageHeader(Byte param0);
            
    /**
     * <p>id(0x28)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "PageFooter", dispId = 0x28)
    Byte getPageFooter();
            
    /**
     * <p>id(0x28)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "PageFooter", dispId = 0x28)
    void setPageFooter(Byte param0);
            
    /**
     * <p>id(0x11a)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "DateGrouping", dispId = 0x11a)
    Byte getDateGrouping();
            
    /**
     * <p>id(0x11a)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "DateGrouping", dispId = 0x11a)
    void setDateGrouping(Byte param0);
            
    /**
     * <p>id(0x11b)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "GrpKeepTogether", dispId = 0x11b)
    Byte getGrpKeepTogether();
            
    /**
     * <p>id(0x11b)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GrpKeepTogether", dispId = 0x11b)
    void setGrpKeepTogether(Byte param0);
            
    /**
     * <p>id(0x5f)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "MinButton", dispId = 0x5f)
    Boolean getMinButton();
            
    /**
     * <p>id(0x5f)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MinButton", dispId = 0x5f)
    void setMinButton(Boolean param0);
            
    /**
     * <p>id(0x5e)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "MaxButton", dispId = 0x5e)
    Boolean getMaxButton();
            
    /**
     * <p>id(0x5e)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MaxButton", dispId = 0x5e)
    void setMaxButton(Boolean param0);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "Width", dispId = 0x96)
    Short getWidth();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Width", dispId = 0x96)
    void setWidth(Short param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Picture", dispId = 0x7)
    String getPicture();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Picture", dispId = 0x7)
    void setPicture(String param0);
            
    /**
     * <p>id(0x155)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0x155)
    Byte getPictureType();
            
    /**
     * <p>id(0x155)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "PictureType", dispId = 0x155)
    void setPictureType(Byte param0);
            
    /**
     * <p>id(0x138)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "PictureSizeMode", dispId = 0x138)
    Byte getPictureSizeMode();
            
    /**
     * <p>id(0x138)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "PictureSizeMode", dispId = 0x138)
    void setPictureSizeMode(Byte param0);
            
    /**
     * <p>id(0x135)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "PictureAlignment", dispId = 0x135)
    Byte getPictureAlignment();
            
    /**
     * <p>id(0x135)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "PictureAlignment", dispId = 0x135)
    void setPictureAlignment(Byte param0);
            
    /**
     * <p>id(0x139)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "PictureTiling", dispId = 0x139)
    Boolean getPictureTiling();
            
    /**
     * <p>id(0x139)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PictureTiling", dispId = 0x139)
    void setPictureTiling(Boolean param0);
            
    /**
     * <p>id(0x136)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "PicturePages", dispId = 0x136)
    Byte getPicturePages();
            
    /**
     * <p>id(0x136)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "PicturePages", dispId = 0x136)
    void setPicturePages(Byte param0);
            
    /**
     * <p>id(0xf0)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "MenuBar", dispId = 0xf0)
    String getMenuBar();
            
    /**
     * <p>id(0xf0)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MenuBar", dispId = 0xf0)
    void setMenuBar(String param0);
            
    /**
     * <p>id(0x161)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "Toolbar", dispId = 0x161)
    String getToolbar();
            
    /**
     * <p>id(0x161)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Toolbar", dispId = 0x161)
    void setToolbar(String param0);
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "ShortcutMenuBar", dispId = 0x130)
    String getShortcutMenuBar();
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ShortcutMenuBar", dispId = 0x130)
    void setShortcutMenuBar(String param0);
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "GridX", dispId = 0x29)
    Short getGridX();
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "GridX", dispId = 0x29)
    void setGridX(Short param0);
            
    /**
     * <p>id(0x2a)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "GridY", dispId = 0x2a)
    Short getGridY();
            
    /**
     * <p>id(0x2a)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "GridY", dispId = 0x2a)
    void setGridY(Short param0);
            
    /**
     * <p>id(0x8f)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "LayoutForPrint", dispId = 0x8f)
    Boolean getLayoutForPrint();
            
    /**
     * <p>id(0x8f)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LayoutForPrint", dispId = 0x8f)
    void setLayoutForPrint(Boolean param0);
            
    /**
     * <p>id(0x90)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "FastLaserPrinting", dispId = 0x90)
    Boolean getFastLaserPrinting();
            
    /**
     * <p>id(0x90)</p>
     * <p>vtableId(64)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FastLaserPrinting", dispId = 0x90)
    void setFastLaserPrinting(Boolean param0);
            
    /**
     * <p>id(0xda)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "HelpFile", dispId = 0xda)
    String getHelpFile();
            
    /**
     * <p>id(0xda)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HelpFile", dispId = 0xda)
    void setHelpFile(String param0);
            
    /**
     * <p>id(0xdb)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "HelpContextId", dispId = 0xdb)
    Integer getHelpContextId();
            
    /**
     * <p>id(0xdb)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HelpContextId", dispId = 0xdb)
    void setHelpContextId(Integer param0);
            
    /**
     * <p>id(0xc0)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "Hwnd", dispId = 0xc0)
    Integer getHwnd();
            
    /**
     * <p>id(0xc0)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Hwnd", dispId = 0xc0)
    void setHwnd(Integer param0);
            
    /**
     * <p>id(0xc3)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "Count", dispId = 0xc3)
    Short getCount();
            
    /**
     * <p>id(0xc3)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Count", dispId = 0xc3)
    void setCount(Short param0);
            
    /**
     * <p>id(0xc4)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "Page", dispId = 0xc4)
    Integer getPage();
            
    /**
     * <p>id(0xc4)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Page", dispId = 0xc4)
    void setPage(Integer param0);
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "Pages", dispId = 0xc5)
    Short getPages();
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(76)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Pages", dispId = 0xc5)
    void setPages(Short param0);
            
    /**
     * <p>id(0xc6)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "LogicalPageWidth", dispId = 0xc6)
    Integer getLogicalPageWidth();
            
    /**
     * <p>id(0xc6)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LogicalPageWidth", dispId = 0xc6)
    void setLogicalPageWidth(Integer param0);
            
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "LogicalPageHeight", dispId = 0xc7)
    Integer getLogicalPageHeight();
            
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LogicalPageHeight", dispId = 0xc7)
    void setLogicalPageHeight(Integer param0);
            
    /**
     * <p>id(0xd9)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "ZoomControl", dispId = 0xd9)
    Integer getZoomControl();
            
    /**
     * <p>id(0xd9)</p>
     * <p>vtableId(82)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ZoomControl", dispId = 0xd9)
    void setZoomControl(Integer param0);
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "HasData", dispId = 0xca)
    Integer getHasData();
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(84)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HasData", dispId = 0xca)
    void setHasData(Integer param0);
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "Left", dispId = 0x36)
    Integer getLeft();
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(86)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Left", dispId = 0x36)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "Top", dispId = 0x8d)
    Integer getTop();
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(88)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Top", dispId = 0x8d)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "Height", dispId = 0x2c)
    Integer getHeight();
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(90)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Height", dispId = 0x2c)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0xe1)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "PrintSection", dispId = 0xe1)
    Boolean getPrintSection();
            
    /**
     * <p>id(0xe1)</p>
     * <p>vtableId(92)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintSection", dispId = 0xe1)
    void setPrintSection(Boolean param0);
            
    /**
     * <p>id(0xe2)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "NextRecord", dispId = 0xe2)
    Boolean getNextRecord();
            
    /**
     * <p>id(0xe2)</p>
     * <p>vtableId(94)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "NextRecord", dispId = 0xe2)
    void setNextRecord(Boolean param0);
            
    /**
     * <p>id(0xe3)</p>
     * <p>vtableId(95)</p>
     */
    @ComProperty(name = "MoveLayout", dispId = 0xe3)
    Boolean getMoveLayout();
            
    /**
     * <p>id(0xe3)</p>
     * <p>vtableId(96)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MoveLayout", dispId = 0xe3)
    void setMoveLayout(Boolean param0);
            
    /**
     * <p>id(0xe4)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "FormatCount", dispId = 0xe4)
    Short getFormatCount();
            
    /**
     * <p>id(0xe4)</p>
     * <p>vtableId(98)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "FormatCount", dispId = 0xe4)
    void setFormatCount(Short param0);
            
    /**
     * <p>id(0xe5)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "PrintCount", dispId = 0xe5)
    Short getPrintCount();
            
    /**
     * <p>id(0xe5)</p>
     * <p>vtableId(100)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "PrintCount", dispId = 0xe5)
    void setPrintCount(Short param0);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(101)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    Boolean getVisible();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(102)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0xf1)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "Painting", dispId = 0xf1)
    Boolean getPainting();
            
    /**
     * <p>id(0xf1)</p>
     * <p>vtableId(104)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Painting", dispId = 0xf1)
    void setPainting(Boolean param0);
            
    /**
     * <p>id(0xbd)</p>
     * <p>vtableId(105)</p>
     */
    @ComProperty(name = "PrtMip", dispId = 0xbd)
    Object getPrtMip();
            
    /**
     * <p>id(0xbd)</p>
     * <p>vtableId(106)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PrtMip", dispId = 0xbd)
    void setPrtMip(Object param0);
            
    /**
     * <p>id(0xbe)</p>
     * <p>vtableId(107)</p>
     */
    @ComProperty(name = "PrtDevMode", dispId = 0xbe)
    Object getPrtDevMode();
            
    /**
     * <p>id(0xbe)</p>
     * <p>vtableId(108)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PrtDevMode", dispId = 0xbe)
    void setPrtDevMode(Object param0);
            
    /**
     * <p>id(0xbf)</p>
     * <p>vtableId(109)</p>
     */
    @ComProperty(name = "PrtDevNames", dispId = 0xbf)
    Object getPrtDevNames();
            
    /**
     * <p>id(0xbf)</p>
     * <p>vtableId(110)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PrtDevNames", dispId = 0xbf)
    void setPrtDevNames(Object param0);
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(111)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xcc)
    Integer getForeColor();
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(112)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ForeColor", dispId = 0xcc)
    void setForeColor(Integer param0);
            
    /**
     * <p>id(0xcd)</p>
     * <p>vtableId(113)</p>
     */
    @ComProperty(name = "CurrentX", dispId = 0xcd)
    Float getCurrentX();
            
    /**
     * <p>id(0xcd)</p>
     * <p>vtableId(114)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "CurrentX", dispId = 0xcd)
    void setCurrentX(Float param0);
            
    /**
     * <p>id(0xce)</p>
     * <p>vtableId(115)</p>
     */
    @ComProperty(name = "CurrentY", dispId = 0xce)
    Float getCurrentY();
            
    /**
     * <p>id(0xce)</p>
     * <p>vtableId(116)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "CurrentY", dispId = 0xce)
    void setCurrentY(Float param0);
            
    /**
     * <p>id(0xcf)</p>
     * <p>vtableId(117)</p>
     */
    @ComProperty(name = "ScaleHeight", dispId = 0xcf)
    Float getScaleHeight();
            
    /**
     * <p>id(0xcf)</p>
     * <p>vtableId(118)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ScaleHeight", dispId = 0xcf)
    void setScaleHeight(Float param0);
            
    /**
     * <p>id(0xd0)</p>
     * <p>vtableId(119)</p>
     */
    @ComProperty(name = "ScaleLeft", dispId = 0xd0)
    Float getScaleLeft();
            
    /**
     * <p>id(0xd0)</p>
     * <p>vtableId(120)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ScaleLeft", dispId = 0xd0)
    void setScaleLeft(Float param0);
            
    /**
     * <p>id(0xd1)</p>
     * <p>vtableId(121)</p>
     */
    @ComProperty(name = "ScaleMode", dispId = 0xd1)
    Short getScaleMode();
            
    /**
     * <p>id(0xd1)</p>
     * <p>vtableId(122)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "ScaleMode", dispId = 0xd1)
    void setScaleMode(Short param0);
            
    /**
     * <p>id(0xd2)</p>
     * <p>vtableId(123)</p>
     */
    @ComProperty(name = "ScaleTop", dispId = 0xd2)
    Float getScaleTop();
            
    /**
     * <p>id(0xd2)</p>
     * <p>vtableId(124)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ScaleTop", dispId = 0xd2)
    void setScaleTop(Float param0);
            
    /**
     * <p>id(0xd3)</p>
     * <p>vtableId(125)</p>
     */
    @ComProperty(name = "ScaleWidth", dispId = 0xd3)
    Float getScaleWidth();
            
    /**
     * <p>id(0xd3)</p>
     * <p>vtableId(126)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ScaleWidth", dispId = 0xd3)
    void setScaleWidth(Float param0);
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(127)</p>
     */
    @ComProperty(name = "FontBold", dispId = 0x20)
    Short getFontBold();
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(128)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "FontBold", dispId = 0x20)
    void setFontBold(Short param0);
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(129)</p>
     */
    @ComProperty(name = "FontItalic", dispId = 0x21)
    Short getFontItalic();
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(130)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "FontItalic", dispId = 0x21)
    void setFontItalic(Short param0);
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(131)</p>
     */
    @ComProperty(name = "FontName", dispId = 0x22)
    String getFontName();
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(132)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FontName", dispId = 0x22)
    void setFontName(String param0);
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(133)</p>
     */
    @ComProperty(name = "FontSize", dispId = 0x23)
    Short getFontSize();
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(134)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "FontSize", dispId = 0x23)
    void setFontSize(Short param0);
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(135)</p>
     */
    @ComProperty(name = "FontUnderline", dispId = 0x24)
    Short getFontUnderline();
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(136)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "FontUnderline", dispId = 0x24)
    void setFontUnderline(Short param0);
            
    /**
     * <p>id(0xd4)</p>
     * <p>vtableId(137)</p>
     */
    @ComProperty(name = "DrawMode", dispId = 0xd4)
    Short getDrawMode();
            
    /**
     * <p>id(0xd4)</p>
     * <p>vtableId(138)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "DrawMode", dispId = 0xd4)
    void setDrawMode(Short param0);
            
    /**
     * <p>id(0xd5)</p>
     * <p>vtableId(139)</p>
     */
    @ComProperty(name = "DrawStyle", dispId = 0xd5)
    Short getDrawStyle();
            
    /**
     * <p>id(0xd5)</p>
     * <p>vtableId(140)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "DrawStyle", dispId = 0xd5)
    void setDrawStyle(Short param0);
            
    /**
     * <p>id(0xd6)</p>
     * <p>vtableId(141)</p>
     */
    @ComProperty(name = "DrawWidth", dispId = 0xd6)
    Short getDrawWidth();
            
    /**
     * <p>id(0xd6)</p>
     * <p>vtableId(142)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "DrawWidth", dispId = 0xd6)
    void setDrawWidth(Short param0);
            
    /**
     * <p>id(0xd8)</p>
     * <p>vtableId(143)</p>
     */
    @ComProperty(name = "FillColor", dispId = 0xd8)
    Integer getFillColor();
            
    /**
     * <p>id(0xd8)</p>
     * <p>vtableId(144)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "FillColor", dispId = 0xd8)
    void setFillColor(Integer param0);
            
    /**
     * <p>id(0xd7)</p>
     * <p>vtableId(145)</p>
     */
    @ComProperty(name = "FillStyle", dispId = 0xd7)
    Short getFillStyle();
            
    /**
     * <p>id(0xd7)</p>
     * <p>vtableId(146)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "FillStyle", dispId = 0xd7)
    void setFillStyle(Short param0);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(147)</p>
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    String get_Name();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(148)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    void set_Name(String param0);
            
    /**
     * <p>id(0x62)</p>
     * <p>vtableId(149)</p>
     */
    @ComProperty(name = "PaletteSource", dispId = 0x62)
    String getPaletteSource();
            
    /**
     * <p>id(0x62)</p>
     * <p>vtableId(150)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PaletteSource", dispId = 0x62)
    void setPaletteSource(String param0);
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(151)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    String getTag();
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(152)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    void setTag(String param0);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(153)</p>
     */
    @ComProperty(name = "PaintPalette", dispId = 0x64)
    Object getPaintPalette();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(154)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PaintPalette", dispId = 0x64)
    void setPaintPalette(Object param0);
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(155)</p>
     */
    @ComProperty(name = "OnMenu", dispId = 0x3c)
    String getOnMenu();
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(156)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMenu", dispId = 0x3c)
    void setOnMenu(String param0);
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(157)</p>
     */
    @ComProperty(name = "OnOpen", dispId = 0x4d)
    String getOnOpen();
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(158)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnOpen", dispId = 0x4d)
    void setOnOpen(String param0);
            
    /**
     * <p>id(0x4e)</p>
     * <p>vtableId(159)</p>
     */
    @ComProperty(name = "OnClose", dispId = 0x4e)
    String getOnClose();
            
    /**
     * <p>id(0x4e)</p>
     * <p>vtableId(160)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnClose", dispId = 0x4e)
    void setOnClose(String param0);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(161)</p>
     */
    @ComProperty(name = "OnActivate", dispId = 0x70)
    String getOnActivate();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(162)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnActivate", dispId = 0x70)
    void setOnActivate(String param0);
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(163)</p>
     */
    @ComProperty(name = "OnDeactivate", dispId = 0x71)
    String getOnDeactivate();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(164)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDeactivate", dispId = 0x71)
    void setOnDeactivate(String param0);
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(165)</p>
     */
    @ComProperty(name = "OnNoData", dispId = 0x79)
    String getOnNoData();
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(166)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnNoData", dispId = 0x79)
    void setOnNoData(String param0);
            
    /**
     * <p>id(0x53)</p>
     * <p>vtableId(167)</p>
     */
    @ComProperty(name = "OnPage", dispId = 0x53)
    String getOnPage();
            
    /**
     * <p>id(0x53)</p>
     * <p>vtableId(168)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnPage", dispId = 0x53)
    void setOnPage(String param0);
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(169)</p>
     */
    @ComProperty(name = "OnError", dispId = 0x77)
    String getOnError();
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(170)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnError", dispId = 0x77)
    void setOnError(String param0);
            
    /**
     * <p>id(0x11e)</p>
     * <p>vtableId(171)</p>
     */
    @ComProperty(name = "Dirty", dispId = 0x11e)
    Boolean getDirty();
            
    /**
     * <p>id(0x11e)</p>
     * <p>vtableId(172)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Dirty", dispId = 0x11e)
    void setDirty(Boolean param0);
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(173)</p>
     */
    @ComProperty(name = "CurrentRecord", dispId = 0x12e)
    Integer getCurrentRecord();
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(174)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "CurrentRecord", dispId = 0x12e)
    void setCurrentRecord(Integer param0);
            
    /**
     * <p>id(0xbc)</p>
     * <p>vtableId(175)</p>
     */
    @ComProperty(name = "PictureData", dispId = 0xbc)
    Object getPictureData();
            
    /**
     * <p>id(0xbc)</p>
     * <p>vtableId(176)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PictureData", dispId = 0xbc)
    void setPictureData(Object param0);
            
    /**
     * <p>id(0x137)</p>
     * <p>vtableId(177)</p>
     */
    @ComProperty(name = "PicturePalette", dispId = 0x137)
    Object getPicturePalette();
            
    /**
     * <p>id(0x137)</p>
     * <p>vtableId(178)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PicturePalette", dispId = 0x137)
    void setPicturePalette(Object param0);
            
    /**
     * <p>id(0x156)</p>
     * <p>vtableId(179)</p>
     */
    @ComProperty(name = "HasModule", dispId = 0x156)
    Boolean getHasModule();
            
    /**
     * <p>id(0x156)</p>
     * <p>vtableId(180)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasModule", dispId = 0x156)
    void setHasModule(Boolean param0);
            
    /**
     * <p>id(0x16d)</p>
     * <p>vtableId(181)</p>
     */
    @ComProperty(name = "acHiddenCurrentPage", dispId = 0x16d)
    Integer getAcHiddenCurrentPage();
            
    /**
     * <p>id(0x16d)</p>
     * <p>vtableId(182)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "acHiddenCurrentPage", dispId = 0x16d)
    void setAcHiddenCurrentPage(Integer param0);
            
    /**
     * <p>id(0x172)</p>
     * <p>vtableId(183)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x172)
    Byte getOrientation();
            
    /**
     * <p>id(0x172)</p>
     * <p>vtableId(184)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "Orientation", dispId = 0x172)
    void setOrientation(Byte param0);
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(185)</p>
     */
    @ComProperty(name = "InputParameters", dispId = 0x42)
    String getInputParameters();
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(186)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "InputParameters", dispId = 0x42)
    void setInputParameters(String param0);
            
    /**
     * <p>id(0x7d5)</p>
     * <p>vtableId(187)</p>
     */
    @ComProperty(name = "Application", dispId = 0x7d5)
    Application getApplication();
            
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(188)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x7d6)</p>
     * <p>vtableId(189)</p>
     */
    @ComProperty(name = "ActiveControl", dispId = 0x7d6)
    Control getActiveControl();
            
    /**
     * <p>id(0x866)</p>
     * <p>vtableId(190)</p>
     * @param ControlType [in] {@code Integer}
     */
    @ComProperty(name = "DefaultControl", dispId = 0x866)
    Control getDefaultControl(Integer ControlType);
            
    /**
     * <p>id(0x846)</p>
     * <p>vtableId(191)</p>
     * @param flags [in] {@code Short}
     * @param X [in] {@code Float}
     * @param Y [in] {@code Float}
     * @param radius [in] {@code Float}
     * @param color [in] {@code Integer}
     * @param start [in] {@code Float}
     * @param end [in] {@code Float}
     * @param aspect [in] {@code Float}
     */
    @ComMethod(name = "Circle", dispId = 0x846)
    void Circle(Short flags,
            Float X,
            Float Y,
            Float radius,
            Integer color,
            Float start,
            Float end,
            Float aspect);
            
    /**
     * <p>id(0x868)</p>
     * <p>vtableId(192)</p>
     * @param flags [in] {@code Short}
     * @param x1 [in] {@code Float}
     * @param y1 [in] {@code Float}
     * @param x2 [in] {@code Float}
     * @param y2 [in] {@code Float}
     * @param color [in] {@code Integer}
     */
    @ComMethod(name = "Line", dispId = 0x868)
    void Line(Short flags,
            Float x1,
            Float y1,
            Float x2,
            Float y2,
            Integer color);
            
    /**
     * <p>id(0x845)</p>
     * <p>vtableId(193)</p>
     * @param flags [in] {@code Short}
     * @param X [in] {@code Float}
     * @param Y [in] {@code Float}
     * @param color [in] {@code Integer}
     */
    @ComMethod(name = "PSet", dispId = 0x845)
    void PSet(Short flags,
            Float X,
            Float Y,
            Integer color);
            
    /**
     * <p>id(0x844)</p>
     * <p>vtableId(194)</p>
     * @param flags [in] {@code Short}
     * @param x1 [in] {@code Float}
     * @param y1 [in] {@code Float}
     * @param x2 [in] {@code Float}
     * @param y2 [in] {@code Float}
     */
    @ComMethod(name = "Scale", dispId = 0x844)
    void Scale(Short flags,
            Float x1,
            Float y1,
            Float x2,
            Float y2);
            
    /**
     * <p>id(0x842)</p>
     * <p>vtableId(195)</p>
     * @param Expr [in] {@code String}
     */
    @ComMethod(name = "TextWidth", dispId = 0x842)
    Float TextWidth(String Expr);
            
    /**
     * <p>id(0x843)</p>
     * <p>vtableId(196)</p>
     * @param Expr [in] {@code String}
     */
    @ComMethod(name = "TextHeight", dispId = 0x843)
    Float TextHeight(String Expr);
            
    /**
     * <p>id(0x869)</p>
     * <p>vtableId(197)</p>
     * @param Expr [in] {@code String}
     */
    @ComMethod(name = "Print", dispId = 0x869)
    void Print(String Expr);
            
    /**
     * <p>id(0x828)</p>
     * <p>vtableId(198)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Section", dispId = 0x828)
    Section getSection(Object Index);
            
    /**
     * <p>id(0x832)</p>
     * <p>vtableId(199)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "GroupLevel", dispId = 0x832)
    GroupLevel getGroupLevel(Integer Index);
            
    /**
     * <p>id(0x831)</p>
     * <p>vtableId(200)</p>
     */
    @ComProperty(name = "Report", dispId = 0x831)
    Report getReport();
            
    /**
     * <p>id(0x82a)</p>
     * <p>vtableId(201)</p>
     */
    @ComProperty(name = "Module", dispId = 0x82a)
    Module getModule();
            
    /**
     * <p>id(0x82b)</p>
     * <p>vtableId(202)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x82b)
    Properties getProperties();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(203)</p>
     */
    @ComProperty(name = "Controls", dispId = 0x0)
    Controls getControls();
            
    /**
     * <p>id(0xfffffffb)</p>
     * <p>vtableId(205)</p>
     * @param bstrExpr [in] {@code String}
     * @param ppsa [in] {@code Object}
     */
    @ComMethod(name = "_Evaluate", dispId = 0xfffffffb)
    Object _Evaluate(String bstrExpr,
            Object ppsa);
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(206)</p>
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    String getName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(207)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    void setName(String param0);
            
    
}