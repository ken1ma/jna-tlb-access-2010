
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3B06E964-E47C-11CD-8701-00AA003F0F07})</p>
 */
@ComInterface(iid="{3B06E964-E47C-11CD-8701-00AA003F0F07}")
public interface _SubForm extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x829)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Form", dispId = 0x829)
    Form getForm();
            
    /**
     * <p>id(0x831)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Report", dispId = 0x831)
    Report getReport();
            
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
     * <p>id(0xfffffffb)</p>
     * <p>vtableId(34)</p>
     * @param bstrExpr [in] {@code String}
     * @param ppsa [in] {@code Object}
     */
    @ComMethod(name = "_Evaluate", dispId = 0xfffffffb)
    Object _Evaluate(String bstrExpr,
            Object ppsa);
            
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
     * <p>id(0x7e2)</p>
     * <p>vtableId(37)</p>
     */
    @ComMethod(name = "Requery", dispId = 0x7e2)
    void Requery();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Controls", dispId = 0x0)
    Controls getControls();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "EventProcPrefix", dispId = 0x16)
    String getEventProcPrefix();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "EventProcPrefix", dispId = 0x16)
    void setEventProcPrefix(String param0);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    String get_Name();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    void set_Name(String param0);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "ControlType", dispId = 0x15)
    Byte getControlType();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "ControlType", dispId = 0x15)
    void setControlType(Byte param0);
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "SourceObject", dispId = 0x84)
    String getSourceObject();
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SourceObject", dispId = 0x84)
    void setSourceObject(String param0);
            
    /**
     * <p>id(0x31)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "LinkChildFields", dispId = 0x31)
    String getLinkChildFields();
            
    /**
     * <p>id(0x31)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "LinkChildFields", dispId = 0x31)
    void setLinkChildFields(String param0);
            
    /**
     * <p>id(0x32)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "LinkMasterFields", dispId = 0x32)
    String getLinkMasterFields();
            
    /**
     * <p>id(0x32)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "LinkMasterFields", dispId = 0x32)
    void setLinkMasterFields(String param0);
            
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
     * <p>id(0x95)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "DisplayWhen", dispId = 0x95)
    Byte getDisplayWhen();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "DisplayWhen", dispId = 0x95)
    void setDisplayWhen(Byte param0);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x19)
    Boolean getEnabled();
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x19)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x38)
    Boolean getLocked();
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x38)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "TabStop", dispId = 0x106)
    Boolean getTabStop();
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TabStop", dispId = 0x106)
    void setTabStop(Boolean param0);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "TabIndex", dispId = 0x105)
    Short getTabIndex();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(64)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "TabIndex", dispId = 0x105)
    void setTabIndex(Short param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "CanGrow", dispId = 0xe)
    Boolean getCanGrow();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CanGrow", dispId = 0xe)
    void setCanGrow(Boolean param0);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "CanShrink", dispId = 0x10)
    Boolean getCanShrink();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CanShrink", dispId = 0x10)
    void setCanShrink(Boolean param0);
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "Left", dispId = 0x36)
    Short getLeft();
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Left", dispId = 0x36)
    void setLeft(Short param0);
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "Top", dispId = 0x8d)
    Short getTop();
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Top", dispId = 0x8d)
    void setTop(Short param0);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "Width", dispId = 0x96)
    Short getWidth();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Width", dispId = 0x96)
    void setWidth(Short param0);
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "Height", dispId = 0x2c)
    Short getHeight();
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(76)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Height", dispId = 0x2c)
    void setHeight(Short param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "SpecialEffect", dispId = 0x4)
    Byte getSpecialEffect();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "SpecialEffect", dispId = 0x4)
    void setSpecialEffect(Byte param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "BorderStyle", dispId = 0x9)
    Byte getBorderStyle();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "BorderStyle", dispId = 0x9)
    void setBorderStyle(Byte param0);
            
    /**
     * <p>id(0x149)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "OldBorderStyle", dispId = 0x149)
    Byte getOldBorderStyle();
            
    /**
     * <p>id(0x149)</p>
     * <p>vtableId(82)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "OldBorderStyle", dispId = 0x149)
    void setOldBorderStyle(Byte param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "BorderWidth", dispId = 0xa)
    Byte getBorderWidth();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(84)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "BorderWidth", dispId = 0xa)
    void setBorderWidth(Byte param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "BorderLineStyle", dispId = 0xb)
    Byte getBorderLineStyle();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(86)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "BorderLineStyle", dispId = 0xb)
    void setBorderLineStyle(Byte param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "BorderColor", dispId = 0x8)
    Integer getBorderColor();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(88)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BorderColor", dispId = 0x8)
    void setBorderColor(Integer param0);
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "AutoLabel", dispId = 0x39)
    Boolean getAutoLabel();
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(90)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoLabel", dispId = 0x39)
    void setAutoLabel(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "AddColon", dispId = 0x3)
    Boolean getAddColon();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(92)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AddColon", dispId = 0x3)
    void setAddColon(Boolean param0);
            
    /**
     * <p>id(0x34)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "LabelX", dispId = 0x34)
    Short getLabelX();
            
    /**
     * <p>id(0x34)</p>
     * <p>vtableId(94)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "LabelX", dispId = 0x34)
    void setLabelX(Short param0);
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(95)</p>
     */
    @ComProperty(name = "LabelY", dispId = 0x35)
    Short getLabelY();
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(96)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "LabelY", dispId = 0x35)
    void setLabelY(Short param0);
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "LabelAlign", dispId = 0x33)
    Byte getLabelAlign();
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(98)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "LabelAlign", dispId = 0x33)
    void setLabelAlign(Byte param0);
            
    /**
     * <p>id(0xed)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "Section", dispId = 0xed)
    Short getSection();
            
    /**
     * <p>id(0xed)</p>
     * <p>vtableId(100)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Section", dispId = 0xed)
    void setSection(Short param0);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(101)</p>
     */
    @ComProperty(name = "ControlName", dispId = 0x109)
    String getControlName();
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(102)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ControlName", dispId = 0x109)
    void setControlName(String param0);
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    String getTag();
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(104)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    void setTag(String param0);
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(105)</p>
     */
    @ComProperty(name = "IsVisible", dispId = 0x8c)
    Boolean getIsVisible();
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(106)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsVisible", dispId = 0x8c)
    void setIsVisible(Boolean param0);
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(107)</p>
     */
    @ComProperty(name = "InSelection", dispId = 0x118)
    Boolean getInSelection();
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(108)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InSelection", dispId = 0x118)
    void setInSelection(Boolean param0);
            
    /**
     * <p>id(0xde)</p>
     * <p>vtableId(109)</p>
     */
    @ComProperty(name = "OnEnter", dispId = 0xde)
    String getOnEnter();
            
    /**
     * <p>id(0xde)</p>
     * <p>vtableId(110)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnEnter", dispId = 0xde)
    void setOnEnter(String param0);
            
    /**
     * <p>id(0xdf)</p>
     * <p>vtableId(111)</p>
     */
    @ComProperty(name = "OnExit", dispId = 0xdf)
    String getOnExit();
            
    /**
     * <p>id(0xdf)</p>
     * <p>vtableId(112)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnExit", dispId = 0xdf)
    void setOnExit(String param0);
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(113)</p>
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    String getName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(114)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    void setName(String param0);
            
    /**
     * <p>id(0x918)</p>
     * <p>vtableId(115)</p>
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
     * <p>vtableId(116)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    /**
     * <p>id(0x1f1)</p>
     * <p>vtableId(117)</p>
     */
    @ComProperty(name = "OnEnterMacro", dispId = 0x1f1)
    String getOnEnterMacro();
            
    /**
     * <p>id(0x1f1)</p>
     * <p>vtableId(118)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnEnterMacro", dispId = 0x1f1)
    void setOnEnterMacro(String param0);
            
    /**
     * <p>id(0x1f2)</p>
     * <p>vtableId(119)</p>
     */
    @ComProperty(name = "OnExitMacro", dispId = 0x1f2)
    String getOnExitMacro();
            
    /**
     * <p>id(0x1f2)</p>
     * <p>vtableId(120)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnExitMacro", dispId = 0x1f2)
    void setOnExitMacro(String param0);
            
    /**
     * <p>id(0x99c)</p>
     * <p>vtableId(121)</p>
     */
    @ComProperty(name = "Layout", dispId = 0x99c)
    AcLayoutType getLayout();
            
    /**
     * <p>id(0x1c6)</p>
     * <p>vtableId(122)</p>
     */
    @ComProperty(name = "LeftPadding", dispId = 0x1c6)
    Short getLeftPadding();
            
    /**
     * <p>id(0x1c6)</p>
     * <p>vtableId(123)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "LeftPadding", dispId = 0x1c6)
    void setLeftPadding(Short param0);
            
    /**
     * <p>id(0x1c7)</p>
     * <p>vtableId(124)</p>
     */
    @ComProperty(name = "TopPadding", dispId = 0x1c7)
    Short getTopPadding();
            
    /**
     * <p>id(0x1c7)</p>
     * <p>vtableId(125)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "TopPadding", dispId = 0x1c7)
    void setTopPadding(Short param0);
            
    /**
     * <p>id(0x1c8)</p>
     * <p>vtableId(126)</p>
     */
    @ComProperty(name = "RightPadding", dispId = 0x1c8)
    Short getRightPadding();
            
    /**
     * <p>id(0x1c8)</p>
     * <p>vtableId(127)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "RightPadding", dispId = 0x1c8)
    void setRightPadding(Short param0);
            
    /**
     * <p>id(0x1c9)</p>
     * <p>vtableId(128)</p>
     */
    @ComProperty(name = "BottomPadding", dispId = 0x1c9)
    Short getBottomPadding();
            
    /**
     * <p>id(0x1c9)</p>
     * <p>vtableId(129)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "BottomPadding", dispId = 0x1c9)
    void setBottomPadding(Short param0);
            
    /**
     * <p>id(0x1ca)</p>
     * <p>vtableId(130)</p>
     */
    @ComProperty(name = "GridlineStyleLeft", dispId = 0x1ca)
    Byte getGridlineStyleLeft();
            
    /**
     * <p>id(0x1ca)</p>
     * <p>vtableId(131)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleLeft", dispId = 0x1ca)
    void setGridlineStyleLeft(Byte param0);
            
    /**
     * <p>id(0x1cb)</p>
     * <p>vtableId(132)</p>
     */
    @ComProperty(name = "GridlineStyleTop", dispId = 0x1cb)
    Byte getGridlineStyleTop();
            
    /**
     * <p>id(0x1cb)</p>
     * <p>vtableId(133)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleTop", dispId = 0x1cb)
    void setGridlineStyleTop(Byte param0);
            
    /**
     * <p>id(0x1cc)</p>
     * <p>vtableId(134)</p>
     */
    @ComProperty(name = "GridlineStyleRight", dispId = 0x1cc)
    Byte getGridlineStyleRight();
            
    /**
     * <p>id(0x1cc)</p>
     * <p>vtableId(135)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleRight", dispId = 0x1cc)
    void setGridlineStyleRight(Byte param0);
            
    /**
     * <p>id(0x1cd)</p>
     * <p>vtableId(136)</p>
     */
    @ComProperty(name = "GridlineStyleBottom", dispId = 0x1cd)
    Byte getGridlineStyleBottom();
            
    /**
     * <p>id(0x1cd)</p>
     * <p>vtableId(137)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleBottom", dispId = 0x1cd)
    void setGridlineStyleBottom(Byte param0);
            
    /**
     * <p>id(0x1cf)</p>
     * <p>vtableId(138)</p>
     */
    @ComProperty(name = "GridlineWidthLeft", dispId = 0x1cf)
    Byte getGridlineWidthLeft();
            
    /**
     * <p>id(0x1cf)</p>
     * <p>vtableId(139)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthLeft", dispId = 0x1cf)
    void setGridlineWidthLeft(Byte param0);
            
    /**
     * <p>id(0x1d0)</p>
     * <p>vtableId(140)</p>
     */
    @ComProperty(name = "GridlineWidthTop", dispId = 0x1d0)
    Byte getGridlineWidthTop();
            
    /**
     * <p>id(0x1d0)</p>
     * <p>vtableId(141)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthTop", dispId = 0x1d0)
    void setGridlineWidthTop(Byte param0);
            
    /**
     * <p>id(0x1d1)</p>
     * <p>vtableId(142)</p>
     */
    @ComProperty(name = "GridlineWidthRight", dispId = 0x1d1)
    Byte getGridlineWidthRight();
            
    /**
     * <p>id(0x1d1)</p>
     * <p>vtableId(143)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthRight", dispId = 0x1d1)
    void setGridlineWidthRight(Byte param0);
            
    /**
     * <p>id(0x1d2)</p>
     * <p>vtableId(144)</p>
     */
    @ComProperty(name = "GridlineWidthBottom", dispId = 0x1d2)
    Byte getGridlineWidthBottom();
            
    /**
     * <p>id(0x1d2)</p>
     * <p>vtableId(145)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthBottom", dispId = 0x1d2)
    void setGridlineWidthBottom(Byte param0);
            
    /**
     * <p>id(0x1ce)</p>
     * <p>vtableId(146)</p>
     */
    @ComProperty(name = "GridlineColor", dispId = 0x1ce)
    Integer getGridlineColor();
            
    /**
     * <p>id(0x1ce)</p>
     * <p>vtableId(147)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "GridlineColor", dispId = 0x1ce)
    void setGridlineColor(Integer param0);
            
    /**
     * <p>id(0x1de)</p>
     * <p>vtableId(148)</p>
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x1de)
    AcHorizontalAnchor getHorizontalAnchor();
            
    /**
     * <p>id(0x1de)</p>
     * <p>vtableId(149)</p>
     * @param param0 [in] {@code AcHorizontalAnchor}
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x1de)
    void setHorizontalAnchor(AcHorizontalAnchor param0);
            
    /**
     * <p>id(0x1dd)</p>
     * <p>vtableId(150)</p>
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x1dd)
    AcVerticalAnchor getVerticalAnchor();
            
    /**
     * <p>id(0x1dd)</p>
     * <p>vtableId(151)</p>
     * @param param0 [in] {@code AcVerticalAnchor}
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x1dd)
    void setVerticalAnchor(AcVerticalAnchor param0);
            
    /**
     * <p>id(0x240)</p>
     * <p>vtableId(152)</p>
     */
    @ComProperty(name = "FilterOnEmptyMaster", dispId = 0x240)
    Boolean getFilterOnEmptyMaster();
            
    /**
     * <p>id(0x240)</p>
     * <p>vtableId(153)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FilterOnEmptyMaster", dispId = 0x240)
    void setFilterOnEmptyMaster(Boolean param0);
            
    /**
     * <p>id(0x9bc)</p>
     * <p>vtableId(154)</p>
     */
    @ComProperty(name = "LayoutID", dispId = 0x9bc)
    Integer getLayoutID();
            
    /**
     * <p>id(0x26b)</p>
     * <p>vtableId(155)</p>
     */
    @ComProperty(name = "BorderThemeColorIndex", dispId = 0x26b)
    Integer getBorderThemeColorIndex();
            
    /**
     * <p>id(0x26b)</p>
     * <p>vtableId(156)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BorderThemeColorIndex", dispId = 0x26b)
    void setBorderThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x26c)</p>
     * <p>vtableId(157)</p>
     */
    @ComProperty(name = "BorderTint", dispId = 0x26c)
    Float getBorderTint();
            
    /**
     * <p>id(0x26c)</p>
     * <p>vtableId(158)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BorderTint", dispId = 0x26c)
    void setBorderTint(Float param0);
            
    /**
     * <p>id(0x26d)</p>
     * <p>vtableId(159)</p>
     */
    @ComProperty(name = "BorderShade", dispId = 0x26d)
    Float getBorderShade();
            
    /**
     * <p>id(0x26d)</p>
     * <p>vtableId(160)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BorderShade", dispId = 0x26d)
    void setBorderShade(Float param0);
            
    /**
     * <p>id(0x271)</p>
     * <p>vtableId(161)</p>
     */
    @ComProperty(name = "GridlineThemeColorIndex", dispId = 0x271)
    Integer getGridlineThemeColorIndex();
            
    /**
     * <p>id(0x271)</p>
     * <p>vtableId(162)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "GridlineThemeColorIndex", dispId = 0x271)
    void setGridlineThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x272)</p>
     * <p>vtableId(163)</p>
     */
    @ComProperty(name = "GridlineTint", dispId = 0x272)
    Float getGridlineTint();
            
    /**
     * <p>id(0x272)</p>
     * <p>vtableId(164)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "GridlineTint", dispId = 0x272)
    void setGridlineTint(Float param0);
            
    /**
     * <p>id(0x273)</p>
     * <p>vtableId(165)</p>
     */
    @ComProperty(name = "GridlineShade", dispId = 0x273)
    Float getGridlineShade();
            
    /**
     * <p>id(0x273)</p>
     * <p>vtableId(166)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "GridlineShade", dispId = 0x273)
    void setGridlineShade(Float param0);
            
    
}