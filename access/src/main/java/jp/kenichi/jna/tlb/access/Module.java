
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({331FDCFE-CF31-11CD-8701-00AA003F0F07})</p>
 */
@ComInterface(iid="{331FDCFE-CF31-11CD-8701-00AA003F0F07}")
public interface Module extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x82d)</p>
     * <p>vtableId(9)</p>
     * @param Text [in] {@code String}
     */
    @ComMethod(name = "InsertText", dispId = 0x82d)
    void InsertText(String Text);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x0)
    void setName(String param0);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     * @param String [in] {@code String}
     */
    @ComMethod(name = "AddFromString", dispId = 0x60020005)
    void AddFromString(String String);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "AddFromFile", dispId = 0x60020006)
    void AddFromFile(String FileName);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     * @param Line [in] {@code Integer}
     * @param NumLines [in] {@code Integer}
     */
    @ComProperty(name = "Lines", dispId = 0x60020007)
    String getLines(Integer Line,
            Integer NumLines);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "CountOfLines", dispId = 0x60020008)
    Integer getCountOfLines();
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     * @param Line [in] {@code Integer}
     * @param String [in] {@code String}
     */
    @ComMethod(name = "InsertLines", dispId = 0x60020009)
    void InsertLines(Integer Line,
            String String);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     * @param StartLine [in] {@code Integer}
     * @param Count [in] {@code Integer}
     */
    @ComMethod(name = "DeleteLines", dispId = 0x6002000a)
    void DeleteLines(Integer StartLine,
            Integer Count);
            
    /**
     * <p>id(0x6002000b)</p>
     * <p>vtableId(18)</p>
     * @param Line [in] {@code Integer}
     * @param String [in] {@code String}
     */
    @ComMethod(name = "ReplaceLine", dispId = 0x6002000b)
    void ReplaceLine(Integer Line,
            String String);
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     * @param ProcName [in] {@code String}
     * @param ProcKind [in] {@code jp.kenichi.jna.tlb.vbide.vbext_ProcKind}
     */
    @ComProperty(name = "ProcStartLine", dispId = 0x6002000c)
    Integer getProcStartLine(String ProcName,
            jp.kenichi.jna.tlb.vbide.vbext_ProcKind ProcKind);
            
    /**
     * <p>id(0x6002000d)</p>
     * <p>vtableId(20)</p>
     * @param ProcName [in] {@code String}
     * @param ProcKind [in] {@code jp.kenichi.jna.tlb.vbide.vbext_ProcKind}
     */
    @ComProperty(name = "ProcCountLines", dispId = 0x6002000d)
    Integer getProcCountLines(String ProcName,
            jp.kenichi.jna.tlb.vbide.vbext_ProcKind ProcKind);
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     * @param ProcName [in] {@code String}
     * @param ProcKind [in] {@code jp.kenichi.jna.tlb.vbide.vbext_ProcKind}
     */
    @ComProperty(name = "ProcBodyLine", dispId = 0x6002000e)
    Integer getProcBodyLine(String ProcName,
            jp.kenichi.jna.tlb.vbide.vbext_ProcKind ProcKind);
            
    /**
     * <p>id(0x6002000f)</p>
     * <p>vtableId(22)</p>
     * @param Line [in] {@code Integer}
     * @param pprockind [out] {@code jp.kenichi.jna.tlb.vbide.vbext_ProcKind}
     */
    @ComProperty(name = "ProcOfLine", dispId = 0x6002000f)
    String getProcOfLine(Integer Line,
            VARIANT pprockind);
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "CountOfDeclarationLines", dispId = 0x60020010)
    Integer getCountOfDeclarationLines();
            
    /**
     * <p>id(0x60020011)</p>
     * <p>vtableId(24)</p>
     * @param EventName [in] {@code String}
     * @param ObjectName [in] {@code String}
     */
    @ComMethod(name = "CreateEventProc", dispId = 0x60020011)
    Integer CreateEventProc(String EventName,
            String ObjectName);
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(25)</p>
     * @param Target [in] {@code String}
     * @param StartLine [inout] {@code Integer}
     * @param StartColumn [inout] {@code Integer}
     * @param EndLine [inout] {@code Integer}
     * @param EndColumn [inout] {@code Integer}
     * @param WholeWord [in, optional] {@code Boolean}
     * @param MatchCase [in, optional] {@code Boolean}
     * @param PatternSearch [in, optional] {@code Boolean}
     */
    @ComMethod(name = "Find", dispId = 0x60020012)
    Boolean Find(String Target,
            VARIANT StartLine,
            VARIANT StartColumn,
            VARIANT EndLine,
            VARIANT EndColumn,
            Boolean WholeWord,
            Boolean MatchCase,
            Boolean PatternSearch);
            
    /**
     * <p>id(0x60020013)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60020013)
    AcModuleType getType();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(27)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}