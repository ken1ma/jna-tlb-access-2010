
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3B06E971-E47C-11CD-8701-00AA003F0F07})</p>
 */
@ComInterface(iid="{3B06E971-E47C-11CD-8701-00AA003F0F07}")
public interface _TabControl extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x7d5)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Application", dispId = 0x7d5)
    Application getApplication();
            
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x836)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "OldValue", dispId = 0x836)
    Object getOldValue();
            
    /**
     * <p>id(0x82b)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x82b)
    Properties getProperties();
            
    /**
     * <p>id(0x867)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "SizeToFit", dispId = 0x867)
    void SizeToFit();
            
    /**
     * <p>id(0x884)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Pages", dispId = 0x884)
    Pages getPages();
            
    /**
     * <p>id(0xfffffffb)</p>
     * <p>vtableId(34)</p>
     * @param bstrExpr [in] {@code String}
     * @param ppsa [in] {@code Object}
     */
    @ComMethod(name = "_Evaluate", dispId = 0xfffffffb)
    Object _Evaluate(String bstrExpr,
            Object ppsa);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "EventProcPrefix", dispId = 0x16)
    String getEventProcPrefix();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "EventProcPrefix", dispId = 0x16)
    void setEventProcPrefix(String param0);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    String get_Name();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    void set_Name(String param0);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "ControlType", dispId = 0x15)
    Byte getControlType();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "ControlType", dispId = 0x15)
    void setControlType(Byte param0);
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "StatusBarText", dispId = 0x87)
    String getStatusBarText();
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "StatusBarText", dispId = 0x87)
    void setStatusBarText(String param0);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    Boolean getVisible();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "DisplayWhen", dispId = 0x95)
    Byte getDisplayWhen();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "DisplayWhen", dispId = 0x95)
    void setDisplayWhen(Byte param0);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x19)
    Boolean getEnabled();
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x19)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "TabStop", dispId = 0x106)
    Boolean getTabStop();
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TabStop", dispId = 0x106)
    void setTabStop(Boolean param0);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "TabIndex", dispId = 0x105)
    Short getTabIndex();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "TabIndex", dispId = 0x105)
    void setTabIndex(Short param0);
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "Left", dispId = 0x36)
    Short getLeft();
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Left", dispId = 0x36)
    void setLeft(Short param0);
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "Top", dispId = 0x8d)
    Short getTop();
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Top", dispId = 0x8d)
    void setTop(Short param0);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "Width", dispId = 0x96)
    Short getWidth();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Width", dispId = 0x96)
    void setWidth(Short param0);
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "Height", dispId = 0x2c)
    Short getHeight();
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Height", dispId = 0x2c)
    void setHeight(Short param0);
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "BackStyle", dispId = 0x1d)
    Byte getBackStyle();
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(64)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "BackStyle", dispId = 0x1d)
    void setBackStyle(Byte param0);
            
    /**
     * <p>id(0x15c)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "MultiRow", dispId = 0x15c)
    Boolean getMultiRow();
            
    /**
     * <p>id(0x15c)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MultiRow", dispId = 0x15c)
    void setMultiRow(Boolean param0);
            
    /**
     * <p>id(0x15d)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "Style", dispId = 0x15d)
    Byte getStyle();
            
    /**
     * <p>id(0x15d)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "Style", dispId = 0x15d)
    void setStyle(Byte param0);
            
    /**
     * <p>id(0x15e)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "TabFixedHeight", dispId = 0x15e)
    Short getTabFixedHeight();
            
    /**
     * <p>id(0x15e)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "TabFixedHeight", dispId = 0x15e)
    void setTabFixedHeight(Short param0);
            
    /**
     * <p>id(0x15f)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "TabFixedWidth", dispId = 0x15f)
    Short getTabFixedWidth();
            
    /**
     * <p>id(0x15f)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "TabFixedWidth", dispId = 0x15f)
    void setTabFixedWidth(Short param0);
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "FontName", dispId = 0x22)
    String getFontName();
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FontName", dispId = 0x22)
    void setFontName(String param0);
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "FontSize", dispId = 0x23)
    Short getFontSize();
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(76)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "FontSize", dispId = 0x23)
    void setFontSize(Short param0);
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "FontWeight", dispId = 0x25)
    Short getFontWeight();
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "FontWeight", dispId = 0x25)
    void setFontWeight(Short param0);
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "FontItalic", dispId = 0x21)
    Boolean getFontItalic();
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FontItalic", dispId = 0x21)
    void setFontItalic(Boolean param0);
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "FontUnderline", dispId = 0x24)
    Boolean getFontUnderline();
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(82)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FontUnderline", dispId = 0x24)
    void setFontUnderline(Boolean param0);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "TextFontCharSet", dispId = 0xc1)
    Byte getTextFontCharSet();
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(84)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "TextFontCharSet", dispId = 0xc1)
    void setTextFontCharSet(Byte param0);
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "FontBold", dispId = 0x20)
    Short getFontBold();
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(86)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "FontBold", dispId = 0x20)
    void setFontBold(Short param0);
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "ShortcutMenuBar", dispId = 0x130)
    String getShortcutMenuBar();
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(88)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ShortcutMenuBar", dispId = 0x130)
    void setShortcutMenuBar(String param0);
            
    /**
     * <p>id(0xdb)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "HelpContextId", dispId = 0xdb)
    Integer getHelpContextId();
            
    /**
     * <p>id(0xdb)</p>
     * <p>vtableId(90)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HelpContextId", dispId = 0xdb)
    void setHelpContextId(Integer param0);
            
    /**
     * <p>id(0xed)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "Section", dispId = 0xed)
    Short getSection();
            
    /**
     * <p>id(0xed)</p>
     * <p>vtableId(92)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Section", dispId = 0xed)
    void setSection(Short param0);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "ControlName", dispId = 0x109)
    String getControlName();
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(94)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ControlName", dispId = 0x109)
    void setControlName(String param0);
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(95)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    String getTag();
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(96)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    void setTag(String param0);
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "IsVisible", dispId = 0x8c)
    Boolean getIsVisible();
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(98)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsVisible", dispId = 0x8c)
    void setIsVisible(Boolean param0);
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "InSelection", dispId = 0x118)
    Boolean getInSelection();
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(100)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InSelection", dispId = 0x118)
    void setInSelection(Boolean param0);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(101)</p>
     */
    @ComProperty(name = "OnChange", dispId = 0x72)
    String getOnChange();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(102)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnChange", dispId = 0x72)
    void setOnChange(String param0);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "OnClick", dispId = 0x7e)
    String getOnClick();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(104)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnClick", dispId = 0x7e)
    void setOnClick(String param0);
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(105)</p>
     */
    @ComProperty(name = "OnDblClick", dispId = 0xe0)
    String getOnDblClick();
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(106)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDblClick", dispId = 0xe0)
    void setOnDblClick(String param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(107)</p>
     */
    @ComProperty(name = "OnMouseDown", dispId = 0x6b)
    String getOnMouseDown();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(108)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseDown", dispId = 0x6b)
    void setOnMouseDown(String param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(109)</p>
     */
    @ComProperty(name = "OnMouseMove", dispId = 0x6d)
    String getOnMouseMove();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(110)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseMove", dispId = 0x6d)
    void setOnMouseMove(String param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(111)</p>
     */
    @ComProperty(name = "OnMouseUp", dispId = 0x6c)
    String getOnMouseUp();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(112)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseUp", dispId = 0x6c)
    void setOnMouseUp(String param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(113)</p>
     */
    @ComProperty(name = "OnKeyDown", dispId = 0x68)
    String getOnKeyDown();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(114)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyDown", dispId = 0x68)
    void setOnKeyDown(String param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(115)</p>
     */
    @ComProperty(name = "OnKeyUp", dispId = 0x69)
    String getOnKeyUp();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(116)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyUp", dispId = 0x69)
    void setOnKeyUp(String param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(117)</p>
     */
    @ComProperty(name = "OnKeyPress", dispId = 0x6a)
    String getOnKeyPress();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(118)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyPress", dispId = 0x6a)
    void setOnKeyPress(String param0);
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(120)</p>
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    String getName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(121)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    void setName(String param0);
            
    /**
     * <p>id(0x918)</p>
     * <p>vtableId(122)</p>
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
     * <p>id(0x990)</p>
     * <p>vtableId(123)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    /**
     * <p>id(0x1fa)</p>
     * <p>vtableId(124)</p>
     */
    @ComProperty(name = "OnChangeMacro", dispId = 0x1fa)
    String getOnChangeMacro();
            
    /**
     * <p>id(0x1fa)</p>
     * <p>vtableId(125)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnChangeMacro", dispId = 0x1fa)
    void setOnChangeMacro(String param0);
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(126)</p>
     */
    @ComProperty(name = "OnClickMacro", dispId = 0x1ea)
    String getOnClickMacro();
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(127)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnClickMacro", dispId = 0x1ea)
    void setOnClickMacro(String param0);
            
    /**
     * <p>id(0x1eb)</p>
     * <p>vtableId(128)</p>
     */
    @ComProperty(name = "OnDblClickMacro", dispId = 0x1eb)
    String getOnDblClickMacro();
            
    /**
     * <p>id(0x1eb)</p>
     * <p>vtableId(129)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDblClickMacro", dispId = 0x1eb)
    void setOnDblClickMacro(String param0);
            
    /**
     * <p>id(0x1e7)</p>
     * <p>vtableId(130)</p>
     */
    @ComProperty(name = "OnMouseDownMacro", dispId = 0x1e7)
    String getOnMouseDownMacro();
            
    /**
     * <p>id(0x1e7)</p>
     * <p>vtableId(131)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseDownMacro", dispId = 0x1e7)
    void setOnMouseDownMacro(String param0);
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(132)</p>
     */
    @ComProperty(name = "OnMouseMoveMacro", dispId = 0x1e9)
    String getOnMouseMoveMacro();
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(133)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseMoveMacro", dispId = 0x1e9)
    void setOnMouseMoveMacro(String param0);
            
    /**
     * <p>id(0x1e8)</p>
     * <p>vtableId(134)</p>
     */
    @ComProperty(name = "OnMouseUpMacro", dispId = 0x1e8)
    String getOnMouseUpMacro();
            
    /**
     * <p>id(0x1e8)</p>
     * <p>vtableId(135)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseUpMacro", dispId = 0x1e8)
    void setOnMouseUpMacro(String param0);
            
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(136)</p>
     */
    @ComProperty(name = "OnKeyDownMacro", dispId = 0x1f4)
    String getOnKeyDownMacro();
            
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(137)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyDownMacro", dispId = 0x1f4)
    void setOnKeyDownMacro(String param0);
            
    /**
     * <p>id(0x1f5)</p>
     * <p>vtableId(138)</p>
     */
    @ComProperty(name = "OnKeyUpMacro", dispId = 0x1f5)
    String getOnKeyUpMacro();
            
    /**
     * <p>id(0x1f5)</p>
     * <p>vtableId(139)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyUpMacro", dispId = 0x1f5)
    void setOnKeyUpMacro(String param0);
            
    /**
     * <p>id(0x1f3)</p>
     * <p>vtableId(140)</p>
     */
    @ComProperty(name = "OnKeyPressMacro", dispId = 0x1f3)
    String getOnKeyPressMacro();
            
    /**
     * <p>id(0x1f3)</p>
     * <p>vtableId(141)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyPressMacro", dispId = 0x1f3)
    void setOnKeyPressMacro(String param0);
            
    /**
     * <p>id(0x1de)</p>
     * <p>vtableId(142)</p>
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x1de)
    AcHorizontalAnchor getHorizontalAnchor();
            
    /**
     * <p>id(0x1de)</p>
     * <p>vtableId(143)</p>
     * @param param0 [in] {@code AcHorizontalAnchor}
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x1de)
    void setHorizontalAnchor(AcHorizontalAnchor param0);
            
    /**
     * <p>id(0x1dd)</p>
     * <p>vtableId(144)</p>
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x1dd)
    AcVerticalAnchor getVerticalAnchor();
            
    /**
     * <p>id(0x1dd)</p>
     * <p>vtableId(145)</p>
     * @param param0 [in] {@code AcVerticalAnchor}
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x1dd)
    void setVerticalAnchor(AcVerticalAnchor param0);
            
    /**
     * <p>id(0x99c)</p>
     * <p>vtableId(146)</p>
     */
    @ComProperty(name = "Layout", dispId = 0x99c)
    AcLayoutType getLayout();
            
    /**
     * <p>id(0x1c6)</p>
     * <p>vtableId(147)</p>
     */
    @ComProperty(name = "LeftPadding", dispId = 0x1c6)
    Short getLeftPadding();
            
    /**
     * <p>id(0x1c6)</p>
     * <p>vtableId(148)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "LeftPadding", dispId = 0x1c6)
    void setLeftPadding(Short param0);
            
    /**
     * <p>id(0x1c7)</p>
     * <p>vtableId(149)</p>
     */
    @ComProperty(name = "TopPadding", dispId = 0x1c7)
    Short getTopPadding();
            
    /**
     * <p>id(0x1c7)</p>
     * <p>vtableId(150)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "TopPadding", dispId = 0x1c7)
    void setTopPadding(Short param0);
            
    /**
     * <p>id(0x1c8)</p>
     * <p>vtableId(151)</p>
     */
    @ComProperty(name = "RightPadding", dispId = 0x1c8)
    Short getRightPadding();
            
    /**
     * <p>id(0x1c8)</p>
     * <p>vtableId(152)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "RightPadding", dispId = 0x1c8)
    void setRightPadding(Short param0);
            
    /**
     * <p>id(0x1c9)</p>
     * <p>vtableId(153)</p>
     */
    @ComProperty(name = "BottomPadding", dispId = 0x1c9)
    Short getBottomPadding();
            
    /**
     * <p>id(0x1c9)</p>
     * <p>vtableId(154)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "BottomPadding", dispId = 0x1c9)
    void setBottomPadding(Short param0);
            
    /**
     * <p>id(0x1ca)</p>
     * <p>vtableId(155)</p>
     */
    @ComProperty(name = "GridlineStyleLeft", dispId = 0x1ca)
    Byte getGridlineStyleLeft();
            
    /**
     * <p>id(0x1ca)</p>
     * <p>vtableId(156)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleLeft", dispId = 0x1ca)
    void setGridlineStyleLeft(Byte param0);
            
    /**
     * <p>id(0x1cb)</p>
     * <p>vtableId(157)</p>
     */
    @ComProperty(name = "GridlineStyleTop", dispId = 0x1cb)
    Byte getGridlineStyleTop();
            
    /**
     * <p>id(0x1cb)</p>
     * <p>vtableId(158)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleTop", dispId = 0x1cb)
    void setGridlineStyleTop(Byte param0);
            
    /**
     * <p>id(0x1cc)</p>
     * <p>vtableId(159)</p>
     */
    @ComProperty(name = "GridlineStyleRight", dispId = 0x1cc)
    Byte getGridlineStyleRight();
            
    /**
     * <p>id(0x1cc)</p>
     * <p>vtableId(160)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleRight", dispId = 0x1cc)
    void setGridlineStyleRight(Byte param0);
            
    /**
     * <p>id(0x1cd)</p>
     * <p>vtableId(161)</p>
     */
    @ComProperty(name = "GridlineStyleBottom", dispId = 0x1cd)
    Byte getGridlineStyleBottom();
            
    /**
     * <p>id(0x1cd)</p>
     * <p>vtableId(162)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleBottom", dispId = 0x1cd)
    void setGridlineStyleBottom(Byte param0);
            
    /**
     * <p>id(0x1cf)</p>
     * <p>vtableId(163)</p>
     */
    @ComProperty(name = "GridlineWidthLeft", dispId = 0x1cf)
    Byte getGridlineWidthLeft();
            
    /**
     * <p>id(0x1cf)</p>
     * <p>vtableId(164)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthLeft", dispId = 0x1cf)
    void setGridlineWidthLeft(Byte param0);
            
    /**
     * <p>id(0x1d0)</p>
     * <p>vtableId(165)</p>
     */
    @ComProperty(name = "GridlineWidthTop", dispId = 0x1d0)
    Byte getGridlineWidthTop();
            
    /**
     * <p>id(0x1d0)</p>
     * <p>vtableId(166)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthTop", dispId = 0x1d0)
    void setGridlineWidthTop(Byte param0);
            
    /**
     * <p>id(0x1d1)</p>
     * <p>vtableId(167)</p>
     */
    @ComProperty(name = "GridlineWidthRight", dispId = 0x1d1)
    Byte getGridlineWidthRight();
            
    /**
     * <p>id(0x1d1)</p>
     * <p>vtableId(168)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthRight", dispId = 0x1d1)
    void setGridlineWidthRight(Byte param0);
            
    /**
     * <p>id(0x1d2)</p>
     * <p>vtableId(169)</p>
     */
    @ComProperty(name = "GridlineWidthBottom", dispId = 0x1d2)
    Byte getGridlineWidthBottom();
            
    /**
     * <p>id(0x1d2)</p>
     * <p>vtableId(170)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthBottom", dispId = 0x1d2)
    void setGridlineWidthBottom(Byte param0);
            
    /**
     * <p>id(0x1ce)</p>
     * <p>vtableId(171)</p>
     */
    @ComProperty(name = "GridlineColor", dispId = 0x1ce)
    Integer getGridlineColor();
            
    /**
     * <p>id(0x1ce)</p>
     * <p>vtableId(172)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "GridlineColor", dispId = 0x1ce)
    void setGridlineColor(Integer param0);
            
    /**
     * <p>id(0x9bc)</p>
     * <p>vtableId(173)</p>
     */
    @ComProperty(name = "LayoutID", dispId = 0x9bc)
    Integer getLayoutID();
            
    /**
     * <p>id(0x267)</p>
     * <p>vtableId(174)</p>
     */
    @ComProperty(name = "ThemeFontIndex", dispId = 0x267)
    Integer getThemeFontIndex();
            
    /**
     * <p>id(0x267)</p>
     * <p>vtableId(175)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ThemeFontIndex", dispId = 0x267)
    void setThemeFontIndex(Integer param0);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(176)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0x1c)
    Integer getBackColor();
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(177)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BackColor", dispId = 0x1c)
    void setBackColor(Integer param0);
            
    /**
     * <p>id(0x268)</p>
     * <p>vtableId(178)</p>
     */
    @ComProperty(name = "BackThemeColorIndex", dispId = 0x268)
    Integer getBackThemeColorIndex();
            
    /**
     * <p>id(0x268)</p>
     * <p>vtableId(179)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BackThemeColorIndex", dispId = 0x268)
    void setBackThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(180)</p>
     */
    @ComProperty(name = "BackTint", dispId = 0x269)
    Float getBackTint();
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(181)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BackTint", dispId = 0x269)
    void setBackTint(Float param0);
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(182)</p>
     */
    @ComProperty(name = "BackShade", dispId = 0x26a)
    Float getBackShade();
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(183)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BackShade", dispId = 0x26a)
    void setBackShade(Float param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(184)</p>
     */
    @ComProperty(name = "BorderColor", dispId = 0x8)
    Integer getBorderColor();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(185)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BorderColor", dispId = 0x8)
    void setBorderColor(Integer param0);
            
    /**
     * <p>id(0x26b)</p>
     * <p>vtableId(186)</p>
     */
    @ComProperty(name = "BorderThemeColorIndex", dispId = 0x26b)
    Integer getBorderThemeColorIndex();
            
    /**
     * <p>id(0x26b)</p>
     * <p>vtableId(187)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BorderThemeColorIndex", dispId = 0x26b)
    void setBorderThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x26c)</p>
     * <p>vtableId(188)</p>
     */
    @ComProperty(name = "BorderTint", dispId = 0x26c)
    Float getBorderTint();
            
    /**
     * <p>id(0x26c)</p>
     * <p>vtableId(189)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BorderTint", dispId = 0x26c)
    void setBorderTint(Float param0);
            
    /**
     * <p>id(0x26d)</p>
     * <p>vtableId(190)</p>
     */
    @ComProperty(name = "BorderShade", dispId = 0x26d)
    Float getBorderShade();
            
    /**
     * <p>id(0x26d)</p>
     * <p>vtableId(191)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BorderShade", dispId = 0x26d)
    void setBorderShade(Float param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(192)</p>
     */
    @ComProperty(name = "BorderStyle", dispId = 0x9)
    Byte getBorderStyle();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(193)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "BorderStyle", dispId = 0x9)
    void setBorderStyle(Byte param0);
            
    /**
     * <p>id(0x28c)</p>
     * <p>vtableId(194)</p>
     */
    @ComProperty(name = "HoverColor", dispId = 0x28c)
    Integer getHoverColor();
            
    /**
     * <p>id(0x28c)</p>
     * <p>vtableId(195)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HoverColor", dispId = 0x28c)
    void setHoverColor(Integer param0);
            
    /**
     * <p>id(0x28d)</p>
     * <p>vtableId(196)</p>
     */
    @ComProperty(name = "HoverThemeColorIndex", dispId = 0x28d)
    Integer getHoverThemeColorIndex();
            
    /**
     * <p>id(0x28d)</p>
     * <p>vtableId(197)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HoverThemeColorIndex", dispId = 0x28d)
    void setHoverThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x28e)</p>
     * <p>vtableId(198)</p>
     */
    @ComProperty(name = "HoverTint", dispId = 0x28e)
    Float getHoverTint();
            
    /**
     * <p>id(0x28e)</p>
     * <p>vtableId(199)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "HoverTint", dispId = 0x28e)
    void setHoverTint(Float param0);
            
    /**
     * <p>id(0x28f)</p>
     * <p>vtableId(200)</p>
     */
    @ComProperty(name = "HoverShade", dispId = 0x28f)
    Float getHoverShade();
            
    /**
     * <p>id(0x28f)</p>
     * <p>vtableId(201)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "HoverShade", dispId = 0x28f)
    void setHoverShade(Float param0);
            
    /**
     * <p>id(0x294)</p>
     * <p>vtableId(202)</p>
     */
    @ComProperty(name = "HoverForeColor", dispId = 0x294)
    Integer getHoverForeColor();
            
    /**
     * <p>id(0x294)</p>
     * <p>vtableId(203)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HoverForeColor", dispId = 0x294)
    void setHoverForeColor(Integer param0);
            
    /**
     * <p>id(0x295)</p>
     * <p>vtableId(204)</p>
     */
    @ComProperty(name = "HoverForeThemeColorIndex", dispId = 0x295)
    Integer getHoverForeThemeColorIndex();
            
    /**
     * <p>id(0x295)</p>
     * <p>vtableId(205)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HoverForeThemeColorIndex", dispId = 0x295)
    void setHoverForeThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x296)</p>
     * <p>vtableId(206)</p>
     */
    @ComProperty(name = "HoverForeTint", dispId = 0x296)
    Float getHoverForeTint();
            
    /**
     * <p>id(0x296)</p>
     * <p>vtableId(207)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "HoverForeTint", dispId = 0x296)
    void setHoverForeTint(Float param0);
            
    /**
     * <p>id(0x297)</p>
     * <p>vtableId(208)</p>
     */
    @ComProperty(name = "HoverForeShade", dispId = 0x297)
    Float getHoverForeShade();
            
    /**
     * <p>id(0x297)</p>
     * <p>vtableId(209)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "HoverForeShade", dispId = 0x297)
    void setHoverForeShade(Float param0);
            
    /**
     * <p>id(0x290)</p>
     * <p>vtableId(210)</p>
     */
    @ComProperty(name = "PressedColor", dispId = 0x290)
    Integer getPressedColor();
            
    /**
     * <p>id(0x290)</p>
     * <p>vtableId(211)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PressedColor", dispId = 0x290)
    void setPressedColor(Integer param0);
            
    /**
     * <p>id(0x291)</p>
     * <p>vtableId(212)</p>
     */
    @ComProperty(name = "PressedThemeColorIndex", dispId = 0x291)
    Integer getPressedThemeColorIndex();
            
    /**
     * <p>id(0x291)</p>
     * <p>vtableId(213)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PressedThemeColorIndex", dispId = 0x291)
    void setPressedThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x292)</p>
     * <p>vtableId(214)</p>
     */
    @ComProperty(name = "PressedTint", dispId = 0x292)
    Float getPressedTint();
            
    /**
     * <p>id(0x292)</p>
     * <p>vtableId(215)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PressedTint", dispId = 0x292)
    void setPressedTint(Float param0);
            
    /**
     * <p>id(0x293)</p>
     * <p>vtableId(216)</p>
     */
    @ComProperty(name = "PressedShade", dispId = 0x293)
    Float getPressedShade();
            
    /**
     * <p>id(0x293)</p>
     * <p>vtableId(217)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PressedShade", dispId = 0x293)
    void setPressedShade(Float param0);
            
    /**
     * <p>id(0x298)</p>
     * <p>vtableId(218)</p>
     */
    @ComProperty(name = "PressedForeColor", dispId = 0x298)
    Integer getPressedForeColor();
            
    /**
     * <p>id(0x298)</p>
     * <p>vtableId(219)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PressedForeColor", dispId = 0x298)
    void setPressedForeColor(Integer param0);
            
    /**
     * <p>id(0x299)</p>
     * <p>vtableId(220)</p>
     */
    @ComProperty(name = "PressedForeThemeColorIndex", dispId = 0x299)
    Integer getPressedForeThemeColorIndex();
            
    /**
     * <p>id(0x299)</p>
     * <p>vtableId(221)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PressedForeThemeColorIndex", dispId = 0x299)
    void setPressedForeThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x29a)</p>
     * <p>vtableId(222)</p>
     */
    @ComProperty(name = "PressedForeTint", dispId = 0x29a)
    Float getPressedForeTint();
            
    /**
     * <p>id(0x29a)</p>
     * <p>vtableId(223)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PressedForeTint", dispId = 0x29a)
    void setPressedForeTint(Float param0);
            
    /**
     * <p>id(0x29b)</p>
     * <p>vtableId(224)</p>
     */
    @ComProperty(name = "PressedForeShade", dispId = 0x29b)
    Float getPressedForeShade();
            
    /**
     * <p>id(0x29b)</p>
     * <p>vtableId(225)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PressedForeShade", dispId = 0x29b)
    void setPressedForeShade(Float param0);
            
    /**
     * <p>id(0x288)</p>
     * <p>vtableId(226)</p>
     */
    @ComProperty(name = "UseTheme", dispId = 0x288)
    Boolean getUseTheme();
            
    /**
     * <p>id(0x288)</p>
     * <p>vtableId(227)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseTheme", dispId = 0x288)
    void setUseTheme(Boolean param0);
            
    /**
     * <p>id(0x289)</p>
     * <p>vtableId(228)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x289)
    Integer getShape();
            
    /**
     * <p>id(0x289)</p>
     * <p>vtableId(229)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Shape", dispId = 0x289)
    void setShape(Integer param0);
            
    /**
     * <p>id(0x271)</p>
     * <p>vtableId(230)</p>
     */
    @ComProperty(name = "GridlineThemeColorIndex", dispId = 0x271)
    Integer getGridlineThemeColorIndex();
            
    /**
     * <p>id(0x271)</p>
     * <p>vtableId(231)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "GridlineThemeColorIndex", dispId = 0x271)
    void setGridlineThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x272)</p>
     * <p>vtableId(232)</p>
     */
    @ComProperty(name = "GridlineTint", dispId = 0x272)
    Float getGridlineTint();
            
    /**
     * <p>id(0x272)</p>
     * <p>vtableId(233)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "GridlineTint", dispId = 0x272)
    void setGridlineTint(Float param0);
            
    /**
     * <p>id(0x273)</p>
     * <p>vtableId(234)</p>
     */
    @ComProperty(name = "GridlineShade", dispId = 0x273)
    Float getGridlineShade();
            
    /**
     * <p>id(0x273)</p>
     * <p>vtableId(235)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "GridlineShade", dispId = 0x273)
    void setGridlineShade(Float param0);
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(236)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xcc)
    Integer getForeColor();
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(237)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ForeColor", dispId = 0xcc)
    void setForeColor(Integer param0);
            
    /**
     * <p>id(0x26e)</p>
     * <p>vtableId(238)</p>
     */
    @ComProperty(name = "ForeThemeColorIndex", dispId = 0x26e)
    Integer getForeThemeColorIndex();
            
    /**
     * <p>id(0x26e)</p>
     * <p>vtableId(239)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ForeThemeColorIndex", dispId = 0x26e)
    void setForeThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x26f)</p>
     * <p>vtableId(240)</p>
     */
    @ComProperty(name = "ForeTint", dispId = 0x26f)
    Float getForeTint();
            
    /**
     * <p>id(0x26f)</p>
     * <p>vtableId(241)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ForeTint", dispId = 0x26f)
    void setForeTint(Float param0);
            
    /**
     * <p>id(0x270)</p>
     * <p>vtableId(242)</p>
     */
    @ComProperty(name = "ForeShade", dispId = 0x270)
    Float getForeShade();
            
    /**
     * <p>id(0x270)</p>
     * <p>vtableId(243)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ForeShade", dispId = 0x270)
    void setForeShade(Float param0);
            
    /**
     * <p>id(0x2b4)</p>
     * <p>vtableId(244)</p>
     */
    @ComProperty(name = "Gradient", dispId = 0x2b4)
    Integer getGradient();
            
    /**
     * <p>id(0x2b4)</p>
     * <p>vtableId(245)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Gradient", dispId = 0x2b4)
    void setGradient(Integer param0);
            
    
}