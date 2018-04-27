
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({331FDCFC-CF31-11CD-8701-00AA003F0F07})</p>
 */
@ComInterface(iid="{331FDCFC-CF31-11CD-8701-00AA003F0F07}")
public interface _Section extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x82b)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x82b)
    Properties getProperties();
            
    /**
     * <p>id(0x88e)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Controls", dispId = 0x88e)
    Children getControls();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "EventProcPrefix", dispId = 0x16)
    String getEventProcPrefix();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "EventProcPrefix", dispId = 0x16)
    void setEventProcPrefix(String param0);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    String get_Name();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    void set_Name(String param0);
            
    /**
     * <p>id(0x97)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ForceNewPage", dispId = 0x97)
    Byte getForceNewPage();
            
    /**
     * <p>id(0x97)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "ForceNewPage", dispId = 0x97)
    void setForceNewPage(Byte param0);
            
    /**
     * <p>id(0xe7)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "NewRowOrCol", dispId = 0xe7)
    Byte getNewRowOrCol();
            
    /**
     * <p>id(0xe7)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "NewRowOrCol", dispId = 0xe7)
    void setNewRowOrCol(Byte param0);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "KeepTogether", dispId = 0x4b)
    Boolean getKeepTogether();
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "KeepTogether", dispId = 0x4b)
    void setKeepTogether(Boolean param0);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    Boolean getVisible();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "DisplayWhen", dispId = 0x95)
    Byte getDisplayWhen();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "DisplayWhen", dispId = 0x95)
    void setDisplayWhen(Byte param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "CanGrow", dispId = 0xe)
    Boolean getCanGrow();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CanGrow", dispId = 0xe)
    void setCanGrow(Boolean param0);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "CanShrink", dispId = 0x10)
    Boolean getCanShrink();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CanShrink", dispId = 0x10)
    void setCanShrink(Boolean param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "RepeatSection", dispId = 0xf)
    Boolean getRepeatSection();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RepeatSection", dispId = 0xf)
    void setRepeatSection(Boolean param0);
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Height", dispId = 0x2c)
    Short getHeight();
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Height", dispId = 0x2c)
    void setHeight(Short param0);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0x1c)
    Integer getBackColor();
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BackColor", dispId = 0x1c)
    void setBackColor(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "SpecialEffect", dispId = 0x4)
    Byte getSpecialEffect();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "SpecialEffect", dispId = 0x4)
    void setSpecialEffect(Byte param0);
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    String getTag();
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    void setTag(String param0);
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "OnFormat", dispId = 0x50)
    String getOnFormat();
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnFormat", dispId = 0x50)
    void setOnFormat(String param0);
            
    /**
     * <p>id(0x52)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "OnPrint", dispId = 0x52)
    String getOnPrint();
            
    /**
     * <p>id(0x52)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnPrint", dispId = 0x52)
    void setOnPrint(String param0);
            
    /**
     * <p>id(0x54)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "OnRetreat", dispId = 0x54)
    String getOnRetreat();
            
    /**
     * <p>id(0x54)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnRetreat", dispId = 0x54)
    void setOnRetreat(String param0);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "OnClick", dispId = 0x7e)
    String getOnClick();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnClick", dispId = 0x7e)
    void setOnClick(String param0);
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "OnDblClick", dispId = 0xe0)
    String getOnDblClick();
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDblClick", dispId = 0xe0)
    void setOnDblClick(String param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "OnMouseDown", dispId = 0x6b)
    String getOnMouseDown();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseDown", dispId = 0x6b)
    void setOnMouseDown(String param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "OnMouseMove", dispId = 0x6d)
    String getOnMouseMove();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseMove", dispId = 0x6d)
    void setOnMouseMove(String param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "OnMouseUp", dispId = 0x6c)
    String getOnMouseUp();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseUp", dispId = 0x6c)
    void setOnMouseUp(String param0);
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "HasContinued", dispId = 0xc8)
    Boolean getHasContinued();
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasContinued", dispId = 0xc8)
    void setHasContinued(Boolean param0);
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "WillContinue", dispId = 0xc9)
    Boolean getWillContinue();
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "WillContinue", dispId = 0xc9)
    void setWillContinue(Boolean param0);
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "InSelection", dispId = 0x118)
    Boolean getInSelection();
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InSelection", dispId = 0x118)
    void setInSelection(Boolean param0);
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    String getName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    void setName(String param0);
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(63)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    /**
     * <p>id(0x1db)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "AutoHeight", dispId = 0x1db)
    Boolean getAutoHeight();
            
    /**
     * <p>id(0x1db)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoHeight", dispId = 0x1db)
    void setAutoHeight(Boolean param0);
            
    /**
     * <p>id(0x1ed)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "OnFormatMacro", dispId = 0x1ed)
    String getOnFormatMacro();
            
    /**
     * <p>id(0x1ed)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnFormatMacro", dispId = 0x1ed)
    void setOnFormatMacro(String param0);
            
    /**
     * <p>id(0x1ee)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "OnPrintMacro", dispId = 0x1ee)
    String getOnPrintMacro();
            
    /**
     * <p>id(0x1ee)</p>
     * <p>vtableId(69)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnPrintMacro", dispId = 0x1ee)
    void setOnPrintMacro(String param0);
            
    /**
     * <p>id(0x1ef)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "OnRetreatMacro", dispId = 0x1ef)
    String getOnRetreatMacro();
            
    /**
     * <p>id(0x1ef)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnRetreatMacro", dispId = 0x1ef)
    void setOnRetreatMacro(String param0);
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "OnClickMacro", dispId = 0x1ea)
    String getOnClickMacro();
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnClickMacro", dispId = 0x1ea)
    void setOnClickMacro(String param0);
            
    /**
     * <p>id(0x1eb)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "OnDblClickMacro", dispId = 0x1eb)
    String getOnDblClickMacro();
            
    /**
     * <p>id(0x1eb)</p>
     * <p>vtableId(75)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDblClickMacro", dispId = 0x1eb)
    void setOnDblClickMacro(String param0);
            
    /**
     * <p>id(0x1e7)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "OnMouseDownMacro", dispId = 0x1e7)
    String getOnMouseDownMacro();
            
    /**
     * <p>id(0x1e7)</p>
     * <p>vtableId(77)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseDownMacro", dispId = 0x1e7)
    void setOnMouseDownMacro(String param0);
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "OnMouseMoveMacro", dispId = 0x1e9)
    String getOnMouseMoveMacro();
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(79)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseMoveMacro", dispId = 0x1e9)
    void setOnMouseMoveMacro(String param0);
            
    /**
     * <p>id(0x1e8)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "OnMouseUpMacro", dispId = 0x1e8)
    String getOnMouseUpMacro();
            
    /**
     * <p>id(0x1e8)</p>
     * <p>vtableId(81)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnMouseUpMacro", dispId = 0x1e8)
    void setOnMouseUpMacro(String param0);
            
    /**
     * <p>id(0x23b)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "AlternateBackColor", dispId = 0x23b)
    Integer getAlternateBackColor();
            
    /**
     * <p>id(0x23b)</p>
     * <p>vtableId(83)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "AlternateBackColor", dispId = 0x23b)
    void setAlternateBackColor(Integer param0);
            
    /**
     * <p>id(0x239)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "OnPaint", dispId = 0x239)
    String getOnPaint();
            
    /**
     * <p>id(0x239)</p>
     * <p>vtableId(85)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnPaint", dispId = 0x239)
    void setOnPaint(String param0);
            
    /**
     * <p>id(0x23a)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "OnPaintMacro", dispId = 0x23a)
    String getOnPaintMacro();
            
    /**
     * <p>id(0x23a)</p>
     * <p>vtableId(87)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnPaintMacro", dispId = 0x23a)
    void setOnPaintMacro(String param0);
            
    /**
     * <p>id(0x9c7)</p>
     * <p>vtableId(88)</p>
     */
    @ComMethod(name = "SetTabOrder", dispId = 0x9c7)
    void SetTabOrder();
            
    /**
     * <p>id(0x268)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "BackThemeColorIndex", dispId = 0x268)
    Integer getBackThemeColorIndex();
            
    /**
     * <p>id(0x268)</p>
     * <p>vtableId(90)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BackThemeColorIndex", dispId = 0x268)
    void setBackThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "BackTint", dispId = 0x269)
    Float getBackTint();
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(92)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BackTint", dispId = 0x269)
    void setBackTint(Float param0);
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "BackShade", dispId = 0x26a)
    Float getBackShade();
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(94)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BackShade", dispId = 0x26a)
    void setBackShade(Float param0);
            
    /**
     * <p>id(0x274)</p>
     * <p>vtableId(95)</p>
     */
    @ComProperty(name = "AlternateBackThemeColorIndex", dispId = 0x274)
    Integer getAlternateBackThemeColorIndex();
            
    /**
     * <p>id(0x274)</p>
     * <p>vtableId(96)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "AlternateBackThemeColorIndex", dispId = 0x274)
    void setAlternateBackThemeColorIndex(Integer param0);
            
    /**
     * <p>id(0x275)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "AlternateBackTint", dispId = 0x275)
    Float getAlternateBackTint();
            
    /**
     * <p>id(0x275)</p>
     * <p>vtableId(98)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "AlternateBackTint", dispId = 0x275)
    void setAlternateBackTint(Float param0);
            
    /**
     * <p>id(0x276)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "AlternateBackShade", dispId = 0x276)
    Float getAlternateBackShade();
            
    /**
     * <p>id(0x276)</p>
     * <p>vtableId(100)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "AlternateBackShade", dispId = 0x276)
    void setAlternateBackShade(Float param0);
            
    
}