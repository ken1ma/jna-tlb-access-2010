
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({E5135D80-8F8D-101B-AF4E-00AA003F0F07})</p>
 */
@ComInterface(iid="{E5135D80-8F8D-101B-AF4E-00AA003F0F07}")
public interface _Form extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xffffec78)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "accParent", dispId = 0xffffec78)
    com.sun.jna.platform.win32.COM.util.IDispatch getAccParent();
            
    /**
     * <p>id(0xffffec77)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "accChildCount", dispId = 0xffffec77)
    Integer getAccChildCount();
            
    /**
     * <p>id(0xffffec76)</p>
     * <p>vtableId(9)</p>
     * @param varChild [in] {@code Object}
     */
    @ComProperty(name = "accChild", dispId = 0xffffec76)
    com.sun.jna.platform.win32.COM.util.IDispatch getAccChild(Object varChild);
            
    /**
     * <p>id(0xffffec75)</p>
     * <p>vtableId(10)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accName", dispId = 0xffffec75)
    String getAccName(Object varChild);
            
    /**
     * <p>id(0xffffec74)</p>
     * <p>vtableId(11)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accValue", dispId = 0xffffec74)
    String getAccValue(Object varChild);
            
    /**
     * <p>id(0xffffec73)</p>
     * <p>vtableId(12)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accDescription", dispId = 0xffffec73)
    String getAccDescription(Object varChild);
            
    /**
     * <p>id(0xffffec72)</p>
     * <p>vtableId(13)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accRole", dispId = 0xffffec72)
    Object getAccRole(Object varChild);
            
    /**
     * <p>id(0xffffec71)</p>
     * <p>vtableId(14)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accState", dispId = 0xffffec71)
    Object getAccState(Object varChild);
            
    /**
     * <p>id(0xffffec70)</p>
     * <p>vtableId(15)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accHelp", dispId = 0xffffec70)
    String getAccHelp(Object varChild);
            
    /**
     * <p>id(0xffffec6f)</p>
     * <p>vtableId(16)</p>
     * @param pszHelpFile [out] {@code String}
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accHelpTopic", dispId = 0xffffec6f)
    Integer getAccHelpTopic(VARIANT pszHelpFile,
            Object varChild);
            
    /**
     * <p>id(0xffffec6e)</p>
     * <p>vtableId(17)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accKeyboardShortcut", dispId = 0xffffec6e)
    String getAccKeyboardShortcut(Object varChild);
            
    /**
     * <p>id(0xffffec6d)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "accFocus", dispId = 0xffffec6d)
    Object getAccFocus();
            
    /**
     * <p>id(0xffffec6c)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "accSelection", dispId = 0xffffec6c)
    Object getAccSelection();
            
    /**
     * <p>id(0xffffec6b)</p>
     * <p>vtableId(20)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accDefaultAction", dispId = 0xffffec6b)
    String getAccDefaultAction(Object varChild);
            
    /**
     * <p>id(0xffffec6a)</p>
     * <p>vtableId(21)</p>
     * @param flagsSelect [in] {@code Integer}
     * @param varChild [in, optional] {@code Object}
     */
    @ComMethod(name = "accSelect", dispId = 0xffffec6a)
    void accSelect(Integer flagsSelect,
            Object varChild);
            
    /**
     * <p>id(0xffffec69)</p>
     * <p>vtableId(22)</p>
     * @param pxLeft [out] {@code Integer}
     * @param pyTop [out] {@code Integer}
     * @param pcxWidth [out] {@code Integer}
     * @param pcyHeight [out] {@code Integer}
     * @param varChild [in, optional] {@code Object}
     */
    @ComMethod(name = "accLocation", dispId = 0xffffec69)
    void accLocation(VARIANT pxLeft,
            VARIANT pyTop,
            VARIANT pcxWidth,
            VARIANT pcyHeight,
            Object varChild);
            
    /**
     * <p>id(0xffffec68)</p>
     * <p>vtableId(23)</p>
     * @param navDir [in] {@code Integer}
     * @param varStart [in, optional] {@code Object}
     */
    @ComMethod(name = "accNavigate", dispId = 0xffffec68)
    Object accNavigate(Integer navDir,
            Object varStart);
            
    /**
     * <p>id(0xffffec67)</p>
     * <p>vtableId(24)</p>
     * @param xLeft [in] {@code Integer}
     * @param yTop [in] {@code Integer}
     */
    @ComMethod(name = "accHitTest", dispId = 0xffffec67)
    Object accHitTest(Integer xLeft,
            Integer yTop);
            
    /**
     * <p>id(0xffffec66)</p>
     * <p>vtableId(25)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComMethod(name = "accDoDefaultAction", dispId = 0xffffec66)
    void accDoDefaultAction(Object varChild);
            
    /**
     * <p>id(0xffffec75)</p>
     * <p>vtableId(26)</p>
     * @param varChild [in, optional] {@code Object}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "accName", dispId = 0xffffec75)
    void setAccName(Object varChild,
            String param1);
            
    /**
     * <p>id(0xffffec74)</p>
     * <p>vtableId(27)</p>
     * @param varChild [in, optional] {@code Object}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "accValue", dispId = 0xffffec74)
    void setAccValue(Object varChild,
            String param1);
            
    /**
     * <p>id(0x27)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "FormName", dispId = 0x27)
    String getFormName();
            
    /**
     * <p>id(0x27)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FormName", dispId = 0x27)
    void setFormName(String param0);
            
    /**
     * <p>id(0x9c)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "RecordSource", dispId = 0x9c)
    String getRecordSource();
            
    /**
     * <p>id(0x9c)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "RecordSource", dispId = 0x9c)
    void setRecordSource(String param0);
            
    /**
     * <p>id(0xf5)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Filter", dispId = 0xf5)
    String getFilter();
            
    /**
     * <p>id(0xf5)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Filter", dispId = 0xf5)
    void setFilter(String param0);
            
    /**
     * <p>id(0x14c)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "FilterOn", dispId = 0x14c)
    Boolean getFilterOn();
            
    /**
     * <p>id(0x14c)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FilterOn", dispId = 0x14c)
    void setFilterOn(Boolean param0);
            
    /**
     * <p>id(0x14b)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "OrderBy", dispId = 0x14b)
    String getOrderBy();
            
    /**
     * <p>id(0x14b)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OrderBy", dispId = 0x14b)
    void setOrderBy(String param0);
            
    /**
     * <p>id(0x150)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "OrderByOn", dispId = 0x150)
    Boolean getOrderByOn();
            
    /**
     * <p>id(0x150)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OrderByOn", dispId = 0x150)
    void setOrderByOn(Boolean param0);
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "AllowFilters", dispId = 0x1e)
    Boolean getAllowFilters();
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowFilters", dispId = 0x1e)
    void setAllowFilters(Boolean param0);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x11)
    String getCaption();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x11)
    void setCaption(String param0);
            
    /**
     * <p>id(0x93)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "DefaultView", dispId = 0x93)
    Byte getDefaultView();
            
    /**
     * <p>id(0x93)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "DefaultView", dispId = 0x93)
    void setDefaultView(Byte param0);
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "ViewsAllowed", dispId = 0x92)
    Byte getViewsAllowed();
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "ViewsAllowed", dispId = 0x92)
    void setViewsAllowed(Byte param0);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "AllowEditing", dispId = 0x18)
    Boolean getAllowEditing();
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowEditing", dispId = 0x18)
    void setAllowEditing(Boolean param0);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "DefaultEditing", dispId = 0x86)
    Short getDefaultEditing();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "DefaultEditing", dispId = 0x86)
    void setDefaultEditing(Short param0);
            
    /**
     * <p>id(0x153)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "AllowEdits", dispId = 0x153)
    Boolean getAllowEdits();
            
    /**
     * <p>id(0x153)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowEdits", dispId = 0x153)
    void setAllowEdits(Boolean param0);
            
    /**
     * <p>id(0x124)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "AllowDeletions", dispId = 0x124)
    Boolean getAllowDeletions();
            
    /**
     * <p>id(0x124)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowDeletions", dispId = 0x124)
    void setAllowDeletions(Boolean param0);
            
    /**
     * <p>id(0x146)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "AllowAdditions", dispId = 0x146)
    Boolean getAllowAdditions();
            
    /**
     * <p>id(0x146)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowAdditions", dispId = 0x146)
    void setAllowAdditions(Boolean param0);
            
    /**
     * <p>id(0x152)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "DataEntry", dispId = 0x152)
    Boolean getDataEntry();
            
    /**
     * <p>id(0x152)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DataEntry", dispId = 0x152)
    void setDataEntry(Boolean param0);
            
    /**
     * <p>id(0x2d)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "AllowUpdating", dispId = 0x2d)
    Byte getAllowUpdating();
            
    /**
     * <p>id(0x2d)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "AllowUpdating", dispId = 0x2d)
    void setAllowUpdating(Byte param0);
            
    /**
     * <p>id(0x151)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "RecordsetType", dispId = 0x151)
    Byte getRecordsetType();
            
    /**
     * <p>id(0x151)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "RecordsetType", dispId = 0x151)
    void setRecordsetType(Byte param0);
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "RecordLocks", dispId = 0x1a)
    Byte getRecordLocks();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "RecordLocks", dispId = 0x1a)
    void setRecordLocks(Byte param0);
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "ScrollBars", dispId = 0x98)
    Byte getScrollBars();
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "ScrollBars", dispId = 0x98)
    void setScrollBars(Byte param0);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "RecordSelectors", dispId = 0x13)
    Boolean getRecordSelectors();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(69)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RecordSelectors", dispId = 0x13)
    void setRecordSelectors(Boolean param0);
            
    /**
     * <p>id(0x117)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "NavigationButtons", dispId = 0x117)
    Boolean getNavigationButtons();
            
    /**
     * <p>id(0x117)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "NavigationButtons", dispId = 0x117)
    void setNavigationButtons(Boolean param0);
            
    /**
     * <p>id(0x13a)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "DividingLines", dispId = 0x13a)
    Boolean getDividingLines();
            
    /**
     * <p>id(0x13a)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DividingLines", dispId = 0x13a)
    void setDividingLines(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "AutoResize", dispId = 0x6)
    Boolean getAutoResize();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(75)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoResize", dispId = 0x6)
    void setAutoResize(Boolean param0);
            
    /**
     * <p>id(0x116)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "AutoCenter", dispId = 0x116)
    Boolean getAutoCenter();
            
    /**
     * <p>id(0x116)</p>
     * <p>vtableId(77)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoCenter", dispId = 0x116)
    void setAutoCenter(Boolean param0);
            
    /**
     * <p>id(0x5a)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "PopUp", dispId = 0x5a)
    Boolean getPopUp();
            
    /**
     * <p>id(0x5a)</p>
     * <p>vtableId(79)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PopUp", dispId = 0x5a)
    void setPopUp(Boolean param0);
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "Modal", dispId = 0x3e)
    Boolean getModal();
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(81)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Modal", dispId = 0x3e)
    void setModal(Boolean param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "BorderStyle", dispId = 0x9)
    Byte getBorderStyle();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(83)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "BorderStyle", dispId = 0x9)
    void setBorderStyle(Byte param0);
            
    /**
     * <p>id(0x61)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "ControlBox", dispId = 0x61)
    Boolean getControlBox();
            
    /**
     * <p>id(0x61)</p>
     * <p>vtableId(85)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ControlBox", dispId = 0x61)
    void setControlBox(Boolean param0);
            
    /**
     * <p>id(0x5f)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "MinButton", dispId = 0x5f)
    Boolean getMinButton();
            
    /**
     * <p>id(0x5f)</p>
     * <p>vtableId(87)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MinButton", dispId = 0x5f)
    void setMinButton(Boolean param0);
            
    /**
     * <p>id(0x5e)</p>
     * <p>vtableId(88)</p>
     */
    @ComProperty(name = "MaxButton", dispId = 0x5e)
    Boolean getMaxButton();
            
    /**
     * <p>id(0x5e)</p>
     * <p>vtableId(89)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MaxButton", dispId = 0x5e)
    void setMaxButton(Boolean param0);
            
    /**
     * <p>id(0x148)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "MinMaxButtons", dispId = 0x148)
    Byte getMinMaxButtons();
            
    /**
     * <p>id(0x148)</p>
     * <p>vtableId(91)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "MinMaxButtons", dispId = 0x148)
    void setMinMaxButtons(Byte param0);
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(92)</p>
     */
    @ComProperty(name = "CloseButton", dispId = 0x12f)
    Boolean getCloseButton();
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(93)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CloseButton", dispId = 0x12f)
    void setCloseButton(Boolean param0);
            
    /**
     * <p>id(0x60)</p>
     * <p>vtableId(94)</p>
     */
    @ComProperty(name = "WhatsThisButton", dispId = 0x60)
    Boolean getWhatsThisButton();
            
    /**
     * <p>id(0x60)</p>
     * <p>vtableId(95)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "WhatsThisButton", dispId = 0x60)
    void setWhatsThisButton(Boolean param0);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(96)</p>
     */
    @ComProperty(name = "Width", dispId = 0x96)
    Short getWidth();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(97)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Width", dispId = 0x96)
    void setWidth(Short param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(98)</p>
     */
    @ComProperty(name = "Picture", dispId = 0x7)
    String getPicture();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(99)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Picture", dispId = 0x7)
    void setPicture(String param0);
            
    /**
     * <p>id(0x155)</p>
     * <p>vtableId(100)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0x155)
    Byte getPictureType();
            
    /**
     * <p>id(0x155)</p>
     * <p>vtableId(101)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "PictureType", dispId = 0x155)
    void setPictureType(Byte param0);
            
    /**
     * <p>id(0x138)</p>
     * <p>vtableId(102)</p>
     */
    @ComProperty(name = "PictureSizeMode", dispId = 0x138)
    Byte getPictureSizeMode();
            
    /**
     * <p>id(0x138)</p>
     * <p>vtableId(103)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "PictureSizeMode", dispId = 0x138)
    void setPictureSizeMode(Byte param0);
            
    /**
     * <p>id(0x135)</p>
     * <p>vtableId(104)</p>
     */
    @ComProperty(name = "PictureAlignment", dispId = 0x135)
    Byte getPictureAlignment();
            
    /**
     * <p>id(0x135)</p>
     * <p>vtableId(105)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "PictureAlignment", dispId = 0x135)
    void setPictureAlignment(Byte param0);
            
    /**
     * <p>id(0x139)</p>
     * <p>vtableId(106)</p>
     */
    @ComProperty(name = "PictureTiling", dispId = 0x139)
    Boolean getPictureTiling();
            
    /**
     * <p>id(0x139)</p>
     * <p>vtableId(107)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PictureTiling", dispId = 0x139)
    void setPictureTiling(Boolean param0);
            
    /**
     * <p>id(0x14a)</p>
     * <p>vtableId(108)</p>
     */
    @ComProperty(name = "Cycle", dispId = 0x14a)
    Byte getCycle();
            
    /**
     * <p>id(0x14a)</p>
     * <p>vtableId(109)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "Cycle", dispId = 0x14a)
    void setCycle(Byte param0);
            
    /**
     * <p>id(0xf0)</p>
     * <p>vtableId(110)</p>
     */
    @ComProperty(name = "MenuBar", dispId = 0xf0)
    String getMenuBar();
            
    /**
     * <p>id(0xf0)</p>
     * <p>vtableId(111)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MenuBar", dispId = 0xf0)
    void setMenuBar(String param0);
            
    /**
     * <p>id(0x161)</p>
     * <p>vtableId(112)</p>
     */
    @ComProperty(name = "Toolbar", dispId = 0x161)
    String getToolbar();
            
    /**
     * <p>id(0x161)</p>
     * <p>vtableId(113)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Toolbar", dispId = 0x161)
    void setToolbar(String param0);
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(114)</p>
     */
    @ComProperty(name = "ShortcutMenu", dispId = 0x1f)
    Boolean getShortcutMenu();
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(115)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShortcutMenu", dispId = 0x1f)
    void setShortcutMenu(Boolean param0);
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(116)</p>
     */
    @ComProperty(name = "ShortcutMenuBar", dispId = 0x130)
    String getShortcutMenuBar();
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(117)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ShortcutMenuBar", dispId = 0x130)
    void setShortcutMenuBar(String param0);
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(118)</p>
     */
    @ComProperty(name = "GridX", dispId = 0x29)
    Short getGridX();
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(119)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "GridX", dispId = 0x29)
    void setGridX(Short param0);
            
    /**
     * <p>id(0x2a)</p>
     * <p>vtableId(120)</p>
     */
    @ComProperty(name = "GridY", dispId = 0x2a)
    Short getGridY();
            
    /**
     * <p>id(0x2a)</p>
     * <p>vtableId(121)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "GridY", dispId = 0x2a)
    void setGridY(Short param0);
            
    /**
     * <p>id(0x8f)</p>
     * <p>vtableId(122)</p>
     */
    @ComProperty(name = "LayoutForPrint", dispId = 0x8f)
    Boolean getLayoutForPrint();
            
    /**
     * <p>id(0x8f)</p>
     * <p>vtableId(123)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LayoutForPrint", dispId = 0x8f)
    void setLayoutForPrint(Boolean param0);
            
    /**
     * <p>id(0x90)</p>
     * <p>vtableId(124)</p>
     */
    @ComProperty(name = "FastLaserPrinting", dispId = 0x90)
    Boolean getFastLaserPrinting();
            
    /**
     * <p>id(0x90)</p>
     * <p>vtableId(125)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FastLaserPrinting", dispId = 0x90)
    void setFastLaserPrinting(Boolean param0);
            
    /**
     * <p>id(0xda)</p>
     * <p>vtableId(126)</p>
     */
    @ComProperty(name = "HelpFile", dispId = 0xda)
    String getHelpFile();
            
    /**
     * <p>id(0xda)</p>
     * <p>vtableId(127)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HelpFile", dispId = 0xda)
    void setHelpFile(String param0);
            
    /**
     * <p>id(0xdb)</p>
     * <p>vtableId(128)</p>
     */
    @ComProperty(name = "HelpContextId", dispId = 0xdb)
    Integer getHelpContextId();
            
    /**
     * <p>id(0xdb)</p>
     * <p>vtableId(129)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HelpContextId", dispId = 0xdb)
    void setHelpContextId(Integer param0);
            
    /**
     * <p>id(0xa8)</p>
     * <p>vtableId(130)</p>
     */
    @ComProperty(name = "RowHeight", dispId = 0xa8)
    Short getRowHeight();
            
    /**
     * <p>id(0xa8)</p>
     * <p>vtableId(131)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "RowHeight", dispId = 0xa8)
    void setRowHeight(Short param0);
            
    /**
     * <p>id(0xa0)</p>
     * <p>vtableId(132)</p>
     */
    @ComProperty(name = "DatasheetFontName", dispId = 0xa0)
    String getDatasheetFontName();
            
    /**
     * <p>id(0xa0)</p>
     * <p>vtableId(133)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DatasheetFontName", dispId = 0xa0)
    void setDatasheetFontName(String param0);
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(134)</p>
     */
    @ComProperty(name = "DatasheetFontHeight", dispId = 0xa1)
    Short getDatasheetFontHeight();
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(135)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "DatasheetFontHeight", dispId = 0xa1)
    void setDatasheetFontHeight(Short param0);
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(136)</p>
     */
    @ComProperty(name = "DatasheetFontWeight", dispId = 0xa2)
    Short getDatasheetFontWeight();
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(137)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "DatasheetFontWeight", dispId = 0xa2)
    void setDatasheetFontWeight(Short param0);
            
    /**
     * <p>id(0xa3)</p>
     * <p>vtableId(138)</p>
     */
    @ComProperty(name = "DatasheetFontItalic", dispId = 0xa3)
    Boolean getDatasheetFontItalic();
            
    /**
     * <p>id(0xa3)</p>
     * <p>vtableId(139)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DatasheetFontItalic", dispId = 0xa3)
    void setDatasheetFontItalic(Boolean param0);
            
    /**
     * <p>id(0xa4)</p>
     * <p>vtableId(140)</p>
     */
    @ComProperty(name = "DatasheetFontUnderline", dispId = 0xa4)
    Boolean getDatasheetFontUnderline();
            
    /**
     * <p>id(0xa4)</p>
     * <p>vtableId(141)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DatasheetFontUnderline", dispId = 0xa4)
    void setDatasheetFontUnderline(Boolean param0);
            
    /**
     * <p>id(0xc2)</p>
     * <p>vtableId(142)</p>
     */
    @ComProperty(name = "TabularCharSet", dispId = 0xc2)
    Byte getTabularCharSet();
            
    /**
     * <p>id(0xc2)</p>
     * <p>vtableId(143)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "TabularCharSet", dispId = 0xc2)
    void setTabularCharSet(Byte param0);
            
    /**
     * <p>id(0x13e)</p>
     * <p>vtableId(144)</p>
     */
    @ComProperty(name = "DatasheetGridlinesBehavior", dispId = 0x13e)
    Byte getDatasheetGridlinesBehavior();
            
    /**
     * <p>id(0x13e)</p>
     * <p>vtableId(145)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "DatasheetGridlinesBehavior", dispId = 0x13e)
    void setDatasheetGridlinesBehavior(Byte param0);
            
    /**
     * <p>id(0x13f)</p>
     * <p>vtableId(146)</p>
     */
    @ComProperty(name = "DatasheetGridlinesColor", dispId = 0x13f)
    Integer getDatasheetGridlinesColor();
            
    /**
     * <p>id(0x13f)</p>
     * <p>vtableId(147)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DatasheetGridlinesColor", dispId = 0x13f)
    void setDatasheetGridlinesColor(Integer param0);
            
    /**
     * <p>id(0x140)</p>
     * <p>vtableId(148)</p>
     */
    @ComProperty(name = "DatasheetCellsEffect", dispId = 0x140)
    Byte getDatasheetCellsEffect();
            
    /**
     * <p>id(0x140)</p>
     * <p>vtableId(149)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "DatasheetCellsEffect", dispId = 0x140)
    void setDatasheetCellsEffect(Byte param0);
            
    /**
     * <p>id(0x132)</p>
     * <p>vtableId(150)</p>
     */
    @ComProperty(name = "DatasheetForeColor", dispId = 0x132)
    Integer getDatasheetForeColor();
            
    /**
     * <p>id(0x132)</p>
     * <p>vtableId(151)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DatasheetForeColor", dispId = 0x132)
    void setDatasheetForeColor(Integer param0);
            
    /**
     * <p>id(0xa9)</p>
     * <p>vtableId(152)</p>
     */
    @ComProperty(name = "ShowGrid", dispId = 0xa9)
    Boolean getShowGrid();
            
    /**
     * <p>id(0xa9)</p>
     * <p>vtableId(153)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowGrid", dispId = 0xa9)
    void setShowGrid(Boolean param0);
            
    /**
     * <p>id(0x141)</p>
     * <p>vtableId(154)</p>
     */
    @ComProperty(name = "DatasheetBackColor", dispId = 0x141)
    Integer getDatasheetBackColor();
            
    /**
     * <p>id(0x141)</p>
     * <p>vtableId(155)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DatasheetBackColor", dispId = 0x141)
    void setDatasheetBackColor(Integer param0);
            
    /**
     * <p>id(0xc0)</p>
     * <p>vtableId(156)</p>
     */
    @ComProperty(name = "Hwnd", dispId = 0xc0)
    Integer getHwnd();
            
    /**
     * <p>id(0xc0)</p>
     * <p>vtableId(157)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Hwnd", dispId = 0xc0)
    void setHwnd(Integer param0);
            
    /**
     * <p>id(0xc3)</p>
     * <p>vtableId(158)</p>
     */
    @ComProperty(name = "Count", dispId = 0xc3)
    Short getCount();
            
    /**
     * <p>id(0xc3)</p>
     * <p>vtableId(159)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Count", dispId = 0xc3)
    void setCount(Short param0);
            
    /**
     * <p>id(0xc4)</p>
     * <p>vtableId(160)</p>
     */
    @ComProperty(name = "Page", dispId = 0xc4)
    Integer getPage();
            
    /**
     * <p>id(0xc4)</p>
     * <p>vtableId(161)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Page", dispId = 0xc4)
    void setPage(Integer param0);
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(162)</p>
     */
    @ComProperty(name = "Pages", dispId = 0xc5)
    Short getPages();
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(163)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Pages", dispId = 0xc5)
    void setPages(Short param0);
            
    /**
     * <p>id(0xc6)</p>
     * <p>vtableId(164)</p>
     */
    @ComProperty(name = "LogicalPageWidth", dispId = 0xc6)
    Integer getLogicalPageWidth();
            
    /**
     * <p>id(0xc6)</p>
     * <p>vtableId(165)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LogicalPageWidth", dispId = 0xc6)
    void setLogicalPageWidth(Integer param0);
            
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(166)</p>
     */
    @ComProperty(name = "LogicalPageHeight", dispId = 0xc7)
    Integer getLogicalPageHeight();
            
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(167)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LogicalPageHeight", dispId = 0xc7)
    void setLogicalPageHeight(Integer param0);
            
    /**
     * <p>id(0xd9)</p>
     * <p>vtableId(168)</p>
     */
    @ComProperty(name = "ZoomControl", dispId = 0xd9)
    Integer getZoomControl();
            
    /**
     * <p>id(0xd9)</p>
     * <p>vtableId(169)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ZoomControl", dispId = 0xd9)
    void setZoomControl(Integer param0);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(170)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    Boolean getVisible();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(171)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0xf1)</p>
     * <p>vtableId(172)</p>
     */
    @ComProperty(name = "Painting", dispId = 0xf1)
    Boolean getPainting();
            
    /**
     * <p>id(0xf1)</p>
     * <p>vtableId(173)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Painting", dispId = 0xf1)
    void setPainting(Boolean param0);
            
    /**
     * <p>id(0xbd)</p>
     * <p>vtableId(174)</p>
     */
    @ComProperty(name = "PrtMip", dispId = 0xbd)
    Object getPrtMip();
            
    /**
     * <p>id(0xbd)</p>
     * <p>vtableId(175)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PrtMip", dispId = 0xbd)
    void setPrtMip(Object param0);
            
    /**
     * <p>id(0xbe)</p>
     * <p>vtableId(176)</p>
     */
    @ComProperty(name = "PrtDevMode", dispId = 0xbe)
    Object getPrtDevMode();
            
    /**
     * <p>id(0xbe)</p>
     * <p>vtableId(177)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PrtDevMode", dispId = 0xbe)
    void setPrtDevMode(Object param0);
            
    /**
     * <p>id(0xbf)</p>
     * <p>vtableId(178)</p>
     */
    @ComProperty(name = "PrtDevNames", dispId = 0xbf)
    Object getPrtDevNames();
            
    /**
     * <p>id(0xbf)</p>
     * <p>vtableId(179)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PrtDevNames", dispId = 0xbf)
    void setPrtDevNames(Object param0);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(180)</p>
     */
    @ComProperty(name = "FrozenColumns", dispId = 0xaa)
    Short getFrozenColumns();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(181)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "FrozenColumns", dispId = 0xaa)
    void setFrozenColumns(Short param0);
            
    /**
     * <p>id(0xe6)</p>
     * <p>vtableId(182)</p>
     */
    @ComProperty(name = "Bookmark", dispId = 0xe6)
    Object getBookmark();
            
    /**
     * <p>id(0xe6)</p>
     * <p>vtableId(183)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Bookmark", dispId = 0xe6)
    void setBookmark(Object param0);
            
    /**
     * <p>id(0xf4)</p>
     * <p>vtableId(184)</p>
     */
    @ComProperty(name = "TabularFamily", dispId = 0xf4)
    Byte getTabularFamily();
            
    /**
     * <p>id(0xf4)</p>
     * <p>vtableId(185)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "TabularFamily", dispId = 0xf4)
    void setTabularFamily(Byte param0);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(186)</p>
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    String get_Name();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(187)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    void set_Name(String param0);
            
    /**
     * <p>id(0x62)</p>
     * <p>vtableId(188)</p>
     */
    @ComProperty(name = "PaletteSource", dispId = 0x62)
    String getPaletteSource();
            
    /**
     * <p>id(0x62)</p>
     * <p>vtableId(189)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PaletteSource", dispId = 0x62)
    void setPaletteSource(String param0);
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(190)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    String getTag();
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(191)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    void setTag(String param0);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(192)</p>
     */
    @ComProperty(name = "PaintPalette", dispId = 0x64)
    Object getPaintPalette();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(193)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PaintPalette", dispId = 0x64)
    void setPaintPalette(Object param0);
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(194)</p>
     */
    @ComProperty(name = "OnMenu", dispId = 0x3c)
    String getOnMenu();
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(195)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMenu", dispId = 0x3c)
    void setOnMenu(String param0);
            
    /**
     * <p>id(0x11c)</p>
     * <p>vtableId(196)</p>
     */
    @ComProperty(name = "OpenArgs", dispId = 0x11c)
    Object getOpenArgs();
            
    /**
     * <p>id(0x11c)</p>
     * <p>vtableId(197)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "OpenArgs", dispId = 0x11c)
    void setOpenArgs(Object param0);
            
    /**
     * <p>id(0x11d)</p>
     * <p>vtableId(198)</p>
     */
    @ComProperty(name = "ConnectSynch", dispId = 0x11d)
    Short getConnectSynch();
            
    /**
     * <p>id(0x11d)</p>
     * <p>vtableId(199)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "ConnectSynch", dispId = 0x11d)
    void setConnectSynch(Short param0);
            
    /**
     * <p>id(0x57)</p>
     * <p>vtableId(200)</p>
     */
    @ComProperty(name = "OnCurrent", dispId = 0x57)
    String getOnCurrent();
            
    /**
     * <p>id(0x57)</p>
     * <p>vtableId(201)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnCurrent", dispId = 0x57)
    void setOnCurrent(String param0);
            
    /**
     * <p>id(0x51)</p>
     * <p>vtableId(202)</p>
     */
    @ComProperty(name = "OnInsert", dispId = 0x51)
    String getOnInsert();
            
    /**
     * <p>id(0x51)</p>
     * <p>vtableId(203)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnInsert", dispId = 0x51)
    void setOnInsert(String param0);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(204)</p>
     */
    @ComProperty(name = "BeforeInsert", dispId = 0x7a)
    String getBeforeInsert();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(205)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BeforeInsert", dispId = 0x7a)
    void setBeforeInsert(String param0);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(206)</p>
     */
    @ComProperty(name = "AfterInsert", dispId = 0x7b)
    String getAfterInsert();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(207)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AfterInsert", dispId = 0x7b)
    void setAfterInsert(String param0);
            
    /**
     * <p>id(0x55)</p>
     * <p>vtableId(208)</p>
     */
    @ComProperty(name = "BeforeUpdate", dispId = 0x55)
    String getBeforeUpdate();
            
    /**
     * <p>id(0x55)</p>
     * <p>vtableId(209)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BeforeUpdate", dispId = 0x55)
    void setBeforeUpdate(String param0);
            
    /**
     * <p>id(0x56)</p>
     * <p>vtableId(210)</p>
     */
    @ComProperty(name = "AfterUpdate", dispId = 0x56)
    String getAfterUpdate();
            
    /**
     * <p>id(0x56)</p>
     * <p>vtableId(211)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AfterUpdate", dispId = 0x56)
    void setAfterUpdate(String param0);
            
    /**
     * <p>id(0x177)</p>
     * <p>vtableId(212)</p>
     */
    @ComProperty(name = "OnDirty", dispId = 0x177)
    String getOnDirty();
            
    /**
     * <p>id(0x177)</p>
     * <p>vtableId(213)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDirty", dispId = 0x177)
    void setOnDirty(String param0);
            
    /**
     * <p>id(0x4f)</p>
     * <p>vtableId(214)</p>
     */
    @ComProperty(name = "OnDelete", dispId = 0x4f)
    String getOnDelete();
            
    /**
     * <p>id(0x4f)</p>
     * <p>vtableId(215)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDelete", dispId = 0x4f)
    void setOnDelete(String param0);
            
    /**
     * <p>id(0x7c)</p>
     * <p>vtableId(216)</p>
     */
    @ComProperty(name = "BeforeDelConfirm", dispId = 0x7c)
    String getBeforeDelConfirm();
            
    /**
     * <p>id(0x7c)</p>
     * <p>vtableId(217)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BeforeDelConfirm", dispId = 0x7c)
    void setBeforeDelConfirm(String param0);
            
    /**
     * <p>id(0x7d)</p>
     * <p>vtableId(218)</p>
     */
    @ComProperty(name = "AfterDelConfirm", dispId = 0x7d)
    String getAfterDelConfirm();
            
    /**
     * <p>id(0x7d)</p>
     * <p>vtableId(219)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AfterDelConfirm", dispId = 0x7d)
    void setAfterDelConfirm(String param0);
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(220)</p>
     */
    @ComProperty(name = "OnOpen", dispId = 0x4d)
    String getOnOpen();
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(221)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnOpen", dispId = 0x4d)
    void setOnOpen(String param0);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(222)</p>
     */
    @ComProperty(name = "OnLoad", dispId = 0x7f)
    String getOnLoad();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(223)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnLoad", dispId = 0x7f)
    void setOnLoad(String param0);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(224)</p>
     */
    @ComProperty(name = "OnResize", dispId = 0x75)
    String getOnResize();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(225)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnResize", dispId = 0x75)
    void setOnResize(String param0);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(226)</p>
     */
    @ComProperty(name = "OnUnload", dispId = 0x80)
    String getOnUnload();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(227)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnUnload", dispId = 0x80)
    void setOnUnload(String param0);
            
    /**
     * <p>id(0x4e)</p>
     * <p>vtableId(228)</p>
     */
    @ComProperty(name = "OnClose", dispId = 0x4e)
    String getOnClose();
            
    /**
     * <p>id(0x4e)</p>
     * <p>vtableId(229)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnClose", dispId = 0x4e)
    void setOnClose(String param0);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(230)</p>
     */
    @ComProperty(name = "OnActivate", dispId = 0x70)
    String getOnActivate();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(231)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnActivate", dispId = 0x70)
    void setOnActivate(String param0);
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(232)</p>
     */
    @ComProperty(name = "OnDeactivate", dispId = 0x71)
    String getOnDeactivate();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(233)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDeactivate", dispId = 0x71)
    void setOnDeactivate(String param0);
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(234)</p>
     */
    @ComProperty(name = "OnGotFocus", dispId = 0x73)
    String getOnGotFocus();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(235)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnGotFocus", dispId = 0x73)
    void setOnGotFocus(String param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(236)</p>
     */
    @ComProperty(name = "OnLostFocus", dispId = 0x74)
    String getOnLostFocus();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(237)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnLostFocus", dispId = 0x74)
    void setOnLostFocus(String param0);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(238)</p>
     */
    @ComProperty(name = "OnClick", dispId = 0x7e)
    String getOnClick();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(239)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnClick", dispId = 0x7e)
    void setOnClick(String param0);
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(240)</p>
     */
    @ComProperty(name = "OnDblClick", dispId = 0xe0)
    String getOnDblClick();
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(241)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDblClick", dispId = 0xe0)
    void setOnDblClick(String param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(242)</p>
     */
    @ComProperty(name = "OnMouseDown", dispId = 0x6b)
    String getOnMouseDown();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(243)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseDown", dispId = 0x6b)
    void setOnMouseDown(String param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(244)</p>
     */
    @ComProperty(name = "OnMouseMove", dispId = 0x6d)
    String getOnMouseMove();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(245)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseMove", dispId = 0x6d)
    void setOnMouseMove(String param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(246)</p>
     */
    @ComProperty(name = "OnMouseUp", dispId = 0x6c)
    String getOnMouseUp();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(247)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseUp", dispId = 0x6c)
    void setOnMouseUp(String param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(248)</p>
     */
    @ComProperty(name = "OnKeyDown", dispId = 0x68)
    String getOnKeyDown();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(249)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyDown", dispId = 0x68)
    void setOnKeyDown(String param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(250)</p>
     */
    @ComProperty(name = "OnKeyUp", dispId = 0x69)
    String getOnKeyUp();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(251)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyUp", dispId = 0x69)
    void setOnKeyUp(String param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(252)</p>
     */
    @ComProperty(name = "OnKeyPress", dispId = 0x6a)
    String getOnKeyPress();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(253)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyPress", dispId = 0x6a)
    void setOnKeyPress(String param0);
            
    /**
     * <p>id(0x147)</p>
     * <p>vtableId(254)</p>
     */
    @ComProperty(name = "KeyPreview", dispId = 0x147)
    Boolean getKeyPreview();
            
    /**
     * <p>id(0x147)</p>
     * <p>vtableId(255)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "KeyPreview", dispId = 0x147)
    void setKeyPreview(Boolean param0);
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(256)</p>
     */
    @ComProperty(name = "OnError", dispId = 0x77)
    String getOnError();
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(257)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnError", dispId = 0x77)
    void setOnError(String param0);
            
    /**
     * <p>id(0x14d)</p>
     * <p>vtableId(258)</p>
     */
    @ComProperty(name = "OnFilter", dispId = 0x14d)
    String getOnFilter();
            
    /**
     * <p>id(0x14d)</p>
     * <p>vtableId(259)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnFilter", dispId = 0x14d)
    void setOnFilter(String param0);
            
    /**
     * <p>id(0x14e)</p>
     * <p>vtableId(260)</p>
     */
    @ComProperty(name = "OnApplyFilter", dispId = 0x14e)
    String getOnApplyFilter();
            
    /**
     * <p>id(0x14e)</p>
     * <p>vtableId(261)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnApplyFilter", dispId = 0x14e)
    void setOnApplyFilter(String param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(262)</p>
     */
    @ComProperty(name = "OnTimer", dispId = 0x6e)
    String getOnTimer();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(263)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnTimer", dispId = 0x6e)
    void setOnTimer(String param0);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(264)</p>
     */
    @ComProperty(name = "TimerInterval", dispId = 0x6f)
    Integer getTimerInterval();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(265)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "TimerInterval", dispId = 0x6f)
    void setTimerInterval(Integer param0);
            
    /**
     * <p>id(0x11e)</p>
     * <p>vtableId(266)</p>
     */
    @ComProperty(name = "Dirty", dispId = 0x11e)
    Boolean getDirty();
            
    /**
     * <p>id(0x11e)</p>
     * <p>vtableId(267)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Dirty", dispId = 0x11e)
    void setDirty(Boolean param0);
            
    /**
     * <p>id(0x11f)</p>
     * <p>vtableId(268)</p>
     */
    @ComProperty(name = "WindowWidth", dispId = 0x11f)
    Short getWindowWidth();
            
    /**
     * <p>id(0x11f)</p>
     * <p>vtableId(269)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "WindowWidth", dispId = 0x11f)
    void setWindowWidth(Short param0);
            
    /**
     * <p>id(0x120)</p>
     * <p>vtableId(270)</p>
     */
    @ComProperty(name = "WindowHeight", dispId = 0x120)
    Short getWindowHeight();
            
    /**
     * <p>id(0x120)</p>
     * <p>vtableId(271)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "WindowHeight", dispId = 0x120)
    void setWindowHeight(Short param0);
            
    /**
     * <p>id(0x121)</p>
     * <p>vtableId(272)</p>
     */
    @ComProperty(name = "CurrentView", dispId = 0x121)
    Short getCurrentView();
            
    /**
     * <p>id(0x121)</p>
     * <p>vtableId(273)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "CurrentView", dispId = 0x121)
    void setCurrentView(Short param0);
            
    /**
     * <p>id(0x123)</p>
     * <p>vtableId(274)</p>
     */
    @ComProperty(name = "CurrentSectionTop", dispId = 0x123)
    Short getCurrentSectionTop();
            
    /**
     * <p>id(0x123)</p>
     * <p>vtableId(275)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "CurrentSectionTop", dispId = 0x123)
    void setCurrentSectionTop(Short param0);
            
    /**
     * <p>id(0x122)</p>
     * <p>vtableId(276)</p>
     */
    @ComProperty(name = "CurrentSectionLeft", dispId = 0x122)
    Short getCurrentSectionLeft();
            
    /**
     * <p>id(0x122)</p>
     * <p>vtableId(277)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "CurrentSectionLeft", dispId = 0x122)
    void setCurrentSectionLeft(Short param0);
            
    /**
     * <p>id(0x12a)</p>
     * <p>vtableId(278)</p>
     */
    @ComProperty(name = "SelLeft", dispId = 0x12a)
    Integer getSelLeft();
            
    /**
     * <p>id(0x12a)</p>
     * <p>vtableId(279)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SelLeft", dispId = 0x12a)
    void setSelLeft(Integer param0);
            
    /**
     * <p>id(0x12b)</p>
     * <p>vtableId(280)</p>
     */
    @ComProperty(name = "SelTop", dispId = 0x12b)
    Integer getSelTop();
            
    /**
     * <p>id(0x12b)</p>
     * <p>vtableId(281)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SelTop", dispId = 0x12b)
    void setSelTop(Integer param0);
            
    /**
     * <p>id(0x12c)</p>
     * <p>vtableId(282)</p>
     */
    @ComProperty(name = "SelWidth", dispId = 0x12c)
    Integer getSelWidth();
            
    /**
     * <p>id(0x12c)</p>
     * <p>vtableId(283)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SelWidth", dispId = 0x12c)
    void setSelWidth(Integer param0);
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(284)</p>
     */
    @ComProperty(name = "SelHeight", dispId = 0x12d)
    Integer getSelHeight();
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(285)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SelHeight", dispId = 0x12d)
    void setSelHeight(Integer param0);
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(286)</p>
     */
    @ComProperty(name = "CurrentRecord", dispId = 0x12e)
    Integer getCurrentRecord();
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(287)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "CurrentRecord", dispId = 0x12e)
    void setCurrentRecord(Integer param0);
            
    /**
     * <p>id(0xbc)</p>
     * <p>vtableId(288)</p>
     */
    @ComProperty(name = "PictureData", dispId = 0xbc)
    Object getPictureData();
            
    /**
     * <p>id(0xbc)</p>
     * <p>vtableId(289)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PictureData", dispId = 0xbc)
    void setPictureData(Object param0);
            
    /**
     * <p>id(0x13b)</p>
     * <p>vtableId(290)</p>
     */
    @ComProperty(name = "InsideHeight", dispId = 0x13b)
    Integer getInsideHeight();
            
    /**
     * <p>id(0x13b)</p>
     * <p>vtableId(291)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "InsideHeight", dispId = 0x13b)
    void setInsideHeight(Integer param0);
            
    /**
     * <p>id(0x13c)</p>
     * <p>vtableId(292)</p>
     */
    @ComProperty(name = "InsideWidth", dispId = 0x13c)
    Integer getInsideWidth();
            
    /**
     * <p>id(0x13c)</p>
     * <p>vtableId(293)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "InsideWidth", dispId = 0x13c)
    void setInsideWidth(Integer param0);
            
    /**
     * <p>id(0x137)</p>
     * <p>vtableId(294)</p>
     */
    @ComProperty(name = "PicturePalette", dispId = 0x137)
    Object getPicturePalette();
            
    /**
     * <p>id(0x137)</p>
     * <p>vtableId(295)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PicturePalette", dispId = 0x137)
    void setPicturePalette(Object param0);
            
    /**
     * <p>id(0x156)</p>
     * <p>vtableId(296)</p>
     */
    @ComProperty(name = "HasModule", dispId = 0x156)
    Boolean getHasModule();
            
    /**
     * <p>id(0x156)</p>
     * <p>vtableId(297)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasModule", dispId = 0x156)
    void setHasModule(Boolean param0);
            
    /**
     * <p>id(0x16d)</p>
     * <p>vtableId(298)</p>
     */
    @ComProperty(name = "acHiddenCurrentPage", dispId = 0x16d)
    Integer getAcHiddenCurrentPage();
            
    /**
     * <p>id(0x16d)</p>
     * <p>vtableId(299)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "acHiddenCurrentPage", dispId = 0x16d)
    void setAcHiddenCurrentPage(Integer param0);
            
    /**
     * <p>id(0x172)</p>
     * <p>vtableId(300)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x172)
    Byte getOrientation();
            
    /**
     * <p>id(0x172)</p>
     * <p>vtableId(301)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "Orientation", dispId = 0x172)
    void setOrientation(Byte param0);
            
    /**
     * <p>id(0x175)</p>
     * <p>vtableId(302)</p>
     */
    @ComProperty(name = "AllowDesignChanges", dispId = 0x175)
    Boolean getAllowDesignChanges();
            
    /**
     * <p>id(0x175)</p>
     * <p>vtableId(303)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowDesignChanges", dispId = 0x175)
    void setAllowDesignChanges(Boolean param0);
            
    /**
     * <p>id(0xf6)</p>
     * <p>vtableId(304)</p>
     */
    @ComProperty(name = "ServerFilter", dispId = 0xf6)
    String getServerFilter();
            
    /**
     * <p>id(0xf6)</p>
     * <p>vtableId(305)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ServerFilter", dispId = 0xf6)
    void setServerFilter(String param0);
            
    /**
     * <p>id(0xf7)</p>
     * <p>vtableId(306)</p>
     */
    @ComProperty(name = "ServerFilterByForm", dispId = 0xf7)
    Boolean getServerFilterByForm();
            
    /**
     * <p>id(0xf7)</p>
     * <p>vtableId(307)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ServerFilterByForm", dispId = 0xf7)
    void setServerFilterByForm(Boolean param0);
            
    /**
     * <p>id(0x169)</p>
     * <p>vtableId(308)</p>
     */
    @ComProperty(name = "MaxRecords", dispId = 0x169)
    Integer getMaxRecords();
            
    /**
     * <p>id(0x169)</p>
     * <p>vtableId(309)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MaxRecords", dispId = 0x169)
    void setMaxRecords(Integer param0);
            
    /**
     * <p>id(0x41)</p>
     * <p>vtableId(310)</p>
     */
    @ComProperty(name = "UniqueTable", dispId = 0x41)
    String getUniqueTable();
            
    /**
     * <p>id(0x41)</p>
     * <p>vtableId(311)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "UniqueTable", dispId = 0x41)
    void setUniqueTable(String param0);
            
    /**
     * <p>id(0x40)</p>
     * <p>vtableId(312)</p>
     */
    @ComProperty(name = "ResyncCommand", dispId = 0x40)
    String getResyncCommand();
            
    /**
     * <p>id(0x40)</p>
     * <p>vtableId(313)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ResyncCommand", dispId = 0x40)
    void setResyncCommand(String param0);
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(314)</p>
     */
    @ComProperty(name = "InputParameters", dispId = 0x42)
    String getInputParameters();
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(315)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "InputParameters", dispId = 0x42)
    void setInputParameters(String param0);
            
    /**
     * <p>id(0x3f)</p>
     * <p>vtableId(316)</p>
     */
    @ComProperty(name = "MaxRecButton", dispId = 0x3f)
    Boolean getMaxRecButton();
            
    /**
     * <p>id(0x3f)</p>
     * <p>vtableId(317)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MaxRecButton", dispId = 0x3f)
    void setMaxRecButton(Boolean param0);
            
    /**
     * <p>id(0x7d5)</p>
     * <p>vtableId(318)</p>
     */
    @ComProperty(name = "Application", dispId = 0x7d5)
    Application getApplication();
            
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(319)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x863)</p>
     * <p>vtableId(320)</p>
     */
    @ComProperty(name = "NewRecord", dispId = 0x863)
    Short getNewRecord();
            
    /**
     * <p>id(0x861)</p>
     * <p>vtableId(321)</p>
     */
    @ComMethod(name = "Undo", dispId = 0x861)
    void Undo();
            
    /**
     * <p>id(0x7d6)</p>
     * <p>vtableId(322)</p>
     */
    @ComProperty(name = "ActiveControl", dispId = 0x7d6)
    Control getActiveControl();
            
    /**
     * <p>id(0x866)</p>
     * <p>vtableId(323)</p>
     * @param ControlType [in] {@code Integer}
     */
    @ComProperty(name = "DefaultControl", dispId = 0x866)
    Control getDefaultControl(Integer ControlType);
            
    /**
     * <p>id(0x825)</p>
     * <p>vtableId(324)</p>
     */
    @ComProperty(name = "Dynaset", dispId = 0x825)
    com.sun.jna.platform.win32.COM.util.IDispatch getDynaset();
            
    /**
     * <p>id(0x826)</p>
     * <p>vtableId(325)</p>
     */
    @ComProperty(name = "RecordsetClone", dispId = 0x826)
    com.sun.jna.platform.win32.COM.util.IDispatch getRecordsetClone();
            
    /**
     * <p>id(0x894)</p>
     * <p>vtableId(326)</p>
     */
    @ComProperty(name = "Recordset", dispId = 0x894)
    com.sun.jna.platform.win32.COM.util.IDispatch getRecordset();
            
    /**
     * <p>id(0x828)</p>
     * <p>vtableId(328)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Section", dispId = 0x828)
    Section getSection(Object Index);
            
    /**
     * <p>id(0x829)</p>
     * <p>vtableId(329)</p>
     */
    @ComProperty(name = "Form", dispId = 0x829)
    Form getForm();
            
    /**
     * <p>id(0x82a)</p>
     * <p>vtableId(330)</p>
     */
    @ComProperty(name = "Module", dispId = 0x82a)
    Module getModule();
            
    /**
     * <p>id(0x82b)</p>
     * <p>vtableId(331)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x82b)
    Properties getProperties();
            
    /**
     * <p>id(0x82c)</p>
     * <p>vtableId(332)</p>
     */
    @ComProperty(name = "ConnectControl", dispId = 0x82c)
    Control getConnectControl();
            
    /**
     * <p>id(0x7e1)</p>
     * <p>vtableId(333)</p>
     */
    @ComMethod(name = "Recalc", dispId = 0x7e1)
    void Recalc();
            
    /**
     * <p>id(0x7e2)</p>
     * <p>vtableId(334)</p>
     */
    @ComMethod(name = "Requery", dispId = 0x7e2)
    void Requery();
            
    /**
     * <p>id(0xfffffdda)</p>
     * <p>vtableId(335)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0xfffffdda)
    void Refresh();
            
    /**
     * <p>id(0x7e4)</p>
     * <p>vtableId(336)</p>
     */
    @ComMethod(name = "Repaint", dispId = 0x7e4)
    void Repaint();
            
    /**
     * <p>id(0x7e5)</p>
     * <p>vtableId(337)</p>
     * @param PageNumber [in] {@code Integer}
     * @param Right [in, optional] {@code Integer}
     * @param Down [in, optional] {@code Integer}
     */
    @ComMethod(name = "GoToPage", dispId = 0x7e5)
    void GoToPage(Integer PageNumber,
            Integer Right,
            Integer Down);
            
    /**
     * <p>id(0x7e6)</p>
     * <p>vtableId(338)</p>
     */
    @ComMethod(name = "SetFocus", dispId = 0x7e6)
    void SetFocus();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(339)</p>
     */
    @ComProperty(name = "Controls", dispId = 0x0)
    Controls getControls();
            
    /**
     * <p>id(0xfffffffb)</p>
     * <p>vtableId(341)</p>
     * @param bstrExpr [in] {@code String}
     * @param ppsa [in] {@code Object}
     */
    @ComMethod(name = "_Evaluate", dispId = 0xfffffffb)
    Object _Evaluate(String bstrExpr,
            Object ppsa);
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(342)</p>
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    String getName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(343)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    void setName(String param0);
            
    /**
     * <p>id(0x183)</p>
     * <p>vtableId(344)</p>
     */
    @ComProperty(name = "SubdatasheetHeight", dispId = 0x183)
    Short getSubdatasheetHeight();
            
    /**
     * <p>id(0x183)</p>
     * <p>vtableId(345)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "SubdatasheetHeight", dispId = 0x183)
    void setSubdatasheetHeight(Short param0);
            
    /**
     * <p>id(0x186)</p>
     * <p>vtableId(346)</p>
     */
    @ComProperty(name = "SubdatasheetExpanded", dispId = 0x186)
    Boolean getSubdatasheetExpanded();
            
    /**
     * <p>id(0x186)</p>
     * <p>vtableId(347)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SubdatasheetExpanded", dispId = 0x186)
    void setSubdatasheetExpanded(Boolean param0);
            
    
}