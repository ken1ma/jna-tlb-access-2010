
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3B06E974-E47C-11CD-8701-00AA003F0F07})</p>
 */
@ComInterface(iid="{3B06E974-E47C-11CD-8701-00AA003F0F07}")
public interface _Page extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x82b)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x82b)
    Properties getProperties();
            
    /**
     * <p>id(0x867)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "SizeToFit", dispId = 0x867)
    void SizeToFit();
            
    /**
     * <p>id(0xfffffffb)</p>
     * <p>vtableId(32)</p>
     * @param bstrExpr [in] {@code String}
     * @param ppsa [in] {@code Object}
     */
    @ComMethod(name = "_Evaluate", dispId = 0xfffffffb)
    Object _Evaluate(String bstrExpr,
            Object ppsa);
            
    /**
     * <p>id(0x7e2)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "Requery", dispId = 0x7e2)
    void Requery();
            
    /**
     * <p>id(0x7e7)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "Goto", dispId = 0x7e7)
    void Goto();
            
    /**
     * <p>id(0x7e6)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "SetFocus", dispId = 0x7e6)
    void SetFocus();
            
    /**
     * <p>id(0x88e)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Controls", dispId = 0x88e)
    Children getControls();
            
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
     * <p>id(0x11)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x11)
    String getCaption();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x11)
    void setCaption(String param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "Picture", dispId = 0x7)
    String getPicture();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Picture", dispId = 0x7)
    void setPicture(String param0);
            
    /**
     * <p>id(0x155)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0x155)
    Byte getPictureType();
            
    /**
     * <p>id(0x155)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "PictureType", dispId = 0x155)
    void setPictureType(Byte param0);
            
    /**
     * <p>id(0x160)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "PageIndex", dispId = 0x160)
    Short getPageIndex();
            
    /**
     * <p>id(0x160)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "PageIndex", dispId = 0x160)
    void setPageIndex(Short param0);
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "StatusBarText", dispId = 0x87)
    String getStatusBarText();
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "StatusBarText", dispId = 0x87)
    void setStatusBarText(String param0);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    Boolean getVisible();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x19)
    Boolean getEnabled();
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x19)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "Left", dispId = 0x36)
    Short getLeft();
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Left", dispId = 0x36)
    void setLeft(Short param0);
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "Top", dispId = 0x8d)
    Short getTop();
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Top", dispId = 0x8d)
    void setTop(Short param0);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "Width", dispId = 0x96)
    Short getWidth();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Width", dispId = 0x96)
    void setWidth(Short param0);
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "Height", dispId = 0x2c)
    Short getHeight();
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(64)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Height", dispId = 0x2c)
    void setHeight(Short param0);
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "ShortcutMenuBar", dispId = 0x130)
    String getShortcutMenuBar();
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ShortcutMenuBar", dispId = 0x130)
    void setShortcutMenuBar(String param0);
            
    /**
     * <p>id(0x13d)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "ControlTipText", dispId = 0x13d)
    String getControlTipText();
            
    /**
     * <p>id(0x13d)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ControlTipText", dispId = 0x13d)
    void setControlTipText(String param0);
            
    /**
     * <p>id(0xdb)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "HelpContextId", dispId = 0xdb)
    Integer getHelpContextId();
            
    /**
     * <p>id(0xdb)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HelpContextId", dispId = 0xdb)
    void setHelpContextId(Integer param0);
            
    /**
     * <p>id(0xed)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "Section", dispId = 0xed)
    Short getSection();
            
    /**
     * <p>id(0xed)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Section", dispId = 0xed)
    void setSection(Short param0);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "ControlName", dispId = 0x109)
    String getControlName();
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ControlName", dispId = 0x109)
    void setControlName(String param0);
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    String getTag();
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(76)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    void setTag(String param0);
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "IsVisible", dispId = 0x8c)
    Boolean getIsVisible();
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsVisible", dispId = 0x8c)
    void setIsVisible(Boolean param0);
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "InSelection", dispId = 0x118)
    Boolean getInSelection();
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InSelection", dispId = 0x118)
    void setInSelection(Boolean param0);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "OnClick", dispId = 0x7e)
    String getOnClick();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(82)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnClick", dispId = 0x7e)
    void setOnClick(String param0);
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "OnDblClick", dispId = 0xe0)
    String getOnDblClick();
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(84)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDblClick", dispId = 0xe0)
    void setOnDblClick(String param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "OnMouseDown", dispId = 0x6b)
    String getOnMouseDown();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(86)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseDown", dispId = 0x6b)
    void setOnMouseDown(String param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "OnMouseMove", dispId = 0x6d)
    String getOnMouseMove();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(88)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseMove", dispId = 0x6d)
    void setOnMouseMove(String param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "OnMouseUp", dispId = 0x6c)
    String getOnMouseUp();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(90)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseUp", dispId = 0x6c)
    void setOnMouseUp(String param0);
            
    /**
     * <p>id(0xbc)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "PictureData", dispId = 0xbc)
    Object getPictureData();
            
    /**
     * <p>id(0xbc)</p>
     * <p>vtableId(92)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PictureData", dispId = 0xbc)
    void setPictureData(Object param0);
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    String getName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(94)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    void setName(String param0);
            
    /**
     * <p>id(0x918)</p>
     * <p>vtableId(95)</p>
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
     * <p>vtableId(96)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "OnClickMacro", dispId = 0x1ea)
    String getOnClickMacro();
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(98)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnClickMacro", dispId = 0x1ea)
    void setOnClickMacro(String param0);
            
    /**
     * <p>id(0x1eb)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "OnDblClickMacro", dispId = 0x1eb)
    String getOnDblClickMacro();
            
    /**
     * <p>id(0x1eb)</p>
     * <p>vtableId(100)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDblClickMacro", dispId = 0x1eb)
    void setOnDblClickMacro(String param0);
            
    /**
     * <p>id(0x1e7)</p>
     * <p>vtableId(101)</p>
     */
    @ComProperty(name = "OnMouseDownMacro", dispId = 0x1e7)
    String getOnMouseDownMacro();
            
    /**
     * <p>id(0x1e7)</p>
     * <p>vtableId(102)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseDownMacro", dispId = 0x1e7)
    void setOnMouseDownMacro(String param0);
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "OnMouseMoveMacro", dispId = 0x1e9)
    String getOnMouseMoveMacro();
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(104)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseMoveMacro", dispId = 0x1e9)
    void setOnMouseMoveMacro(String param0);
            
    /**
     * <p>id(0x1e8)</p>
     * <p>vtableId(105)</p>
     */
    @ComProperty(name = "OnMouseUpMacro", dispId = 0x1e8)
    String getOnMouseUpMacro();
            
    /**
     * <p>id(0x1e8)</p>
     * <p>vtableId(106)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseUpMacro", dispId = 0x1e8)
    void setOnMouseUpMacro(String param0);
            
    /**
     * <p>id(0x9c7)</p>
     * <p>vtableId(107)</p>
     */
    @ComMethod(name = "SetTabOrder", dispId = 0x9c7)
    void SetTabOrder();
            
    
}