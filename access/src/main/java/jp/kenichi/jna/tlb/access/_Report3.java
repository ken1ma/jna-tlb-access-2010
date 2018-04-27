
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({B0E35B78-55B0-47FB-8951-CA616F25CEAF})</p>
 */
@ComInterface(iid="{B0E35B78-55B0-47FB-8951-CA616F25CEAF}")
public interface _Report3 extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "SectionOld", dispId = 0x828)
    Section getSectionOld(Object Index);
            
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
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(208)</p>
     */
    @ComProperty(name = "AutoResize", dispId = 0x6)
    Boolean getAutoResize();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(209)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoResize", dispId = 0x6)
    void setAutoResize(Boolean param0);
            
    /**
     * <p>id(0x116)</p>
     * <p>vtableId(210)</p>
     */
    @ComProperty(name = "AutoCenter", dispId = 0x116)
    Boolean getAutoCenter();
            
    /**
     * <p>id(0x116)</p>
     * <p>vtableId(211)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoCenter", dispId = 0x116)
    void setAutoCenter(Boolean param0);
            
    /**
     * <p>id(0x5a)</p>
     * <p>vtableId(212)</p>
     */
    @ComProperty(name = "PopUp", dispId = 0x5a)
    Boolean getPopUp();
            
    /**
     * <p>id(0x5a)</p>
     * <p>vtableId(213)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PopUp", dispId = 0x5a)
    void setPopUp(Boolean param0);
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(214)</p>
     */
    @ComProperty(name = "Modal", dispId = 0x3e)
    Boolean getModal();
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(215)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Modal", dispId = 0x3e)
    void setModal(Boolean param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(216)</p>
     */
    @ComProperty(name = "BorderStyle", dispId = 0x9)
    Byte getBorderStyle();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(217)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "BorderStyle", dispId = 0x9)
    void setBorderStyle(Byte param0);
            
    /**
     * <p>id(0x61)</p>
     * <p>vtableId(218)</p>
     */
    @ComProperty(name = "ControlBox", dispId = 0x61)
    Boolean getControlBox();
            
    /**
     * <p>id(0x61)</p>
     * <p>vtableId(219)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ControlBox", dispId = 0x61)
    void setControlBox(Boolean param0);
            
    /**
     * <p>id(0x148)</p>
     * <p>vtableId(220)</p>
     */
    @ComProperty(name = "MinMaxButtons", dispId = 0x148)
    Byte getMinMaxButtons();
            
    /**
     * <p>id(0x148)</p>
     * <p>vtableId(221)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "MinMaxButtons", dispId = 0x148)
    void setMinMaxButtons(Byte param0);
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(222)</p>
     */
    @ComProperty(name = "CloseButton", dispId = 0x12f)
    Boolean getCloseButton();
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(223)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CloseButton", dispId = 0x12f)
    void setCloseButton(Boolean param0);
            
    /**
     * <p>id(0x11f)</p>
     * <p>vtableId(224)</p>
     */
    @ComProperty(name = "WindowWidth", dispId = 0x11f)
    Short getWindowWidth();
            
    /**
     * <p>id(0x11f)</p>
     * <p>vtableId(225)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "WindowWidth", dispId = 0x11f)
    void setWindowWidth(Short param0);
            
    /**
     * <p>id(0x120)</p>
     * <p>vtableId(226)</p>
     */
    @ComProperty(name = "WindowHeight", dispId = 0x120)
    Short getWindowHeight();
            
    /**
     * <p>id(0x120)</p>
     * <p>vtableId(227)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "WindowHeight", dispId = 0x120)
    void setWindowHeight(Short param0);
            
    /**
     * <p>id(0x192)</p>
     * <p>vtableId(228)</p>
     */
    @ComProperty(name = "WindowTop", dispId = 0x192)
    Short getWindowTop();
            
    /**
     * <p>id(0x193)</p>
     * <p>vtableId(229)</p>
     */
    @ComProperty(name = "WindowLeft", dispId = 0x193)
    Short getWindowLeft();
            
    /**
     * <p>id(0x918)</p>
     * <p>vtableId(230)</p>
     * @param Left [in] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     */
    @ComMethod(name = "Move", dispId = 0x918)
    void Move(Object Left,
            Object Top,
            Object Width,
            Object Height);
            
    /**
     * <p>id(0x11c)</p>
     * <p>vtableId(231)</p>
     */
    @ComProperty(name = "OpenArgs", dispId = 0x11c)
    Object getOpenArgs();
            
    /**
     * <p>id(0x11c)</p>
     * <p>vtableId(232)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "OpenArgs", dispId = 0x11c)
    void setOpenArgs(Object param0);
            
    /**
     * <p>id(0x93d)</p>
     * <p>vtableId(233)</p>
     */
    @ComProperty(name = "Printer", dispId = 0x93d)
    _Printer getPrinter();
            
    /**
     * <p>id(0x93d)</p>
     * <p>vtableId(234)</p>
     * @param param0 [in] {@code _Printer}
     */
    @ComProperty(name = "Printer", dispId = 0x93d)
    void setPrinter(_Printer param0);
            
    /**
     * <p>id(0x19a)</p>
     * <p>vtableId(236)</p>
     */
    @ComProperty(name = "Moveable", dispId = 0x19a)
    Boolean getMoveable();
            
    /**
     * <p>id(0x19a)</p>
     * <p>vtableId(237)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Moveable", dispId = 0x19a)
    void setMoveable(Boolean param0);
            
    /**
     * <p>id(0x972)</p>
     * <p>vtableId(238)</p>
     */
    @ComProperty(name = "UseDefaultPrinter", dispId = 0x972)
    Boolean getUseDefaultPrinter();
            
    /**
     * <p>id(0x972)</p>
     * <p>vtableId(239)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseDefaultPrinter", dispId = 0x972)
    void setUseDefaultPrinter(Boolean param0);
            
    /**
     * <p>id(0x894)</p>
     * <p>vtableId(240)</p>
     */
    @ComProperty(name = "Recordset", dispId = 0x894)
    com.sun.jna.platform.win32.COM.util.IDispatch getRecordset();
            
    /**
     * <p>id(0x1bd)</p>
     * <p>vtableId(242)</p>
     */
    @ComProperty(name = "RecordSourceQualifier", dispId = 0x1bd)
    String getRecordSourceQualifier();
            
    /**
     * <p>id(0x1bd)</p>
     * <p>vtableId(243)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "RecordSourceQualifier", dispId = 0x1bd)
    void setRecordSourceQualifier(String param0);
            
    /**
     * <p>id(0x977)</p>
     * <p>vtableId(244)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x977)
    String getShape();
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(245)</p>
     */
    @ComProperty(name = "FilterOnLoad", dispId = 0x1c4)
    Boolean getFilterOnLoad();
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(246)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FilterOnLoad", dispId = 0x1c4)
    void setFilterOnLoad(Boolean param0);
            
    /**
     * <p>id(0x1c5)</p>
     * <p>vtableId(247)</p>
     */
    @ComProperty(name = "OrderByOnLoad", dispId = 0x1c5)
    Boolean getOrderByOnLoad();
            
    /**
     * <p>id(0x1c5)</p>
     * <p>vtableId(248)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OrderByOnLoad", dispId = 0x1c5)
    void setOrderByOnLoad(Boolean param0);
            
    /**
     * <p>id(0x93)</p>
     * <p>vtableId(249)</p>
     */
    @ComProperty(name = "DefaultView", dispId = 0x93)
    Byte getDefaultView();
            
    /**
     * <p>id(0x93)</p>
     * <p>vtableId(250)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "DefaultView", dispId = 0x93)
    void setDefaultView(Byte param0);
            
    /**
     * <p>id(0x1da)</p>
     * <p>vtableId(251)</p>
     */
    @ComProperty(name = "AllowReportView", dispId = 0x1da)
    Boolean getAllowReportView();
            
    /**
     * <p>id(0x1da)</p>
     * <p>vtableId(252)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowReportView", dispId = 0x1da)
    void setAllowReportView(Boolean param0);
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(253)</p>
     */
    @ComProperty(name = "ScrollBars", dispId = 0x98)
    Byte getScrollBars();
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(254)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "ScrollBars", dispId = 0x98)
    void setScrollBars(Byte param0);
            
    /**
     * <p>id(0x14a)</p>
     * <p>vtableId(255)</p>
     */
    @ComProperty(name = "Cycle", dispId = 0x14a)
    Byte getCycle();
            
    /**
     * <p>id(0x14a)</p>
     * <p>vtableId(256)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "Cycle", dispId = 0x14a)
    void setCycle(Byte param0);
            
    /**
     * <p>id(0x175)</p>
     * <p>vtableId(257)</p>
     */
    @ComProperty(name = "AllowDesignChanges", dispId = 0x175)
    Boolean getAllowDesignChanges();
            
    /**
     * <p>id(0x175)</p>
     * <p>vtableId(258)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowDesignChanges", dispId = 0x175)
    void setAllowDesignChanges(Boolean param0);
            
    /**
     * <p>id(0x57)</p>
     * <p>vtableId(259)</p>
     */
    @ComProperty(name = "OnCurrent", dispId = 0x57)
    String getOnCurrent();
            
    /**
     * <p>id(0x57)</p>
     * <p>vtableId(260)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnCurrent", dispId = 0x57)
    void setOnCurrent(String param0);
            
    /**
     * <p>id(0x147)</p>
     * <p>vtableId(261)</p>
     */
    @ComProperty(name = "KeyPreview", dispId = 0x147)
    Boolean getKeyPreview();
            
    /**
     * <p>id(0x147)</p>
     * <p>vtableId(262)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "KeyPreview", dispId = 0x147)
    void setKeyPreview(Boolean param0);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(263)</p>
     */
    @ComProperty(name = "TimerInterval", dispId = 0x6f)
    Integer getTimerInterval();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(264)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "TimerInterval", dispId = 0x6f)
    void setTimerInterval(Integer param0);
            
    /**
     * <p>id(0x121)</p>
     * <p>vtableId(265)</p>
     */
    @ComProperty(name = "CurrentView", dispId = 0x121)
    Short getCurrentView();
            
    /**
     * <p>id(0x121)</p>
     * <p>vtableId(266)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "CurrentView", dispId = 0x121)
    void setCurrentView(Short param0);
            
    /**
     * <p>id(0x7e2)</p>
     * <p>vtableId(267)</p>
     */
    @ComMethod(name = "Requery", dispId = 0x7e2)
    void Requery();
            
    /**
     * <p>id(0x1fe)</p>
     * <p>vtableId(268)</p>
     */
    @ComProperty(name = "OnOpenMacro", dispId = 0x1fe)
    String getOnOpenMacro();
            
    /**
     * <p>id(0x1fe)</p>
     * <p>vtableId(269)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnOpenMacro", dispId = 0x1fe)
    void setOnOpenMacro(String param0);
            
    /**
     * <p>id(0x1ff)</p>
     * <p>vtableId(270)</p>
     */
    @ComProperty(name = "OnCloseMacro", dispId = 0x1ff)
    String getOnCloseMacro();
            
    /**
     * <p>id(0x1ff)</p>
     * <p>vtableId(271)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnCloseMacro", dispId = 0x1ff)
    void setOnCloseMacro(String param0);
            
    /**
     * <p>id(0x209)</p>
     * <p>vtableId(272)</p>
     */
    @ComProperty(name = "OnActivateMacro", dispId = 0x209)
    String getOnActivateMacro();
            
    /**
     * <p>id(0x209)</p>
     * <p>vtableId(273)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnActivateMacro", dispId = 0x209)
    void setOnActivateMacro(String param0);
            
    /**
     * <p>id(0x20a)</p>
     * <p>vtableId(274)</p>
     */
    @ComProperty(name = "OnDeactivateMacro", dispId = 0x20a)
    String getOnDeactivateMacro();
            
    /**
     * <p>id(0x20a)</p>
     * <p>vtableId(275)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDeactivateMacro", dispId = 0x20a)
    void setOnDeactivateMacro(String param0);
            
    /**
     * <p>id(0x20c)</p>
     * <p>vtableId(276)</p>
     */
    @ComProperty(name = "OnNoDataMacro", dispId = 0x20c)
    String getOnNoDataMacro();
            
    /**
     * <p>id(0x20c)</p>
     * <p>vtableId(277)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnNoDataMacro", dispId = 0x20c)
    void setOnNoDataMacro(String param0);
            
    /**
     * <p>id(0x20d)</p>
     * <p>vtableId(278)</p>
     */
    @ComProperty(name = "OnPageMacro", dispId = 0x20d)
    String getOnPageMacro();
            
    /**
     * <p>id(0x20d)</p>
     * <p>vtableId(279)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnPageMacro", dispId = 0x20d)
    void setOnPageMacro(String param0);
            
    /**
     * <p>id(0x202)</p>
     * <p>vtableId(280)</p>
     */
    @ComProperty(name = "OnErrorMacro", dispId = 0x202)
    String getOnErrorMacro();
            
    /**
     * <p>id(0x202)</p>
     * <p>vtableId(281)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnErrorMacro", dispId = 0x202)
    void setOnErrorMacro(String param0);
            
    /**
     * <p>id(0x1f1)</p>
     * <p>vtableId(282)</p>
     */
    @ComProperty(name = "OnCurrentMacro", dispId = 0x1f1)
    String getOnCurrentMacro();
            
    /**
     * <p>id(0x1f1)</p>
     * <p>vtableId(283)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnCurrentMacro", dispId = 0x1f1)
    void setOnCurrentMacro(String param0);
            
    /**
     * <p>id(0x200)</p>
     * <p>vtableId(284)</p>
     */
    @ComProperty(name = "OnLoadMacro", dispId = 0x200)
    String getOnLoadMacro();
            
    /**
     * <p>id(0x200)</p>
     * <p>vtableId(285)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnLoadMacro", dispId = 0x200)
    void setOnLoadMacro(String param0);
            
    /**
     * <p>id(0x20b)</p>
     * <p>vtableId(286)</p>
     */
    @ComProperty(name = "OnResizeMacro", dispId = 0x20b)
    String getOnResizeMacro();
            
    /**
     * <p>id(0x20b)</p>
     * <p>vtableId(287)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnResizeMacro", dispId = 0x20b)
    void setOnResizeMacro(String param0);
            
    /**
     * <p>id(0x201)</p>
     * <p>vtableId(288)</p>
     */
    @ComProperty(name = "OnUnloadMacro", dispId = 0x201)
    String getOnUnloadMacro();
            
    /**
     * <p>id(0x201)</p>
     * <p>vtableId(289)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnUnloadMacro", dispId = 0x201)
    void setOnUnloadMacro(String param0);
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(290)</p>
     */
    @ComProperty(name = "OnGotFocusMacro", dispId = 0x1f6)
    String getOnGotFocusMacro();
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(291)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnGotFocusMacro", dispId = 0x1f6)
    void setOnGotFocusMacro(String param0);
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(292)</p>
     */
    @ComProperty(name = "OnLostFocusMacro", dispId = 0x1f7)
    String getOnLostFocusMacro();
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(293)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnLostFocusMacro", dispId = 0x1f7)
    void setOnLostFocusMacro(String param0);
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(294)</p>
     */
    @ComProperty(name = "OnClickMacro", dispId = 0x1ea)
    String getOnClickMacro();
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(295)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnClickMacro", dispId = 0x1ea)
    void setOnClickMacro(String param0);
            
    /**
     * <p>id(0x1eb)</p>
     * <p>vtableId(296)</p>
     */
    @ComProperty(name = "OnDblClickMacro", dispId = 0x1eb)
    String getOnDblClickMacro();
            
    /**
     * <p>id(0x1eb)</p>
     * <p>vtableId(297)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDblClickMacro", dispId = 0x1eb)
    void setOnDblClickMacro(String param0);
            
    /**
     * <p>id(0x1e7)</p>
     * <p>vtableId(298)</p>
     */
    @ComProperty(name = "OnMouseDownMacro", dispId = 0x1e7)
    String getOnMouseDownMacro();
            
    /**
     * <p>id(0x1e7)</p>
     * <p>vtableId(299)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseDownMacro", dispId = 0x1e7)
    void setOnMouseDownMacro(String param0);
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(300)</p>
     */
    @ComProperty(name = "OnMouseMoveMacro", dispId = 0x1e9)
    String getOnMouseMoveMacro();
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(301)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseMoveMacro", dispId = 0x1e9)
    void setOnMouseMoveMacro(String param0);
            
    /**
     * <p>id(0x1e8)</p>
     * <p>vtableId(302)</p>
     */
    @ComProperty(name = "OnMouseUpMacro", dispId = 0x1e8)
    String getOnMouseUpMacro();
            
    /**
     * <p>id(0x1e8)</p>
     * <p>vtableId(303)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseUpMacro", dispId = 0x1e8)
    void setOnMouseUpMacro(String param0);
            
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(304)</p>
     */
    @ComProperty(name = "OnKeyDownMacro", dispId = 0x1f4)
    String getOnKeyDownMacro();
            
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(305)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyDownMacro", dispId = 0x1f4)
    void setOnKeyDownMacro(String param0);
            
    /**
     * <p>id(0x1f5)</p>
     * <p>vtableId(306)</p>
     */
    @ComProperty(name = "OnKeyUpMacro", dispId = 0x1f5)
    String getOnKeyUpMacro();
            
    /**
     * <p>id(0x1f5)</p>
     * <p>vtableId(307)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyUpMacro", dispId = 0x1f5)
    void setOnKeyUpMacro(String param0);
            
    /**
     * <p>id(0x1f3)</p>
     * <p>vtableId(308)</p>
     */
    @ComProperty(name = "OnKeyPressMacro", dispId = 0x1f3)
    String getOnKeyPressMacro();
            
    /**
     * <p>id(0x1f3)</p>
     * <p>vtableId(309)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyPressMacro", dispId = 0x1f3)
    void setOnKeyPressMacro(String param0);
            
    /**
     * <p>id(0x20e)</p>
     * <p>vtableId(310)</p>
     */
    @ComProperty(name = "OnFilterMacro", dispId = 0x20e)
    String getOnFilterMacro();
            
    /**
     * <p>id(0x20e)</p>
     * <p>vtableId(311)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnFilterMacro", dispId = 0x20e)
    void setOnFilterMacro(String param0);
            
    /**
     * <p>id(0x20f)</p>
     * <p>vtableId(312)</p>
     */
    @ComProperty(name = "OnApplyFilterMacro", dispId = 0x20f)
    String getOnApplyFilterMacro();
            
    /**
     * <p>id(0x20f)</p>
     * <p>vtableId(313)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnApplyFilterMacro", dispId = 0x20f)
    void setOnApplyFilterMacro(String param0);
            
    /**
     * <p>id(0x208)</p>
     * <p>vtableId(314)</p>
     */
    @ComProperty(name = "OnTimerMacro", dispId = 0x208)
    String getOnTimerMacro();
            
    /**
     * <p>id(0x208)</p>
     * <p>vtableId(315)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnTimerMacro", dispId = 0x208)
    void setOnTimerMacro(String param0);
            
    /**
     * <p>id(0x1ec)</p>
     * <p>vtableId(316)</p>
     */
    @ComProperty(name = "MouseWheelMacro", dispId = 0x1ec)
    String getMouseWheelMacro();
            
    /**
     * <p>id(0x1ec)</p>
     * <p>vtableId(317)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MouseWheelMacro", dispId = 0x1ec)
    void setMouseWheelMacro(String param0);
            
    /**
     * <p>id(0x22f)</p>
     * <p>vtableId(318)</p>
     */
    @ComProperty(name = "ShowPageMargins", dispId = 0x22f)
    Boolean getShowPageMargins();
            
    /**
     * <p>id(0x22f)</p>
     * <p>vtableId(319)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowPageMargins", dispId = 0x22f)
    void setShowPageMargins(Boolean param0);
            
    /**
     * <p>id(0x230)</p>
     * <p>vtableId(320)</p>
     */
    @ComProperty(name = "FitToPage", dispId = 0x230)
    Boolean getFitToPage();
            
    /**
     * <p>id(0x230)</p>
     * <p>vtableId(321)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FitToPage", dispId = 0x230)
    void setFitToPage(Boolean param0);
            
    /**
     * <p>id(0x233)</p>
     * <p>vtableId(322)</p>
     */
    @ComProperty(name = "AllowLayoutView", dispId = 0x233)
    Boolean getAllowLayoutView();
            
    /**
     * <p>id(0x233)</p>
     * <p>vtableId(323)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowLayoutView", dispId = 0x233)
    void setAllowLayoutView(Boolean param0);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(324)</p>
     */
    @ComProperty(name = "OnLoad", dispId = 0x7f)
    String getOnLoad();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(325)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnLoad", dispId = 0x7f)
    void setOnLoad(String param0);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(326)</p>
     */
    @ComProperty(name = "OnResize", dispId = 0x75)
    String getOnResize();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(327)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnResize", dispId = 0x75)
    void setOnResize(String param0);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(328)</p>
     */
    @ComProperty(name = "OnUnload", dispId = 0x80)
    String getOnUnload();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(329)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnUnload", dispId = 0x80)
    void setOnUnload(String param0);
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(330)</p>
     */
    @ComProperty(name = "OnGotFocus", dispId = 0x73)
    String getOnGotFocus();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(331)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnGotFocus", dispId = 0x73)
    void setOnGotFocus(String param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(332)</p>
     */
    @ComProperty(name = "OnLostFocus", dispId = 0x74)
    String getOnLostFocus();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(333)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnLostFocus", dispId = 0x74)
    void setOnLostFocus(String param0);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(334)</p>
     */
    @ComProperty(name = "OnClick", dispId = 0x7e)
    String getOnClick();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(335)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnClick", dispId = 0x7e)
    void setOnClick(String param0);
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(336)</p>
     */
    @ComProperty(name = "OnDblClick", dispId = 0xe0)
    String getOnDblClick();
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(337)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDblClick", dispId = 0xe0)
    void setOnDblClick(String param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(338)</p>
     */
    @ComProperty(name = "OnMouseDown", dispId = 0x6b)
    String getOnMouseDown();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(339)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseDown", dispId = 0x6b)
    void setOnMouseDown(String param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(340)</p>
     */
    @ComProperty(name = "OnMouseMove", dispId = 0x6d)
    String getOnMouseMove();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(341)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseMove", dispId = 0x6d)
    void setOnMouseMove(String param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(342)</p>
     */
    @ComProperty(name = "OnMouseUp", dispId = 0x6c)
    String getOnMouseUp();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(343)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseUp", dispId = 0x6c)
    void setOnMouseUp(String param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(344)</p>
     */
    @ComProperty(name = "OnKeyDown", dispId = 0x68)
    String getOnKeyDown();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(345)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyDown", dispId = 0x68)
    void setOnKeyDown(String param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(346)</p>
     */
    @ComProperty(name = "OnKeyUp", dispId = 0x69)
    String getOnKeyUp();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(347)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyUp", dispId = 0x69)
    void setOnKeyUp(String param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(348)</p>
     */
    @ComProperty(name = "OnKeyPress", dispId = 0x6a)
    String getOnKeyPress();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(349)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyPress", dispId = 0x6a)
    void setOnKeyPress(String param0);
            
    /**
     * <p>id(0x14d)</p>
     * <p>vtableId(350)</p>
     */
    @ComProperty(name = "OnFilter", dispId = 0x14d)
    String getOnFilter();
            
    /**
     * <p>id(0x14d)</p>
     * <p>vtableId(351)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnFilter", dispId = 0x14d)
    void setOnFilter(String param0);
            
    /**
     * <p>id(0x14e)</p>
     * <p>vtableId(352)</p>
     */
    @ComProperty(name = "OnApplyFilter", dispId = 0x14e)
    String getOnApplyFilter();
            
    /**
     * <p>id(0x14e)</p>
     * <p>vtableId(353)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnApplyFilter", dispId = 0x14e)
    void setOnApplyFilter(String param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(354)</p>
     */
    @ComProperty(name = "OnTimer", dispId = 0x6e)
    String getOnTimer();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(355)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnTimer", dispId = 0x6e)
    void setOnTimer(String param0);
            
    /**
     * <p>id(0x1b9)</p>
     * <p>vtableId(356)</p>
     */
    @ComProperty(name = "MouseWheel", dispId = 0x1b9)
    String getMouseWheel();
            
    /**
     * <p>id(0x1b9)</p>
     * <p>vtableId(357)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MouseWheel", dispId = 0x1b9)
    void setMouseWheel(String param0);
            
    /**
     * <p>id(0x231)</p>
     * <p>vtableId(358)</p>
     */
    @ComProperty(name = "DisplayOnSharePointSite", dispId = 0x231)
    Byte getDisplayOnSharePointSite();
            
    /**
     * <p>id(0x231)</p>
     * <p>vtableId(359)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "DisplayOnSharePointSite", dispId = 0x231)
    void setDisplayOnSharePointSite(Byte param0);
            
    /**
     * <p>id(0x9c4)</p>
     * <p>vtableId(360)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Section", dispId = 0x9c4)
    _Section getSection(Object Index);
            
    /**
     * <p>id(0x249)</p>
     * <p>vtableId(361)</p>
     */
    @ComProperty(name = "RibbonName", dispId = 0x249)
    String getRibbonName();
            
    /**
     * <p>id(0x249)</p>
     * <p>vtableId(362)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "RibbonName", dispId = 0x249)
    void setRibbonName(String param0);
            
    
}