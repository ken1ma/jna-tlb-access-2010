
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({26B96540-8F8E-101B-AF4E-00AA003F0F07})</p>
 */
@ComInterface(iid="{26B96540-8F8E-101B-AF4E-00AA003F0F07}")
public interface _Control extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x860)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "Undo", dispId = 0x860)
    void Undo();
            
    /**
     * <p>id(0x85f)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Dropdown", dispId = 0x85f)
    void Dropdown();
            
    /**
     * <p>id(0x835)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Integer}
     * @param Row [in, optional] {@code Object}
     */
    @ComProperty(name = "Column", dispId = 0x835)
    Object getColumn(Integer Index,
            Object Row);
            
    /**
     * <p>id(0x841)</p>
     * <p>vtableId(12)</p>
     * @param lRow [in] {@code Integer}
     */
    @ComProperty(name = "Selected", dispId = 0x841)
    Integer getSelected(Integer lRow);
            
    /**
     * <p>id(0x841)</p>
     * <p>vtableId(13)</p>
     * @param lRow [in] {@code Integer}
     * @param param1 [in] {@code Integer}
     */
    @ComProperty(name = "Selected", dispId = 0x841)
    void setSelected(Integer lRow,
            Integer param1);
            
    /**
     * <p>id(0x836)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "OldValue", dispId = 0x836)
    Object getOldValue();
            
    /**
     * <p>id(0x829)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Form", dispId = 0x829)
    Form getForm();
            
    /**
     * <p>id(0x831)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Report", dispId = 0x831)
    Report getReport();
            
    /**
     * <p>id(0x837)</p>
     * <p>vtableId(17)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "ItemData", dispId = 0x837)
    Object getItemData(Integer Index);
            
    /**
     * <p>id(0x838)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Object", dispId = 0x838)
    com.sun.jna.platform.win32.COM.util.IDispatch getObject();
            
    /**
     * <p>id(0x839)</p>
     * <p>vtableId(19)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "ObjectVerbs", dispId = 0x839)
    String getObjectVerbs(Integer Index);
            
    /**
     * <p>id(0x82b)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x82b)
    Properties getProperties();
            
    /**
     * <p>id(0x7e2)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Requery", dispId = 0x7e2)
    void Requery();
            
    /**
     * <p>id(0x867)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "SizeToFit", dispId = 0x867)
    void SizeToFit();
            
    /**
     * <p>id(0x7e7)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "Goto", dispId = 0x7e7)
    void Goto();
            
    /**
     * <p>id(0x859)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "ItemsSelected", dispId = 0x859)
    _ItemsSelected getItemsSelected();
            
    /**
     * <p>id(0x7e6)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "SetFocus", dispId = 0x7e6)
    void SetFocus();
            
    /**
     * <p>id(0xfffffffb)</p>
     * <p>vtableId(26)</p>
     * @param bstrExpr [in] {@code String}
     * @param ppsa [in] {@code Object}
     */
    @ComMethod(name = "_Evaluate", dispId = 0xfffffffb)
    Object _Evaluate(String bstrExpr,
            Object ppsa);
            
    /**
     * <p>id(0x884)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Pages", dispId = 0x884)
    Pages getPages();
            
    /**
     * <p>id(0x88e)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Controls", dispId = 0x88e)
    Children getControls();
            
    /**
     * <p>id(0x885)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Hyperlink", dispId = 0x885)
    _Hyperlink getHyperlink();
            
    /**
     * <p>id(0x918)</p>
     * <p>vtableId(30)</p>
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
     * <p>id(0x98d)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "SmartTags", dispId = 0x98d)
    _SmartTags getSmartTags();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(32)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    /**
     * <p>id(0x99c)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Layout", dispId = 0x99c)
    AcLayoutType getLayout();
            
    /**
     * <p>id(0x1c6)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "LeftPadding", dispId = 0x1c6)
    Short getLeftPadding();
            
    /**
     * <p>id(0x1c6)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "LeftPadding", dispId = 0x1c6)
    void setLeftPadding(Short param0);
            
    /**
     * <p>id(0x1c7)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "TopPadding", dispId = 0x1c7)
    Short getTopPadding();
            
    /**
     * <p>id(0x1c7)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "TopPadding", dispId = 0x1c7)
    void setTopPadding(Short param0);
            
    /**
     * <p>id(0x1c8)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "RightPadding", dispId = 0x1c8)
    Short getRightPadding();
            
    /**
     * <p>id(0x1c8)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "RightPadding", dispId = 0x1c8)
    void setRightPadding(Short param0);
            
    /**
     * <p>id(0x1c9)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "BottomPadding", dispId = 0x1c9)
    Short getBottomPadding();
            
    /**
     * <p>id(0x1c9)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "BottomPadding", dispId = 0x1c9)
    void setBottomPadding(Short param0);
            
    /**
     * <p>id(0x1ca)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "GridlineStyleLeft", dispId = 0x1ca)
    Byte getGridlineStyleLeft();
            
    /**
     * <p>id(0x1ca)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleLeft", dispId = 0x1ca)
    void setGridlineStyleLeft(Byte param0);
            
    /**
     * <p>id(0x1cb)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "GridlineStyleTop", dispId = 0x1cb)
    Byte getGridlineStyleTop();
            
    /**
     * <p>id(0x1cb)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleTop", dispId = 0x1cb)
    void setGridlineStyleTop(Byte param0);
            
    /**
     * <p>id(0x1cc)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "GridlineStyleRight", dispId = 0x1cc)
    Byte getGridlineStyleRight();
            
    /**
     * <p>id(0x1cc)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleRight", dispId = 0x1cc)
    void setGridlineStyleRight(Byte param0);
            
    /**
     * <p>id(0x1cd)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "GridlineStyleBottom", dispId = 0x1cd)
    Byte getGridlineStyleBottom();
            
    /**
     * <p>id(0x1cd)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineStyleBottom", dispId = 0x1cd)
    void setGridlineStyleBottom(Byte param0);
            
    /**
     * <p>id(0x1cf)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "GridlineWidthLeft", dispId = 0x1cf)
    Byte getGridlineWidthLeft();
            
    /**
     * <p>id(0x1cf)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthLeft", dispId = 0x1cf)
    void setGridlineWidthLeft(Byte param0);
            
    /**
     * <p>id(0x1d0)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "GridlineWidthTop", dispId = 0x1d0)
    Byte getGridlineWidthTop();
            
    /**
     * <p>id(0x1d0)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthTop", dispId = 0x1d0)
    void setGridlineWidthTop(Byte param0);
            
    /**
     * <p>id(0x1d1)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "GridlineWidthRight", dispId = 0x1d1)
    Byte getGridlineWidthRight();
            
    /**
     * <p>id(0x1d1)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthRight", dispId = 0x1d1)
    void setGridlineWidthRight(Byte param0);
            
    /**
     * <p>id(0x1d2)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "GridlineWidthBottom", dispId = 0x1d2)
    Byte getGridlineWidthBottom();
            
    /**
     * <p>id(0x1d2)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "GridlineWidthBottom", dispId = 0x1d2)
    void setGridlineWidthBottom(Byte param0);
            
    /**
     * <p>id(0x1ce)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "GridlineColor", dispId = 0x1ce)
    Integer getGridlineColor();
            
    /**
     * <p>id(0x1ce)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "GridlineColor", dispId = 0x1ce)
    void setGridlineColor(Integer param0);
            
    /**
     * <p>id(0x1de)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x1de)
    AcHorizontalAnchor getHorizontalAnchor();
            
    /**
     * <p>id(0x1de)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code AcHorizontalAnchor}
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x1de)
    void setHorizontalAnchor(AcHorizontalAnchor param0);
            
    /**
     * <p>id(0x1dd)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x1dd)
    AcVerticalAnchor getVerticalAnchor();
            
    /**
     * <p>id(0x1dd)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code AcVerticalAnchor}
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x1dd)
    void setVerticalAnchor(AcVerticalAnchor param0);
            
    /**
     * <p>id(0x9bc)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "LayoutID", dispId = 0x9bc)
    Integer getLayoutID();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    String get_Name();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    void set_Name(String param0);
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    String getName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    void setName(String param0);
            
    
}