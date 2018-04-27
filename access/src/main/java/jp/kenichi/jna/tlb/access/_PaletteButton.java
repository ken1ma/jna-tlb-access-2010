
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({9CD4A760-A6A9-11CE-A686-00AA003F0F07})</p>
 */
@ComInterface(iid="{9CD4A760-A6A9-11CE-A686-00AA003F0F07}")
public interface _PaletteButton extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x7d5)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x7d5)
    Application getApplication();
            
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x836)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "OldValue", dispId = 0x836)
    Object getOldValue();
            
    /**
     * <p>id(0x82b)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x82b)
    Properties getProperties();
            
    /**
     * <p>id(0x867)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "SizeToFit", dispId = 0x867)
    void SizeToFit();
            
    /**
     * <p>id(0x7e2)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Requery", dispId = 0x7e2)
    void Requery();
            
    /**
     * <p>id(0x7e7)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Goto", dispId = 0x7e7)
    void Goto();
            
    /**
     * <p>id(0x7e6)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "SetFocus", dispId = 0x7e6)
    void SetFocus();
            
    /**
     * <p>id(0x88e)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Controls", dispId = 0x88e)
    Children getControls();
            
    /**
     * <p>id(0xfffffffb)</p>
     * <p>vtableId(16)</p>
     * @param bstrExpr [in] {@code String}
     * @param ppsa [in] {@code Object}
     */
    @ComMethod(name = "_Evaluate", dispId = 0xfffffffb)
    Object _Evaluate(String bstrExpr,
            Object ppsa);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "EventProcPrefix", dispId = 0x16)
    String getEventProcPrefix();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "EventProcPrefix", dispId = 0x16)
    void setEventProcPrefix(String param0);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    String get_Name();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    void set_Name(String param0);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "ControlType", dispId = 0x15)
    Byte getControlType();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "ControlType", dispId = 0x15)
    void setControlType(Byte param0);
            
    /**
     * <p>id(0x3a)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "OptionValue", dispId = 0x3a)
    Integer getOptionValue();
            
    /**
     * <p>id(0x3a)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "OptionValue", dispId = 0x3a)
    void setOptionValue(Integer param0);
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "ControlSource", dispId = 0x1b)
    String getControlSource();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ControlSource", dispId = 0x1b)
    void setControlSource(String param0);
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "DefaultValue", dispId = 0x17)
    String getDefaultValue();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DefaultValue", dispId = 0x17)
    void setDefaultValue(String param0);
            
    /**
     * <p>id(0x91)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "ValidationRule", dispId = 0x91)
    String getValidationRule();
            
    /**
     * <p>id(0x91)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ValidationRule", dispId = 0x91)
    void setValidationRule(String param0);
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "ValidationText", dispId = 0x3d)
    String getValidationText();
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ValidationText", dispId = 0x3d)
    void setValidationText(String param0);
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "StatusBarText", dispId = 0x87)
    String getStatusBarText();
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "StatusBarText", dispId = 0x87)
    void setStatusBarText(String param0);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    Boolean getVisible();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "DisplayWhen", dispId = 0x95)
    Byte getDisplayWhen();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "DisplayWhen", dispId = 0x95)
    void setDisplayWhen(Byte param0);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x19)
    Boolean getEnabled();
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x19)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x38)
    Boolean getLocked();
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x38)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x126)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "TripleState", dispId = 0x126)
    Boolean getTripleState();
            
    /**
     * <p>id(0x126)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TripleState", dispId = 0x126)
    void setTripleState(Boolean param0);
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "TabStop", dispId = 0x106)
    Boolean getTabStop();
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TabStop", dispId = 0x106)
    void setTabStop(Boolean param0);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "TabIndex", dispId = 0x105)
    Short getTabIndex();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "TabIndex", dispId = 0x105)
    void setTabIndex(Short param0);
            
    /**
     * <p>id(0x45)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "HideDuplicates", dispId = 0x45)
    Boolean getHideDuplicates();
            
    /**
     * <p>id(0x45)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HideDuplicates", dispId = 0x45)
    void setHideDuplicates(Boolean param0);
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "Left", dispId = 0x36)
    Short getLeft();
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Left", dispId = 0x36)
    void setLeft(Short param0);
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "Top", dispId = 0x8d)
    Short getTop();
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Top", dispId = 0x8d)
    void setTop(Short param0);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "Width", dispId = 0x96)
    Short getWidth();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Width", dispId = 0x96)
    void setWidth(Short param0);
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "Height", dispId = 0x2c)
    Short getHeight();
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Height", dispId = 0x2c)
    void setHeight(Short param0);
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "BackStyle", dispId = 0x1d)
    Byte getBackStyle();
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "BackStyle", dispId = 0x1d)
    void setBackStyle(Byte param0);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0x1c)
    Integer getBackColor();
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(64)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BackColor", dispId = 0x1c)
    void setBackColor(Integer param0);
            
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
     * <p>id(0xa6)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xa6)
    Short getColumnWidth();
            
    /**
     * <p>id(0xa6)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xa6)
    void setColumnWidth(Short param0);
            
    /**
     * <p>id(0xa5)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "ColumnOrder", dispId = 0xa5)
    Short getColumnOrder();
            
    /**
     * <p>id(0xa5)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "ColumnOrder", dispId = 0xa5)
    void setColumnOrder(Short param0);
            
    /**
     * <p>id(0xa7)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "ColumnHidden", dispId = 0xa7)
    Boolean getColumnHidden();
            
    /**
     * <p>id(0xa7)</p>
     * <p>vtableId(76)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ColumnHidden", dispId = 0xa7)
    void setColumnHidden(Boolean param0);
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "AutoLabel", dispId = 0x39)
    Boolean getAutoLabel();
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoLabel", dispId = 0x39)
    void setAutoLabel(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "AddColon", dispId = 0x3)
    Boolean getAddColon();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AddColon", dispId = 0x3)
    void setAddColon(Boolean param0);
            
    /**
     * <p>id(0x34)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "LabelX", dispId = 0x34)
    Short getLabelX();
            
    /**
     * <p>id(0x34)</p>
     * <p>vtableId(82)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "LabelX", dispId = 0x34)
    void setLabelX(Short param0);
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "LabelY", dispId = 0x35)
    Short getLabelY();
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(84)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "LabelY", dispId = 0x35)
    void setLabelY(Short param0);
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "LabelAlign", dispId = 0x33)
    Byte getLabelAlign();
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(86)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "LabelAlign", dispId = 0x33)
    void setLabelAlign(Byte param0);
            
    /**
     * <p>id(0xed)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "Section", dispId = 0xed)
    Short getSection();
            
    /**
     * <p>id(0xed)</p>
     * <p>vtableId(88)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Section", dispId = 0xed)
    void setSection(Short param0);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "ControlName", dispId = 0x109)
    String getControlName();
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(90)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ControlName", dispId = 0x109)
    void setControlName(String param0);
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    String getTag();
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(92)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    void setTag(String param0);
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "IsVisible", dispId = 0x8c)
    Boolean getIsVisible();
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(94)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsVisible", dispId = 0x8c)
    void setIsVisible(Boolean param0);
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(95)</p>
     */
    @ComProperty(name = "InSelection", dispId = 0x118)
    Boolean getInSelection();
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(96)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InSelection", dispId = 0x118)
    void setInSelection(Boolean param0);
            
    /**
     * <p>id(0x55)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "BeforeUpdate", dispId = 0x55)
    String getBeforeUpdate();
            
    /**
     * <p>id(0x55)</p>
     * <p>vtableId(98)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BeforeUpdate", dispId = 0x55)
    void setBeforeUpdate(String param0);
            
    /**
     * <p>id(0x56)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "AfterUpdate", dispId = 0x56)
    String getAfterUpdate();
            
    /**
     * <p>id(0x56)</p>
     * <p>vtableId(100)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AfterUpdate", dispId = 0x56)
    void setAfterUpdate(String param0);
            
    /**
     * <p>id(0xde)</p>
     * <p>vtableId(101)</p>
     */
    @ComProperty(name = "OnEnter", dispId = 0xde)
    String getOnEnter();
            
    /**
     * <p>id(0xde)</p>
     * <p>vtableId(102)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnEnter", dispId = 0xde)
    void setOnEnter(String param0);
            
    /**
     * <p>id(0xdf)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "OnExit", dispId = 0xdf)
    String getOnExit();
            
    /**
     * <p>id(0xdf)</p>
     * <p>vtableId(104)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnExit", dispId = 0xdf)
    void setOnExit(String param0);
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(105)</p>
     */
    @ComProperty(name = "OnGotFocus", dispId = 0x73)
    String getOnGotFocus();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(106)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnGotFocus", dispId = 0x73)
    void setOnGotFocus(String param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(107)</p>
     */
    @ComProperty(name = "OnLostFocus", dispId = 0x74)
    String getOnLostFocus();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(108)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnLostFocus", dispId = 0x74)
    void setOnLostFocus(String param0);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(109)</p>
     */
    @ComProperty(name = "OnClick", dispId = 0x7e)
    String getOnClick();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(110)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnClick", dispId = 0x7e)
    void setOnClick(String param0);
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(111)</p>
     */
    @ComProperty(name = "OnDblClick", dispId = 0xe0)
    String getOnDblClick();
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(112)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDblClick", dispId = 0xe0)
    void setOnDblClick(String param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(113)</p>
     */
    @ComProperty(name = "OnMouseDown", dispId = 0x6b)
    String getOnMouseDown();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(114)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseDown", dispId = 0x6b)
    void setOnMouseDown(String param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(115)</p>
     */
    @ComProperty(name = "OnMouseMove", dispId = 0x6d)
    String getOnMouseMove();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(116)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseMove", dispId = 0x6d)
    void setOnMouseMove(String param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(117)</p>
     */
    @ComProperty(name = "OnMouseUp", dispId = 0x6c)
    String getOnMouseUp();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(118)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseUp", dispId = 0x6c)
    void setOnMouseUp(String param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(119)</p>
     */
    @ComProperty(name = "OnKeyDown", dispId = 0x68)
    String getOnKeyDown();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(120)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyDown", dispId = 0x68)
    void setOnKeyDown(String param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(121)</p>
     */
    @ComProperty(name = "OnKeyUp", dispId = 0x69)
    String getOnKeyUp();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(122)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyUp", dispId = 0x69)
    void setOnKeyUp(String param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(123)</p>
     */
    @ComProperty(name = "OnKeyPress", dispId = 0x6a)
    String getOnKeyPress();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(124)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyPress", dispId = 0x6a)
    void setOnKeyPress(String param0);
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(125)</p>
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    String getName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(126)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    void setName(String param0);
            
    /**
     * <p>id(0x918)</p>
     * <p>vtableId(127)</p>
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
     * <p>vtableId(128)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    /**
     * <p>id(0x1f0)</p>
     * <p>vtableId(129)</p>
     */
    @ComProperty(name = "BeforeUpdateMacro", dispId = 0x1f0)
    String getBeforeUpdateMacro();
            
    /**
     * <p>id(0x1f0)</p>
     * <p>vtableId(130)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BeforeUpdateMacro", dispId = 0x1f0)
    void setBeforeUpdateMacro(String param0);
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(131)</p>
     */
    @ComProperty(name = "AfterUpdateMacro", dispId = 0x1f9)
    String getAfterUpdateMacro();
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(132)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AfterUpdateMacro", dispId = 0x1f9)
    void setAfterUpdateMacro(String param0);
            
    /**
     * <p>id(0x1f1)</p>
     * <p>vtableId(133)</p>
     */
    @ComProperty(name = "OnEnterMacro", dispId = 0x1f1)
    String getOnEnterMacro();
            
    /**
     * <p>id(0x1f1)</p>
     * <p>vtableId(134)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnEnterMacro", dispId = 0x1f1)
    void setOnEnterMacro(String param0);
            
    /**
     * <p>id(0x1f2)</p>
     * <p>vtableId(135)</p>
     */
    @ComProperty(name = "OnExitMacro", dispId = 0x1f2)
    String getOnExitMacro();
            
    /**
     * <p>id(0x1f2)</p>
     * <p>vtableId(136)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnExitMacro", dispId = 0x1f2)
    void setOnExitMacro(String param0);
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(137)</p>
     */
    @ComProperty(name = "OnGotFocusMacro", dispId = 0x1f6)
    String getOnGotFocusMacro();
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(138)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnGotFocusMacro", dispId = 0x1f6)
    void setOnGotFocusMacro(String param0);
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(139)</p>
     */
    @ComProperty(name = "OnLostFocusMacro", dispId = 0x1f7)
    String getOnLostFocusMacro();
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(140)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnLostFocusMacro", dispId = 0x1f7)
    void setOnLostFocusMacro(String param0);
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(141)</p>
     */
    @ComProperty(name = "OnClickMacro", dispId = 0x1ea)
    String getOnClickMacro();
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(142)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnClickMacro", dispId = 0x1ea)
    void setOnClickMacro(String param0);
            
    /**
     * <p>id(0x1eb)</p>
     * <p>vtableId(143)</p>
     */
    @ComProperty(name = "OnDblClickMacro", dispId = 0x1eb)
    String getOnDblClickMacro();
            
    /**
     * <p>id(0x1eb)</p>
     * <p>vtableId(144)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDblClickMacro", dispId = 0x1eb)
    void setOnDblClickMacro(String param0);
            
    /**
     * <p>id(0x1e7)</p>
     * <p>vtableId(145)</p>
     */
    @ComProperty(name = "OnMouseDownMacro", dispId = 0x1e7)
    String getOnMouseDownMacro();
            
    /**
     * <p>id(0x1e7)</p>
     * <p>vtableId(146)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseDownMacro", dispId = 0x1e7)
    void setOnMouseDownMacro(String param0);
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(147)</p>
     */
    @ComProperty(name = "OnMouseMoveMacro", dispId = 0x1e9)
    String getOnMouseMoveMacro();
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(148)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseMoveMacro", dispId = 0x1e9)
    void setOnMouseMoveMacro(String param0);
            
    /**
     * <p>id(0x1e8)</p>
     * <p>vtableId(149)</p>
     */
    @ComProperty(name = "OnMouseUpMacro", dispId = 0x1e8)
    String getOnMouseUpMacro();
            
    /**
     * <p>id(0x1e8)</p>
     * <p>vtableId(150)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseUpMacro", dispId = 0x1e8)
    void setOnMouseUpMacro(String param0);
            
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(151)</p>
     */
    @ComProperty(name = "OnKeyDownMacro", dispId = 0x1f4)
    String getOnKeyDownMacro();
            
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(152)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyDownMacro", dispId = 0x1f4)
    void setOnKeyDownMacro(String param0);
            
    /**
     * <p>id(0x1f5)</p>
     * <p>vtableId(153)</p>
     */
    @ComProperty(name = "OnKeyUpMacro", dispId = 0x1f5)
    String getOnKeyUpMacro();
            
    /**
     * <p>id(0x1f5)</p>
     * <p>vtableId(154)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyUpMacro", dispId = 0x1f5)
    void setOnKeyUpMacro(String param0);
            
    /**
     * <p>id(0x1f3)</p>
     * <p>vtableId(155)</p>
     */
    @ComProperty(name = "OnKeyPressMacro", dispId = 0x1f3)
    String getOnKeyPressMacro();
            
    /**
     * <p>id(0x1f3)</p>
     * <p>vtableId(156)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnKeyPressMacro", dispId = 0x1f3)
    void setOnKeyPressMacro(String param0);
            
    
}