
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3B06E946-E47C-11CD-8701-00AA003F0F07})</p>
 */
@ComInterface(iid="{3B06E946-E47C-11CD-8701-00AA003F0F07}")
public interface _Textbox extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x860)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "Undo", dispId = 0x860)
    void Undo();
            
    /**
     * <p>id(0x836)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "OldValue", dispId = 0x836)
    Object getOldValue();
            
    /**
     * <p>id(0x82b)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x82b)
    Properties getProperties();
            
    /**
     * <p>id(0x867)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "SizeToFit", dispId = 0x867)
    void SizeToFit();
            
    /**
     * <p>id(0x7e2)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "Requery", dispId = 0x7e2)
    void Requery();
            
    /**
     * <p>id(0x7e7)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "Goto", dispId = 0x7e7)
    void Goto();
            
    /**
     * <p>id(0x7e6)</p>
     * <p>vtableId(36)</p>
     */
    @ComMethod(name = "SetFocus", dispId = 0x7e6)
    void SetFocus();
            
    /**
     * <p>id(0x88e)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "Controls", dispId = 0x88e)
    Children getControls();
            
    /**
     * <p>id(0xfffffffb)</p>
     * <p>vtableId(38)</p>
     * @param bstrExpr [in] {@code String}
     * @param ppsa [in] {@code Object}
     */
    @ComMethod(name = "_Evaluate", dispId = 0xfffffffb)
    Object _Evaluate(String bstrExpr,
            Object ppsa);
            
    /**
     * <p>id(0x885)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Hyperlink", dispId = 0x885)
    _Hyperlink getHyperlink();
            
    /**
     * <p>id(0x89b)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "FormatConditions", dispId = 0x89b)
    FormatConditions getFormatConditions();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "EventProcPrefix", dispId = 0x16)
    String getEventProcPrefix();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "EventProcPrefix", dispId = 0x16)
    void setEventProcPrefix(String param0);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    String get_Name();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    void set_Name(String param0);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "ControlType", dispId = 0x15)
    Byte getControlType();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "ControlType", dispId = 0x15)
    void setControlType(Byte param0);
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "ControlSource", dispId = 0x1b)
    String getControlSource();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ControlSource", dispId = 0x1b)
    void setControlSource(String param0);
            
    /**
     * <p>id(0x26)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "Format", dispId = 0x26)
    String getFormat();
            
    /**
     * <p>id(0x26)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Format", dispId = 0x26)
    void setFormat(String param0);
            
    /**
     * <p>id(0x47)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "DecimalPlaces", dispId = 0x47)
    Byte getDecimalPlaces();
            
    /**
     * <p>id(0x47)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "DecimalPlaces", dispId = 0x47)
    void setDecimalPlaces(Byte param0);
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "InputMask", dispId = 0x48)
    String getInputMask();
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "InputMask", dispId = 0x48)
    void setInputMask(String param0);
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "DefaultValue", dispId = 0x17)
    String getDefaultValue();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DefaultValue", dispId = 0x17)
    void setDefaultValue(String param0);
            
    /**
     * <p>id(0x165)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "IMEHold", dispId = 0x165)
    Boolean getIMEHold();
            
    /**
     * <p>id(0x165)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IMEHold", dispId = 0x165)
    void setIMEHold(Boolean param0);
            
    /**
     * <p>id(0x167)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "FuriganaControl", dispId = 0x167)
    String getFuriganaControl();
            
    /**
     * <p>id(0x167)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FuriganaControl", dispId = 0x167)
    void setFuriganaControl(String param0);
            
    /**
     * <p>id(0x168)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "PostalAddress", dispId = 0x168)
    String getPostalAddress();
            
    /**
     * <p>id(0x168)</p>
     * <p>vtableId(64)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PostalAddress", dispId = 0x168)
    void setPostalAddress(String param0);
            
    /**
     * <p>id(0x91)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "ValidationRule", dispId = 0x91)
    String getValidationRule();
            
    /**
     * <p>id(0x91)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ValidationRule", dispId = 0x91)
    void setValidationRule(String param0);
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "ValidationText", dispId = 0x3d)
    String getValidationText();
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ValidationText", dispId = 0x3d)
    void setValidationText(String param0);
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "StatusBarText", dispId = 0x87)
    String getStatusBarText();
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "StatusBarText", dispId = 0x87)
    void setStatusBarText(String param0);
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "EnterKeyBehavior", dispId = 0x4a)
    Boolean getEnterKeyBehavior();
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnterKeyBehavior", dispId = 0x4a)
    void setEnterKeyBehavior(Boolean param0);
            
    /**
     * <p>id(0x154)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "AllowAutoCorrect", dispId = 0x154)
    Boolean getAllowAutoCorrect();
            
    /**
     * <p>id(0x154)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowAutoCorrect", dispId = 0x154)
    void setAllowAutoCorrect(Boolean param0);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    Boolean getVisible();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(76)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "DisplayWhen", dispId = 0x95)
    Byte getDisplayWhen();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "DisplayWhen", dispId = 0x95)
    void setDisplayWhen(Byte param0);
            
    /**
     * <p>id(0x163)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "Vertical", dispId = 0x163)
    Boolean getVertical();
            
    /**
     * <p>id(0x163)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Vertical", dispId = 0x163)
    void setVertical(Boolean param0);
            
    /**
     * <p>id(0x166)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "FELineBreak", dispId = 0x166)
    Boolean getFELineBreak();
            
    /**
     * <p>id(0x166)</p>
     * <p>vtableId(82)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FELineBreak", dispId = 0x166)
    void setFELineBreak(Boolean param0);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x19)
    Boolean getEnabled();
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(84)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x19)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x38)
    Boolean getLocked();
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(86)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x38)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x131)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "FilterLookup", dispId = 0x131)
    Byte getFilterLookup();
            
    /**
     * <p>id(0x131)</p>
     * <p>vtableId(88)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "FilterLookup", dispId = 0x131)
    void setFilterLookup(Byte param0);
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "AutoTab", dispId = 0x49)
    Boolean getAutoTab();
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(90)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoTab", dispId = 0x49)
    void setAutoTab(Boolean param0);
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "TabStop", dispId = 0x106)
    Boolean getTabStop();
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(92)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TabStop", dispId = 0x106)
    void setTabStop(Boolean param0);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "TabIndex", dispId = 0x105)
    Short getTabIndex();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(94)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "TabIndex", dispId = 0x105)
    void setTabIndex(Short param0);
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(95)</p>
     */
    @ComProperty(name = "ScrollBars", dispId = 0x98)
    Byte getScrollBars();
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(96)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "ScrollBars", dispId = 0x98)
    void setScrollBars(Byte param0);
            
    /**
     * <p>id(0x45)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "HideDuplicates", dispId = 0x45)
    Boolean getHideDuplicates();
            
    /**
     * <p>id(0x45)</p>
     * <p>vtableId(98)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HideDuplicates", dispId = 0x45)
    void setHideDuplicates(Boolean param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "CanGrow", dispId = 0xe)
    Boolean getCanGrow();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(100)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CanGrow", dispId = 0xe)
    void setCanGrow(Boolean param0);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(101)</p>
     */
    @ComProperty(name = "CanShrink", dispId = 0x10)
    Boolean getCanShrink();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(102)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CanShrink", dispId = 0x10)
    void setCanShrink(Boolean param0);
            
    /**
     * <p>id(0x82)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "RunningSum", dispId = 0x82)
    Byte getRunningSum();
            
    /**
     * <p>id(0x82)</p>
     * <p>vtableId(104)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "RunningSum", dispId = 0x82)
    void setRunningSum(Byte param0);
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(105)</p>
     */
    @ComProperty(name = "Left", dispId = 0x36)
    Short getLeft();
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(106)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Left", dispId = 0x36)
    void setLeft(Short param0);
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(107)</p>
     */
    @ComProperty(name = "Top", dispId = 0x8d)
    Short getTop();
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(108)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Top", dispId = 0x8d)
    void setTop(Short param0);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(109)</p>
     */
    @ComProperty(name = "Width", dispId = 0x96)
    Short getWidth();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(110)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Width", dispId = 0x96)
    void setWidth(Short param0);
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(111)</p>
     */
    @ComProperty(name = "Height", dispId = 0x2c)
    Short getHeight();
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(112)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Height", dispId = 0x2c)
    void setHeight(Short param0);
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(113)</p>
     */
    @ComProperty(name = "BackStyle", dispId = 0x1d)
    Byte getBackStyle();
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(114)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "BackStyle", dispId = 0x1d)
    void setBackStyle(Byte param0);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(115)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0x1c)
    Integer getBackColor();
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(116)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BackColor", dispId = 0x1c)
    void setBackColor(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(117)</p>
     */
    @ComProperty(name = "SpecialEffect", dispId = 0x4)
    Byte getSpecialEffect();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(118)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "SpecialEffect", dispId = 0x4)
    void setSpecialEffect(Byte param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(119)</p>
     */
    @ComProperty(name = "BorderStyle", dispId = 0x9)
    Byte getBorderStyle();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(120)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "BorderStyle", dispId = 0x9)
    void setBorderStyle(Byte param0);
            
    /**
     * <p>id(0x149)</p>
     * <p>vtableId(121)</p>
     */
    @ComProperty(name = "OldBorderStyle", dispId = 0x149)
    Byte getOldBorderStyle();
            
    /**
     * <p>id(0x149)</p>
     * <p>vtableId(122)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "OldBorderStyle", dispId = 0x149)
    void setOldBorderStyle(Byte param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(123)</p>
     */
    @ComProperty(name = "BorderColor", dispId = 0x8)
    Integer getBorderColor();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(124)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BorderColor", dispId = 0x8)
    void setBorderColor(Integer param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(125)</p>
     */
    @ComProperty(name = "BorderWidth", dispId = 0xa)
    Byte getBorderWidth();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(126)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "BorderWidth", dispId = 0xa)
    void setBorderWidth(Byte param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(127)</p>
     */
    @ComProperty(name = "BorderLineStyle", dispId = 0xb)
    Byte getBorderLineStyle();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(128)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "BorderLineStyle", dispId = 0xb)
    void setBorderLineStyle(Byte param0);
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(129)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xcc)
    Integer getForeColor();
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(130)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ForeColor", dispId = 0xcc)
    void setForeColor(Integer param0);
            
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
     * <p>id(0x25)</p>
     * <p>vtableId(135)</p>
     */
    @ComProperty(name = "FontWeight", dispId = 0x25)
    Short getFontWeight();
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(136)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "FontWeight", dispId = 0x25)
    void setFontWeight(Short param0);
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(137)</p>
     */
    @ComProperty(name = "FontItalic", dispId = 0x21)
    Boolean getFontItalic();
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(138)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FontItalic", dispId = 0x21)
    void setFontItalic(Boolean param0);
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(139)</p>
     */
    @ComProperty(name = "FontUnderline", dispId = 0x24)
    Boolean getFontUnderline();
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(140)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FontUnderline", dispId = 0x24)
    void setFontUnderline(Boolean param0);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(141)</p>
     */
    @ComProperty(name = "TextFontCharSet", dispId = 0xc1)
    Byte getTextFontCharSet();
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(142)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "TextFontCharSet", dispId = 0xc1)
    void setTextFontCharSet(Byte param0);
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(143)</p>
     */
    @ComProperty(name = "TextAlign", dispId = 0x88)
    Byte getTextAlign();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(144)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "TextAlign", dispId = 0x88)
    void setTextAlign(Byte param0);
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(145)</p>
     */
    @ComProperty(name = "FontBold", dispId = 0x20)
    Short getFontBold();
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(146)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "FontBold", dispId = 0x20)
    void setFontBold(Short param0);
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(147)</p>
     */
    @ComProperty(name = "ShortcutMenuBar", dispId = 0x130)
    String getShortcutMenuBar();
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(148)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ShortcutMenuBar", dispId = 0x130)
    void setShortcutMenuBar(String param0);
            
    /**
     * <p>id(0x13d)</p>
     * <p>vtableId(149)</p>
     */
    @ComProperty(name = "ControlTipText", dispId = 0x13d)
    String getControlTipText();
            
    /**
     * <p>id(0x13d)</p>
     * <p>vtableId(150)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ControlTipText", dispId = 0x13d)
    void setControlTipText(String param0);
            
    /**
     * <p>id(0xdb)</p>
     * <p>vtableId(151)</p>
     */
    @ComProperty(name = "HelpContextId", dispId = 0xdb)
    Integer getHelpContextId();
            
    /**
     * <p>id(0xdb)</p>
     * <p>vtableId(152)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HelpContextId", dispId = 0xdb)
    void setHelpContextId(Integer param0);
            
    /**
     * <p>id(0xa6)</p>
     * <p>vtableId(153)</p>
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xa6)
    Short getColumnWidth();
            
    /**
     * <p>id(0xa6)</p>
     * <p>vtableId(154)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xa6)
    void setColumnWidth(Short param0);
            
    /**
     * <p>id(0xa5)</p>
     * <p>vtableId(155)</p>
     */
    @ComProperty(name = "ColumnOrder", dispId = 0xa5)
    Short getColumnOrder();
            
    /**
     * <p>id(0xa5)</p>
     * <p>vtableId(156)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "ColumnOrder", dispId = 0xa5)
    void setColumnOrder(Short param0);
            
    /**
     * <p>id(0xa7)</p>
     * <p>vtableId(157)</p>
     */
    @ComProperty(name = "ColumnHidden", dispId = 0xa7)
    Boolean getColumnHidden();
            
    /**
     * <p>id(0xa7)</p>
     * <p>vtableId(158)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ColumnHidden", dispId = 0xa7)
    void setColumnHidden(Boolean param0);
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(159)</p>
     */
    @ComProperty(name = "AutoLabel", dispId = 0x39)
    Boolean getAutoLabel();
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(160)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoLabel", dispId = 0x39)
    void setAutoLabel(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(161)</p>
     */
    @ComProperty(name = "AddColon", dispId = 0x3)
    Boolean getAddColon();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(162)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AddColon", dispId = 0x3)
    void setAddColon(Boolean param0);
            
    /**
     * <p>id(0x34)</p>
     * <p>vtableId(163)</p>
     */
    @ComProperty(name = "LabelX", dispId = 0x34)
    Short getLabelX();
            
    /**
     * <p>id(0x34)</p>
     * <p>vtableId(164)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "LabelX", dispId = 0x34)
    void setLabelX(Short param0);
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(165)</p>
     */
    @ComProperty(name = "LabelY", dispId = 0x35)
    Short getLabelY();
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(166)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "LabelY", dispId = 0x35)
    void setLabelY(Short param0);
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(167)</p>
     */
    @ComProperty(name = "LabelAlign", dispId = 0x33)
    Byte getLabelAlign();
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(168)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "LabelAlign", dispId = 0x33)
    void setLabelAlign(Byte param0);
            
    /**
     * <p>id(0xed)</p>
     * <p>vtableId(169)</p>
     */
    @ComProperty(name = "Section", dispId = 0xed)
    Short getSection();
            
    /**
     * <p>id(0xed)</p>
     * <p>vtableId(170)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Section", dispId = 0xed)
    void setSection(Short param0);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(171)</p>
     */
    @ComProperty(name = "ControlName", dispId = 0x109)
    String getControlName();
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(172)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ControlName", dispId = 0x109)
    void setControlName(String param0);
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(173)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    String getTag();
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(174)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    void setTag(String param0);
            
    /**
     * <p>id(0x10b)</p>
     * <p>vtableId(175)</p>
     */
    @ComProperty(name = "Text", dispId = 0x10b)
    String getText();
            
    /**
     * <p>id(0x10b)</p>
     * <p>vtableId(176)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x10b)
    void setText(String param0);
            
    /**
     * <p>id(0x10f)</p>
     * <p>vtableId(177)</p>
     */
    @ComProperty(name = "SelText", dispId = 0x10f)
    String getSelText();
            
    /**
     * <p>id(0x10f)</p>
     * <p>vtableId(178)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SelText", dispId = 0x10f)
    void setSelText(String param0);
            
    /**
     * <p>id(0x10e)</p>
     * <p>vtableId(179)</p>
     */
    @ComProperty(name = "SelStart", dispId = 0x10e)
    Short getSelStart();
            
    /**
     * <p>id(0x10e)</p>
     * <p>vtableId(180)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "SelStart", dispId = 0x10e)
    void setSelStart(Short param0);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(181)</p>
     */
    @ComProperty(name = "SelLength", dispId = 0x10d)
    Short getSelLength();
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(182)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "SelLength", dispId = 0x10d)
    void setSelLength(Short param0);
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(183)</p>
     */
    @ComProperty(name = "TextAlignGeneral", dispId = 0x89)
    Short getTextAlignGeneral();
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(184)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "TextAlignGeneral", dispId = 0x89)
    void setTextAlignGeneral(Short param0);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(185)</p>
     */
    @ComProperty(name = "Coltyp", dispId = 0x8b)
    Integer getColtyp();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(186)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Coltyp", dispId = 0x8b)
    void setColtyp(Integer param0);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(187)</p>
     */
    @ComProperty(name = "FormatPictureText", dispId = 0x8a)
    String getFormatPictureText();
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(188)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FormatPictureText", dispId = 0x8a)
    void setFormatPictureText(String param0);
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(189)</p>
     */
    @ComProperty(name = "IsVisible", dispId = 0x8c)
    Boolean getIsVisible();
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(190)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsVisible", dispId = 0x8c)
    void setIsVisible(Boolean param0);
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(191)</p>
     */
    @ComProperty(name = "InSelection", dispId = 0x118)
    Boolean getInSelection();
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(192)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InSelection", dispId = 0x118)
    void setInSelection(Boolean param0);
            
    /**
     * <p>id(0x55)</p>
     * <p>vtableId(193)</p>
     */
    @ComProperty(name = "BeforeUpdate", dispId = 0x55)
    String getBeforeUpdate();
            
    /**
     * <p>id(0x55)</p>
     * <p>vtableId(194)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BeforeUpdate", dispId = 0x55)
    void setBeforeUpdate(String param0);
            
    /**
     * <p>id(0x56)</p>
     * <p>vtableId(195)</p>
     */
    @ComProperty(name = "AfterUpdate", dispId = 0x56)
    String getAfterUpdate();
            
    /**
     * <p>id(0x56)</p>
     * <p>vtableId(196)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AfterUpdate", dispId = 0x56)
    void setAfterUpdate(String param0);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(197)</p>
     */
    @ComProperty(name = "OnChange", dispId = 0x72)
    String getOnChange();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(198)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnChange", dispId = 0x72)
    void setOnChange(String param0);
            
    /**
     * <p>id(0xde)</p>
     * <p>vtableId(199)</p>
     */
    @ComProperty(name = "OnEnter", dispId = 0xde)
    String getOnEnter();
            
    /**
     * <p>id(0xde)</p>
     * <p>vtableId(200)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnEnter", dispId = 0xde)
    void setOnEnter(String param0);
            
    /**
     * <p>id(0xdf)</p>
     * <p>vtableId(201)</p>
     */
    @ComProperty(name = "OnExit", dispId = 0xdf)
    String getOnExit();
            
    /**
     * <p>id(0xdf)</p>
     * <p>vtableId(202)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnExit", dispId = 0xdf)
    void setOnExit(String param0);
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(203)</p>
     */
    @ComProperty(name = "OnGotFocus", dispId = 0x73)
    String getOnGotFocus();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(204)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnGotFocus", dispId = 0x73)
    void setOnGotFocus(String param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(205)</p>
     */
    @ComProperty(name = "OnLostFocus", dispId = 0x74)
    String getOnLostFocus();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(206)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnLostFocus", dispId = 0x74)
    void setOnLostFocus(String param0);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(207)</p>
     */
    @ComProperty(name = "OnClick", dispId = 0x7e)
    String getOnClick();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(208)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnClick", dispId = 0x7e)
    void setOnClick(String param0);
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(209)</p>
     */
    @ComProperty(name = "OnDblClick", dispId = 0xe0)
    String getOnDblClick();
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(210)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDblClick", dispId = 0xe0)
    void setOnDblClick(String param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(211)</p>
     */
    @ComProperty(name = "OnMouseDown", dispId = 0x6b)
    String getOnMouseDown();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(212)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseDown", dispId = 0x6b)
    void setOnMouseDown(String param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(213)</p>
     */
    @ComProperty(name = "OnMouseMove", dispId = 0x6d)
    String getOnMouseMove();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(214)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseMove", dispId = 0x6d)
    void setOnMouseMove(String param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(215)</p>
     */
    @ComProperty(name = "OnMouseUp", dispId = 0x6c)
    String getOnMouseUp();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(216)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseUp", dispId = 0x6c)
    void setOnMouseUp(String param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(217)</p>
     */
    @ComProperty(name = "OnKeyDown", dispId = 0x68)
    String getOnKeyDown();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(218)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyDown", dispId = 0x68)
    void setOnKeyDown(String param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(219)</p>
     */
    @ComProperty(name = "OnKeyUp", dispId = 0x69)
    String getOnKeyUp();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(220)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyUp", dispId = 0x69)
    void setOnKeyUp(String param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(221)</p>
     */
    @ComProperty(name = "OnKeyPress", dispId = 0x6a)
    String getOnKeyPress();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(222)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyPress", dispId = 0x6a)
    void setOnKeyPress(String param0);
            
    /**
     * <p>id(0x16f)</p>
     * <p>vtableId(223)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x16f)
    Byte getReadingOrder();
            
    /**
     * <p>id(0x16f)</p>
     * <p>vtableId(224)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x16f)
    void setReadingOrder(Byte param0);
            
    /**
     * <p>id(0x170)</p>
     * <p>vtableId(225)</p>
     */
    @ComProperty(name = "KeyboardLanguage", dispId = 0x170)
    Byte getKeyboardLanguage();
            
    /**
     * <p>id(0x170)</p>
     * <p>vtableId(226)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "KeyboardLanguage", dispId = 0x170)
    void setKeyboardLanguage(Byte param0);
            
    /**
     * <p>id(0x171)</p>
     * <p>vtableId(227)</p>
     */
    @ComProperty(name = "AllowedText", dispId = 0x171)
    Byte getAllowedText();
            
    /**
     * <p>id(0x171)</p>
     * <p>vtableId(228)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "AllowedText", dispId = 0x171)
    void setAllowedText(Byte param0);
            
    /**
     * <p>id(0x173)</p>
     * <p>vtableId(229)</p>
     */
    @ComProperty(name = "ScrollBarAlign", dispId = 0x173)
    Byte getScrollBarAlign();
            
    /**
     * <p>id(0x173)</p>
     * <p>vtableId(230)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "ScrollBarAlign", dispId = 0x173)
    void setScrollBarAlign(Byte param0);
            
    /**
     * <p>id(0x174)</p>
     * <p>vtableId(231)</p>
     */
    @ComProperty(name = "NumeralShapes", dispId = 0x174)
    Byte getNumeralShapes();
            
    /**
     * <p>id(0x174)</p>
     * <p>vtableId(232)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "NumeralShapes", dispId = 0x174)
    void setNumeralShapes(Byte param0);
            
    /**
     * <p>id(0x164)</p>
     * <p>vtableId(233)</p>
     */
    @ComProperty(name = "IMEMode", dispId = 0x164)
    AcImeMode getIMEMode();
            
    /**
     * <p>id(0x164)</p>
     * <p>vtableId(234)</p>
     * @param param0 [in] {@code AcImeMode}
     */
    @ComProperty(name = "IMEMode", dispId = 0x164)
    void setIMEMode(AcImeMode param0);
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(235)</p>
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    String getName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(236)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    void setName(String param0);
            
    /**
     * <p>id(0x17b)</p>
     * <p>vtableId(237)</p>
     */
    @ComProperty(name = "IMESentenceMode", dispId = 0x17b)
    AcImeSentenceMode getIMESentenceMode();
            
    /**
     * <p>id(0x17b)</p>
     * <p>vtableId(238)</p>
     * @param param0 [in] {@code AcImeSentenceMode}
     */
    @ComProperty(name = "IMESentenceMode", dispId = 0x17b)
    void setIMESentenceMode(AcImeSentenceMode param0);
            
    /**
     * <p>id(0x180)</p>
     * <p>vtableId(239)</p>
     */
    @ComProperty(name = "LeftMargin", dispId = 0x180)
    Short getLeftMargin();
            
    /**
     * <p>id(0x180)</p>
     * <p>vtableId(240)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "LeftMargin", dispId = 0x180)
    void setLeftMargin(Short param0);
            
    /**
     * <p>id(0x181)</p>
     * <p>vtableId(241)</p>
     */
    @ComProperty(name = "TopMargin", dispId = 0x181)
    Short getTopMargin();
            
    /**
     * <p>id(0x181)</p>
     * <p>vtableId(242)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "TopMargin", dispId = 0x181)
    void setTopMargin(Short param0);
            
    /**
     * <p>id(0x182)</p>
     * <p>vtableId(243)</p>
     */
    @ComProperty(name = "LineSpacing", dispId = 0x182)
    Short getLineSpacing();
            
    /**
     * <p>id(0x182)</p>
     * <p>vtableId(244)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "LineSpacing", dispId = 0x182)
    void setLineSpacing(Short param0);
            
    /**
     * <p>id(0x184)</p>
     * <p>vtableId(245)</p>
     */
    @ComProperty(name = "RightMargin", dispId = 0x184)
    Short getRightMargin();
            
    /**
     * <p>id(0x184)</p>
     * <p>vtableId(246)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "RightMargin", dispId = 0x184)
    void setRightMargin(Short param0);
            
    /**
     * <p>id(0x185)</p>
     * <p>vtableId(247)</p>
     */
    @ComProperty(name = "BottomMargin", dispId = 0x185)
    Short getBottomMargin();
            
    /**
     * <p>id(0x185)</p>
     * <p>vtableId(248)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "BottomMargin", dispId = 0x185)
    void setBottomMargin(Short param0);
            
    /**
     * <p>id(0x18c)</p>
     * <p>vtableId(249)</p>
     */
    @ComProperty(name = "IsHyperlink", dispId = 0x18c)
    Boolean getIsHyperlink();
            
    /**
     * <p>id(0x18c)</p>
     * <p>vtableId(250)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsHyperlink", dispId = 0x18c)
    void setIsHyperlink(Boolean param0);
            
    /**
     * <p>id(0x918)</p>
     * <p>vtableId(251)</p>
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
     * <p>id(0x177)</p>
     * <p>vtableId(252)</p>
     */
    @ComProperty(name = "OnDirty", dispId = 0x177)
    String getOnDirty();
            
    /**
     * <p>id(0x177)</p>
     * <p>vtableId(253)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDirty", dispId = 0x177)
    void setOnDirty(String param0);
            
    /**
     * <p>id(0x194)</p>
     * <p>vtableId(254)</p>
     */
    @ComProperty(name = "OnUndo", dispId = 0x194)
    String getOnUndo();
            
    /**
     * <p>id(0x194)</p>
     * <p>vtableId(255)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnUndo", dispId = 0x194)
    void setOnUndo(String param0);
            
    /**
     * <p>id(0x1be)</p>
     * <p>vtableId(256)</p>
     */
    @ComProperty(name = "AsianLineBreak", dispId = 0x1be)
    Boolean getAsianLineBreak();
            
    /**
     * <p>id(0x1be)</p>
     * <p>vtableId(257)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AsianLineBreak", dispId = 0x1be)
    void setAsianLineBreak(Boolean param0);
            
    /**
     * <p>id(0x98d)</p>
     * <p>vtableId(258)</p>
     */
    @ComProperty(name = "SmartTags", dispId = 0x98d)
    _SmartTags getSmartTags();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(259)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    /**
     * <p>id(0x99c)</p>
     * <p>vtableId(260)</p>
     */
    @ComProperty(name = "Layout", dispId = 0x99c)
    AcLayoutType getLayout();
            
    /**
     * <p>id(0x1dc)</p>
     * <p>vtableId(261)</p>
     */
    @ComProperty(name = "TextFormat", dispId = 0x1dc)
    AcTextFormat getTextFormat();
            
    /**
     * <p>id(0x1dc)</p>
     * <p>vtableId(262)</p>
     * @param param0 [in] {@code AcTextFormat}
     */
    @ComProperty(name = "TextFormat", dispId = 0x1dc)
    void setTextFormat(AcTextFormat param0);
            
    /**
     * <p>id(0x1c6)</p>
     * <p>vtableId(263)</p>
     */
    @ComProperty(name = "LeftPadding", dispId = 0x1c6)
    Short getLeftPadding();
            
    /**
     * <p>id(0x1c6)</p>
     * <p>vtableId(264)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "LeftPadding", dispId = 0x1c6)
    void setLeftPadding(Short param0);
            
    /**
     * <p>id(0x1c7)</p>
     * <p>vtableId(265)</p>
     */
    @ComProperty(name = "TopPadding", dispId = 0x1c7)
    Short getTopPadding();
            
    /**
     * <p>id(0x1c7)</p>
     * <p>vtableId(266)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "TopPadding", dispId = 0x1c7)
    void setTopPadding(Short param0);
            
    /**
     * <p>id(0x1c8)</p>
     * <p>vtableId(267)</p>
     */
    @ComProperty(name = "RightPadding", dispId = 0x1c8)
    Short getRightPadding();
            
    /**
     * <p>id(0x1c8)</p>
     * <p>vtableId(268)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "RightPadding", dispId = 0x1c8)
    void setRightPadding(Short param0);
            
    /**
     * <p>id(0x1c9)</p>
     * <p>vtableId(269)</p>
     */
    @ComProperty(name = "BottomPadding", dispId = 0x1c9)
    Short getBottomPadding();
            
    /**
     * <p>id(0x1c9)</p>
     * <p>vtableId(270)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "BottomPadding", dispId = 0x1c9)
    void setBottomPadding(Short param0);
            
    /**
     * <p>id(0x1ca)</p>
     * <p>vtableId(271)</p>
     */
    @ComProperty(name = "GridlineStyleLeft", dispId = 0x1ca)
    Byte getGridlineStyleLeft();
            
    /**
     * <p>id(0x1ca)</p>
     * <p>vtableId(272)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleLeft", dispId = 0x1ca)
    void setGridlineStyleLeft(Byte param0);
            
    /**
     * <p>id(0x1cb)</p>
     * <p>vtableId(273)</p>
     */
    @ComProperty(name = "GridlineStyleTop", dispId = 0x1cb)
    Byte getGridlineStyleTop();
            
    /**
     * <p>id(0x1cb)</p>
     * <p>vtableId(274)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleTop", dispId = 0x1cb)
    void setGridlineStyleTop(Byte param0);
            
    /**
     * <p>id(0x1cc)</p>
     * <p>vtableId(275)</p>
     */
    @ComProperty(name = "GridlineStyleRight", dispId = 0x1cc)
    Byte getGridlineStyleRight();
            
    /**
     * <p>id(0x1cc)</p>
     * <p>vtableId(276)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleRight", dispId = 0x1cc)
    void setGridlineStyleRight(Byte param0);
            
    /**
     * <p>id(0x1cd)</p>
     * <p>vtableId(277)</p>
     */
    @ComProperty(name = "GridlineStyleBottom", dispId = 0x1cd)
    Byte getGridlineStyleBottom();
            
    /**
     * <p>id(0x1cd)</p>
     * <p>vtableId(278)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleBottom", dispId = 0x1cd)
    void setGridlineStyleBottom(Byte param0);
            
    /**
     * <p>id(0x1cf)</p>
     * <p>vtableId(279)</p>
     */
    @ComProperty(name = "GridlineWidthLeft", dispId = 0x1cf)
    Byte getGridlineWidthLeft();
            
    /**
     * <p>id(0x1cf)</p>
     * <p>vtableId(280)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthLeft", dispId = 0x1cf)
    void setGridlineWidthLeft(Byte param0);
            
    /**
     * <p>id(0x1d0)</p>
     * <p>vtableId(281)</p>
     */
    @ComProperty(name = "GridlineWidthTop", dispId = 0x1d0)
    Byte getGridlineWidthTop();
            
    /**
     * <p>id(0x1d0)</p>
     * <p>vtableId(282)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthTop", dispId = 0x1d0)
    void setGridlineWidthTop(Byte param0);
            
    /**
     * <p>id(0x1d1)</p>
     * <p>vtableId(283)</p>
     */
    @ComProperty(name = "GridlineWidthRight", dispId = 0x1d1)
    Byte getGridlineWidthRight();
            
    /**
     * <p>id(0x1d1)</p>
     * <p>vtableId(284)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthRight", dispId = 0x1d1)
    void setGridlineWidthRight(Byte param0);
            
    /**
     * <p>id(0x1d2)</p>
     * <p>vtableId(285)</p>
     */
    @ComProperty(name = "GridlineWidthBottom", dispId = 0x1d2)
    Byte getGridlineWidthBottom();
            
    /**
     * <p>id(0x1d2)</p>
     * <p>vtableId(286)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthBottom", dispId = 0x1d2)
    void setGridlineWidthBottom(Byte param0);
            
    /**
     * <p>id(0x1ce)</p>
     * <p>vtableId(287)</p>
     */
    @ComProperty(name = "GridlineColor", dispId = 0x1ce)
    Integer getGridlineColor();
            
    /**
     * <p>id(0x1ce)</p>
     * <p>vtableId(288)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "GridlineColor", dispId = 0x1ce)
    void setGridlineColor(Integer param0);
            
    /**
     * <p>id(0x1de)</p>
     * <p>vtableId(289)</p>
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x1de)
    AcHorizontalAnchor getHorizontalAnchor();
            
    /**
     * <p>id(0x1de)</p>
     * <p>vtableId(290)</p>
     * @param param0 [in] {@code AcHorizontalAnchor}
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x1de)
    void setHorizontalAnchor(AcHorizontalAnchor param0);
            
    /**
     * <p>id(0x1dd)</p>
     * <p>vtableId(291)</p>
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x1dd)
    AcVerticalAnchor getVerticalAnchor();
            
    /**
     * <p>id(0x1dd)</p>
     * <p>vtableId(292)</p>
     * @param param0 [in] {@code AcVerticalAnchor}
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x1dd)
    void setVerticalAnchor(AcVerticalAnchor param0);
            
    /**
     * <p>id(0x1f0)</p>
     * <p>vtableId(293)</p>
     */
    @ComProperty(name = "BeforeUpdateMacro", dispId = 0x1f0)
    String getBeforeUpdateMacro();
            
    /**
     * <p>id(0x1f0)</p>
     * <p>vtableId(294)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BeforeUpdateMacro", dispId = 0x1f0)
    void setBeforeUpdateMacro(String param0);
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(295)</p>
     */
    @ComProperty(name = "AfterUpdateMacro", dispId = 0x1f9)
    String getAfterUpdateMacro();
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(296)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AfterUpdateMacro", dispId = 0x1f9)
    void setAfterUpdateMacro(String param0);
            
    /**
     * <p>id(0x1fa)</p>
     * <p>vtableId(297)</p>
     */
    @ComProperty(name = "OnChangeMacro", dispId = 0x1fa)
    String getOnChangeMacro();
            
    /**
     * <p>id(0x1fa)</p>
     * <p>vtableId(298)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnChangeMacro", dispId = 0x1fa)
    void setOnChangeMacro(String param0);
            
    /**
     * <p>id(0x1f1)</p>
     * <p>vtableId(299)</p>
     */
    @ComProperty(name = "OnEnterMacro", dispId = 0x1f1)
    String getOnEnterMacro();
            
    /**
     * <p>id(0x1f1)</p>
     * <p>vtableId(300)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnEnterMacro", dispId = 0x1f1)
    void setOnEnterMacro(String param0);
            
    /**
     * <p>id(0x1f2)</p>
     * <p>vtableId(301)</p>
     */
    @ComProperty(name = "OnExitMacro", dispId = 0x1f2)
    String getOnExitMacro();
            
    /**
     * <p>id(0x1f2)</p>
     * <p>vtableId(302)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnExitMacro", dispId = 0x1f2)
    void setOnExitMacro(String param0);
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(303)</p>
     */
    @ComProperty(name = "OnGotFocusMacro", dispId = 0x1f6)
    String getOnGotFocusMacro();
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(304)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnGotFocusMacro", dispId = 0x1f6)
    void setOnGotFocusMacro(String param0);
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(305)</p>
     */
    @ComProperty(name = "OnLostFocusMacro", dispId = 0x1f7)
    String getOnLostFocusMacro();
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(306)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnLostFocusMacro", dispId = 0x1f7)
    void setOnLostFocusMacro(String param0);
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(307)</p>
     */
    @ComProperty(name = "OnClickMacro", dispId = 0x1ea)
    String getOnClickMacro();
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(308)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnClickMacro", dispId = 0x1ea)
    void setOnClickMacro(String param0);
            
    /**
     * <p>id(0x1eb)</p>
     * <p>vtableId(309)</p>
     */
    @ComProperty(name = "OnDblClickMacro", dispId = 0x1eb)
    String getOnDblClickMacro();
            
    /**
     * <p>id(0x1eb)</p>
     * <p>vtableId(310)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDblClickMacro", dispId = 0x1eb)
    void setOnDblClickMacro(String param0);
            
    /**
     * <p>id(0x1e7)</p>
     * <p>vtableId(311)</p>
     */
    @ComProperty(name = "OnMouseDownMacro", dispId = 0x1e7)
    String getOnMouseDownMacro();
            
    /**
     * <p>id(0x1e7)</p>
     * <p>vtableId(312)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseDownMacro", dispId = 0x1e7)
    void setOnMouseDownMacro(String param0);
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(313)</p>
     */
    @ComProperty(name = "OnMouseMoveMacro", dispId = 0x1e9)
    String getOnMouseMoveMacro();
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(314)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseMoveMacro", dispId = 0x1e9)
    void setOnMouseMoveMacro(String param0);
            
    /**
     * <p>id(0x1e8)</p>
     * <p>vtableId(315)</p>
     */
    @ComProperty(name = "OnMouseUpMacro", dispId = 0x1e8)
    String getOnMouseUpMacro();
            
    /**
     * <p>id(0x1e8)</p>
     * <p>vtableId(316)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseUpMacro", dispId = 0x1e8)
    void setOnMouseUpMacro(String param0);
            
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(317)</p>
     */
    @ComProperty(name = "OnKeyDownMacro", dispId = 0x1f4)
    String getOnKeyDownMacro();
            
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(318)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyDownMacro", dispId = 0x1f4)
    void setOnKeyDownMacro(String param0);
            
    /**
     * <p>id(0x1f5)</p>
     * <p>vtableId(319)</p>
     */
    @ComProperty(name = "OnKeyUpMacro", dispId = 0x1f5)
    String getOnKeyUpMacro();
            
    /**
     * <p>id(0x1f5)</p>
     * <p>vtableId(320)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyUpMacro", dispId = 0x1f5)
    void setOnKeyUpMacro(String param0);
            
    /**
     * <p>id(0x1f3)</p>
     * <p>vtableId(321)</p>
     */
    @ComProperty(name = "OnKeyPressMacro", dispId = 0x1f3)
    String getOnKeyPressMacro();
            
    /**
     * <p>id(0x1f3)</p>
     * <p>vtableId(322)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyPressMacro", dispId = 0x1f3)
    void setOnKeyPressMacro(String param0);
            
    /**
     * <p>id(0x9bc)</p>
     * <p>vtableId(323)</p>
     */
    @ComProperty(name = "LayoutID", dispId = 0x9bc)
    Integer getLayoutID();
            
    /**
     * <p>id(0x24f)</p>
     * <p>vtableId(324)</p>
     */
    @ComProperty(name = "DisplayAsHyperlink", dispId = 0x24f)
    AcDisplayAsHyperlink getDisplayAsHyperlink();
            
    /**
     * <p>id(0x24f)</p>
     * <p>vtableId(325)</p>
     * @param param0 [in] {@code AcDisplayAsHyperlink}
     */
    @ComProperty(name = "DisplayAsHyperlink", dispId = 0x24f)
    void setDisplayAsHyperlink(AcDisplayAsHyperlink param0);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(326)</p>
     */
    @ComProperty(name = "ShowDatePicker", dispId = 0x1e6)
    Short getShowDatePicker();
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(327)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "ShowDatePicker", dispId = 0x1e6)
    void setShowDatePicker(Short param0);
            
    /**
     * <p>id(0x27a)</p>
     * <p>vtableId(328)</p>
     */
    @ComProperty(name = "Target", dispId = 0x27a)
    String getTarget();
            
    /**
     * <p>id(0x27a)</p>
     * <p>vtableId(329)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Target", dispId = 0x27a)
    void setTarget(String param0);
            
    /**
     * <p>id(0x268)</p>
     * <p>vtableId(330)</p>
     */
    @ComProperty(name = "BackThemeColorIndex", dispId = 0x268)
    Integer getBackThemeColorIndex();
            
    /**
     * <p>id(0x268)</p>
     * <p>vtableId(331)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BackThemeColorIndex", dispId = 0x268)
    void setBackThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(332)</p>
     */
    @ComProperty(name = "BackTint", dispId = 0x269)
    Float getBackTint();
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(333)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BackTint", dispId = 0x269)
    void setBackTint(Float param0);
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(334)</p>
     */
    @ComProperty(name = "BackShade", dispId = 0x26a)
    Float getBackShade();
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(335)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BackShade", dispId = 0x26a)
    void setBackShade(Float param0);
            
    /**
     * <p>id(0x26b)</p>
     * <p>vtableId(336)</p>
     */
    @ComProperty(name = "BorderThemeColorIndex", dispId = 0x26b)
    Integer getBorderThemeColorIndex();
            
    /**
     * <p>id(0x26b)</p>
     * <p>vtableId(337)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BorderThemeColorIndex", dispId = 0x26b)
    void setBorderThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x26c)</p>
     * <p>vtableId(338)</p>
     */
    @ComProperty(name = "BorderTint", dispId = 0x26c)
    Float getBorderTint();
            
    /**
     * <p>id(0x26c)</p>
     * <p>vtableId(339)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BorderTint", dispId = 0x26c)
    void setBorderTint(Float param0);
            
    /**
     * <p>id(0x26d)</p>
     * <p>vtableId(340)</p>
     */
    @ComProperty(name = "BorderShade", dispId = 0x26d)
    Float getBorderShade();
            
    /**
     * <p>id(0x26d)</p>
     * <p>vtableId(341)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BorderShade", dispId = 0x26d)
    void setBorderShade(Float param0);
            
    /**
     * <p>id(0x26e)</p>
     * <p>vtableId(342)</p>
     */
    @ComProperty(name = "ForeThemeColorIndex", dispId = 0x26e)
    Integer getForeThemeColorIndex();
            
    /**
     * <p>id(0x26e)</p>
     * <p>vtableId(343)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ForeThemeColorIndex", dispId = 0x26e)
    void setForeThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x26f)</p>
     * <p>vtableId(344)</p>
     */
    @ComProperty(name = "ForeTint", dispId = 0x26f)
    Float getForeTint();
            
    /**
     * <p>id(0x26f)</p>
     * <p>vtableId(345)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ForeTint", dispId = 0x26f)
    void setForeTint(Float param0);
            
    /**
     * <p>id(0x270)</p>
     * <p>vtableId(346)</p>
     */
    @ComProperty(name = "ForeShade", dispId = 0x270)
    Float getForeShade();
            
    /**
     * <p>id(0x270)</p>
     * <p>vtableId(347)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ForeShade", dispId = 0x270)
    void setForeShade(Float param0);
            
    /**
     * <p>id(0x267)</p>
     * <p>vtableId(348)</p>
     */
    @ComProperty(name = "ThemeFontIndex", dispId = 0x267)
    Integer getThemeFontIndex();
            
    /**
     * <p>id(0x267)</p>
     * <p>vtableId(349)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ThemeFontIndex", dispId = 0x267)
    void setThemeFontIndex(Integer param0);
            
    /**
     * <p>id(0x271)</p>
     * <p>vtableId(350)</p>
     */
    @ComProperty(name = "GridlineThemeColorIndex", dispId = 0x271)
    Integer getGridlineThemeColorIndex();
            
    /**
     * <p>id(0x271)</p>
     * <p>vtableId(351)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "GridlineThemeColorIndex", dispId = 0x271)
    void setGridlineThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x272)</p>
     * <p>vtableId(352)</p>
     */
    @ComProperty(name = "GridlineTint", dispId = 0x272)
    Float getGridlineTint();
            
    /**
     * <p>id(0x272)</p>
     * <p>vtableId(353)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "GridlineTint", dispId = 0x272)
    void setGridlineTint(Float param0);
            
    /**
     * <p>id(0x273)</p>
     * <p>vtableId(354)</p>
     */
    @ComProperty(name = "GridlineShade", dispId = 0x273)
    Float getGridlineShade();
            
    /**
     * <p>id(0x273)</p>
     * <p>vtableId(355)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "GridlineShade", dispId = 0x273)
    void setGridlineShade(Float param0);
            
    
}