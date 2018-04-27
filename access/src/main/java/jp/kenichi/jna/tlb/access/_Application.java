
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({68CCE6C0-6129-101B-AF4E-00AA003F0F07})</p>
 */
@ComInterface(iid="{68CCE6C0-6129-101B-AF4E-00AA003F0F07}")
public interface _Application extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x822)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "CodeContextObject", dispId = 0x822)
    com.sun.jna.platform.win32.COM.util.IDispatch getCodeContextObject();
            
    /**
     * <p>id(0x85e)</p>
     * <p>vtableId(10)</p>
     * @param filepath [in] {@code String}
     */
    @ComMethod(name = "NewCurrentDatabaseOld", dispId = 0x85e)
    void NewCurrentDatabaseOld(String filepath);
            
    /**
     * <p>id(0x85c)</p>
     * <p>vtableId(11)</p>
     * @param filepath [in] {@code String}
     * @param Exclusive [in, optional] {@code Boolean}
     */
    @ComMethod(name = "OpenCurrentDatabaseOld", dispId = 0x85c)
    void OpenCurrentDatabaseOld(String filepath,
            Boolean Exclusive);
            
    /**
     * <p>id(0x7da)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "MenuBar", dispId = 0x7da)
    String getMenuBar();
            
    /**
     * <p>id(0x7da)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MenuBar", dispId = 0x7da)
    void setMenuBar(String param0);
            
    /**
     * <p>id(0x7db)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "CurrentObjectType", dispId = 0x7db)
    AcObjectType getCurrentObjectType();
            
    /**
     * <p>id(0x7dc)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "CurrentObjectName", dispId = 0x7dc)
    String getCurrentObjectName();
            
    /**
     * <p>id(0x7dd)</p>
     * <p>vtableId(16)</p>
     * @param OptionName [in] {@code String}
     */
    @ComMethod(name = "GetOption", dispId = 0x7dd)
    Object GetOption(String OptionName);
            
    /**
     * <p>id(0x7de)</p>
     * <p>vtableId(17)</p>
     * @param OptionName [in] {@code String}
     * @param Setting [in] {@code Object}
     */
    @ComMethod(name = "SetOption", dispId = 0x7de)
    void SetOption(String OptionName,
            Object Setting);
            
    /**
     * <p>id(0x7df)</p>
     * <p>vtableId(18)</p>
     * @param EchoOn [in] {@code Short}
     * @param bstrStatusBarText [in, optional] {@code String}
     */
    @ComMethod(name = "Echo", dispId = 0x7df)
    void Echo(Short EchoOn,
            String bstrStatusBarText);
            
    /**
     * <p>id(0x85d)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "CloseCurrentDatabase", dispId = 0x85d)
    void CloseCurrentDatabase();
            
    /**
     * <p>id(0x7e0)</p>
     * <p>vtableId(20)</p>
     * @param Option [in, optional] {@code AcQuitOption}
     */
    @ComMethod(name = "Quit", dispId = 0x7e0)
    void Quit(AcQuitOption Option);
            
    /**
     * <p>id(0x7d2)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Forms", dispId = 0x7d2)
    Forms getForms();
            
    /**
     * <p>id(0x7d3)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Reports", dispId = 0x7d3)
    Reports getReports();
            
    /**
     * <p>id(0x7d4)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Screen", dispId = 0x7d4)
    Screen getScreen();
            
    /**
     * <p>id(0x7e9)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "DoCmd", dispId = 0x7e9)
    DoCmd getDoCmd();
            
    /**
     * <p>id(0x83b)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "ShortcutMenuBar", dispId = 0x83b)
    String getShortcutMenuBar();
            
    /**
     * <p>id(0x83b)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ShortcutMenuBar", dispId = 0x83b)
    void setShortcutMenuBar(String param0);
            
    /**
     * <p>id(0x864)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x864)
    Boolean getVisible();
            
    /**
     * <p>id(0x864)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x864)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x865)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "UserControl", dispId = 0x865)
    Boolean getUserControl();
            
    /**
     * <p>id(0x865)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UserControl", dispId = 0x865)
    void setUserControl(Boolean param0);
            
    /**
     * <p>id(0x7ec)</p>
     * <p>vtableId(31)</p>
     * @param Action [in] {@code AcSysCmdAction}
     * @param Argument2 [in, optional] {@code Object}
     * @param Argument3 [in, optional] {@code Object}
     */
    @ComMethod(name = "SysCmd", dispId = 0x7ec)
    Object SysCmd(AcSysCmdAction Action,
            Object Argument2,
            Object Argument3);
            
    /**
     * <p>id(0x7ed)</p>
     * <p>vtableId(32)</p>
     * @param Database [in, optional] {@code Object}
     * @param FormTemplate [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateForm", dispId = 0x7ed)
    Form CreateForm(Object Database,
            Object FormTemplate);
            
    /**
     * <p>id(0x7ee)</p>
     * <p>vtableId(33)</p>
     * @param Database [in, optional] {@code Object}
     * @param ReportTemplate [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateReport", dispId = 0x7ee)
    Report CreateReport(Object Database,
            Object ReportTemplate);
            
    /**
     * <p>id(0x7ef)</p>
     * <p>vtableId(34)</p>
     * @param FormName [in] {@code String}
     * @param ControlType [in] {@code AcControlType}
     * @param Section [in, optional] {@code AcSection}
     * @param Parent [in, optional] {@code Object}
     * @param ColumnName [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateControlOld", dispId = 0x7ef)
    Control CreateControlOld(String FormName,
            AcControlType ControlType,
            AcSection Section,
            Object Parent,
            Object ColumnName,
            Object Left,
            Object Top,
            Object Width,
            Object Height);
            
    /**
     * <p>id(0x7f0)</p>
     * <p>vtableId(35)</p>
     * @param ReportName [in] {@code String}
     * @param ControlType [in] {@code AcControlType}
     * @param Section [in, optional] {@code AcSection}
     * @param Parent [in, optional] {@code Object}
     * @param ColumnName [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateReportControlOld", dispId = 0x7f0)
    Control CreateReportControlOld(String ReportName,
            AcControlType ControlType,
            AcSection Section,
            Object Parent,
            Object ColumnName,
            Object Left,
            Object Top,
            Object Width,
            Object Height);
            
    /**
     * <p>id(0x874)</p>
     * <p>vtableId(36)</p>
     * @param FormName [in] {@code String}
     * @param ControlType [in] {@code AcControlType}
     * @param Section [in] {@code AcSection}
     * @param Parent [in] {@code String}
     * @param ControlSource [in] {@code String}
     * @param Left [in] {@code Integer}
     * @param Top [in] {@code Integer}
     * @param Width [in] {@code Integer}
     * @param Height [in] {@code Integer}
     */
    @ComMethod(name = "CreateControlExOld", dispId = 0x874)
    Control CreateControlExOld(String FormName,
            AcControlType ControlType,
            AcSection Section,
            String Parent,
            String ControlSource,
            Integer Left,
            Integer Top,
            Integer Width,
            Integer Height);
            
    /**
     * <p>id(0x875)</p>
     * <p>vtableId(37)</p>
     * @param ReportName [in] {@code String}
     * @param ControlType [in] {@code AcControlType}
     * @param Section [in] {@code AcSection}
     * @param Parent [in] {@code String}
     * @param ControlName [in] {@code String}
     * @param Left [in] {@code Integer}
     * @param Top [in] {@code Integer}
     * @param Width [in] {@code Integer}
     * @param Height [in] {@code Integer}
     */
    @ComMethod(name = "CreateReportControlExOld", dispId = 0x875)
    Control CreateReportControlExOld(String ReportName,
            AcControlType ControlType,
            AcSection Section,
            String Parent,
            String ControlName,
            Integer Left,
            Integer Top,
            Integer Width,
            Integer Height);
            
    /**
     * <p>id(0x7f1)</p>
     * <p>vtableId(38)</p>
     * @param FormName [in] {@code String}
     * @param ControlName [in] {@code String}
     */
    @ComMethod(name = "DeleteControl", dispId = 0x7f1)
    void DeleteControl(String FormName,
            String ControlName);
            
    /**
     * <p>id(0x7f2)</p>
     * <p>vtableId(39)</p>
     * @param ReportName [in] {@code String}
     * @param ControlName [in] {@code String}
     */
    @ComMethod(name = "DeleteReportControl", dispId = 0x7f2)
    void DeleteReportControl(String ReportName,
            String ControlName);
            
    /**
     * <p>id(0x803)</p>
     * <p>vtableId(40)</p>
     * @param ReportName [in] {@code String}
     * @param Expression [in] {@code String}
     * @param Header [in] {@code Short}
     * @param Footer [in] {@code Short}
     */
    @ComMethod(name = "CreateGroupLevel", dispId = 0x803)
    Integer CreateGroupLevel(String ReportName,
            String Expression,
            Short Header,
            Short Footer);
            
    /**
     * <p>id(0x7f3)</p>
     * <p>vtableId(41)</p>
     * @param Expr [in] {@code String}
     * @param Domain [in] {@code String}
     * @param Criteria [in, optional] {@code Object}
     */
    @ComMethod(name = "DMin", dispId = 0x7f3)
    Object DMin(String Expr,
            String Domain,
            Object Criteria);
            
    /**
     * <p>id(0x7f4)</p>
     * <p>vtableId(42)</p>
     * @param Expr [in] {@code String}
     * @param Domain [in] {@code String}
     * @param Criteria [in, optional] {@code Object}
     */
    @ComMethod(name = "DMax", dispId = 0x7f4)
    Object DMax(String Expr,
            String Domain,
            Object Criteria);
            
    /**
     * <p>id(0x7f5)</p>
     * <p>vtableId(43)</p>
     * @param Expr [in] {@code String}
     * @param Domain [in] {@code String}
     * @param Criteria [in, optional] {@code Object}
     */
    @ComMethod(name = "DSum", dispId = 0x7f5)
    Object DSum(String Expr,
            String Domain,
            Object Criteria);
            
    /**
     * <p>id(0x7f6)</p>
     * <p>vtableId(44)</p>
     * @param Expr [in] {@code String}
     * @param Domain [in] {@code String}
     * @param Criteria [in, optional] {@code Object}
     */
    @ComMethod(name = "DAvg", dispId = 0x7f6)
    Object DAvg(String Expr,
            String Domain,
            Object Criteria);
            
    /**
     * <p>id(0x7f7)</p>
     * <p>vtableId(45)</p>
     * @param Expr [in] {@code String}
     * @param Domain [in] {@code String}
     * @param Criteria [in, optional] {@code Object}
     */
    @ComMethod(name = "DLookup", dispId = 0x7f7)
    Object DLookup(String Expr,
            String Domain,
            Object Criteria);
            
    /**
     * <p>id(0x7f8)</p>
     * <p>vtableId(46)</p>
     * @param Expr [in] {@code String}
     * @param Domain [in] {@code String}
     * @param Criteria [in, optional] {@code Object}
     */
    @ComMethod(name = "DLast", dispId = 0x7f8)
    Object DLast(String Expr,
            String Domain,
            Object Criteria);
            
    /**
     * <p>id(0x7f9)</p>
     * <p>vtableId(47)</p>
     * @param Expr [in] {@code String}
     * @param Domain [in] {@code String}
     * @param Criteria [in, optional] {@code Object}
     */
    @ComMethod(name = "DVar", dispId = 0x7f9)
    Object DVar(String Expr,
            String Domain,
            Object Criteria);
            
    /**
     * <p>id(0x7fa)</p>
     * <p>vtableId(48)</p>
     * @param Expr [in] {@code String}
     * @param Domain [in] {@code String}
     * @param Criteria [in, optional] {@code Object}
     */
    @ComMethod(name = "DVarP", dispId = 0x7fa)
    Object DVarP(String Expr,
            String Domain,
            Object Criteria);
            
    /**
     * <p>id(0x7fb)</p>
     * <p>vtableId(49)</p>
     * @param Expr [in] {@code String}
     * @param Domain [in] {@code String}
     * @param Criteria [in, optional] {@code Object}
     */
    @ComMethod(name = "DStDev", dispId = 0x7fb)
    Object DStDev(String Expr,
            String Domain,
            Object Criteria);
            
    /**
     * <p>id(0x7fc)</p>
     * <p>vtableId(50)</p>
     * @param Expr [in] {@code String}
     * @param Domain [in] {@code String}
     * @param Criteria [in, optional] {@code Object}
     */
    @ComMethod(name = "DStDevP", dispId = 0x7fc)
    Object DStDevP(String Expr,
            String Domain,
            Object Criteria);
            
    /**
     * <p>id(0x7fd)</p>
     * <p>vtableId(51)</p>
     * @param Expr [in] {@code String}
     * @param Domain [in] {@code String}
     * @param Criteria [in, optional] {@code Object}
     */
    @ComMethod(name = "DFirst", dispId = 0x7fd)
    Object DFirst(String Expr,
            String Domain,
            Object Criteria);
            
    /**
     * <p>id(0x7fe)</p>
     * <p>vtableId(52)</p>
     * @param Expr [in] {@code String}
     * @param Domain [in] {@code String}
     * @param Criteria [in, optional] {@code Object}
     */
    @ComMethod(name = "DCount", dispId = 0x7fe)
    Object DCount(String Expr,
            String Domain,
            Object Criteria);
            
    /**
     * <p>id(0x7ff)</p>
     * <p>vtableId(53)</p>
     * @param StringExpr [in] {@code String}
     */
    @ComMethod(name = "Eval", dispId = 0x7ff)
    Object Eval(String StringExpr);
            
    /**
     * <p>id(0x800)</p>
     * <p>vtableId(54)</p>
     */
    @ComMethod(name = "CurrentUser", dispId = 0x800)
    String CurrentUser();
            
    /**
     * <p>id(0x804)</p>
     * <p>vtableId(55)</p>
     * @param Application [in] {@code String}
     * @param Topic [in] {@code String}
     */
    @ComMethod(name = "DDEInitiate", dispId = 0x804)
    Object DDEInitiate(String Application,
            String Topic);
            
    /**
     * <p>id(0x805)</p>
     * <p>vtableId(56)</p>
     * @param ChanNum [in] {@code Object}
     * @param Command [in] {@code String}
     */
    @ComMethod(name = "DDEExecute", dispId = 0x805)
    void DDEExecute(Object ChanNum,
            String Command);
            
    /**
     * <p>id(0x806)</p>
     * <p>vtableId(57)</p>
     * @param ChanNum [in] {@code Object}
     * @param Item [in] {@code String}
     * @param Data [in] {@code String}
     */
    @ComMethod(name = "DDEPoke", dispId = 0x806)
    void DDEPoke(Object ChanNum,
            String Item,
            String Data);
            
    /**
     * <p>id(0x807)</p>
     * <p>vtableId(58)</p>
     * @param ChanNum [in] {@code Object}
     * @param Item [in] {@code String}
     */
    @ComMethod(name = "DDERequest", dispId = 0x807)
    String DDERequest(Object ChanNum,
            String Item);
            
    /**
     * <p>id(0x808)</p>
     * <p>vtableId(59)</p>
     * @param ChanNum [in] {@code Object}
     */
    @ComMethod(name = "DDETerminate", dispId = 0x808)
    void DDETerminate(Object ChanNum);
            
    /**
     * <p>id(0x809)</p>
     * <p>vtableId(60)</p>
     */
    @ComMethod(name = "DDETerminateAll", dispId = 0x809)
    void DDETerminateAll();
            
    /**
     * <p>id(0x83e)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "DBEngine", dispId = 0x83e)
    jp.kenichi.jna.tlb.acedao.DBEngine getDBEngine();
            
    /**
     * <p>id(0x801)</p>
     * <p>vtableId(62)</p>
     */
    @ComMethod(name = "CurrentDb", dispId = 0x801)
    jp.kenichi.jna.tlb.acedao.Database CurrentDb();
            
    /**
     * <p>id(0x802)</p>
     * <p>vtableId(63)</p>
     */
    @ComMethod(name = "CodeDb", dispId = 0x802)
    jp.kenichi.jna.tlb.acedao.Database CodeDb();
            
    /**
     * <p>id(0x833)</p>
     * <p>vtableId(64)</p>
     * @param Hwnd [in] {@code Integer}
     */
    @ComMethod(name = "BeginUndoable", dispId = 0x833)
    void BeginUndoable(Integer Hwnd);
            
    /**
     * <p>id(0x834)</p>
     * <p>vtableId(65)</p>
     * @param yesno [in] {@code Short}
     */
    @ComMethod(name = "SetUndoRecording", dispId = 0x834)
    void SetUndoRecording(Short yesno);
            
    /**
     * <p>id(0x85a)</p>
     * <p>vtableId(66)</p>
     * @param Field [in] {@code String}
     * @param FieldType [in] {@code Short}
     * @param Expression [in] {@code String}
     */
    @ComMethod(name = "BuildCriteria", dispId = 0x85a)
    String BuildCriteria(String Field,
            Short FieldType,
            String Expression);
            
    /**
     * <p>id(0x82d)</p>
     * <p>vtableId(67)</p>
     * @param Text [in] {@code String}
     * @param ModuleName [in] {@code String}
     */
    @ComMethod(name = "InsertText", dispId = 0x82d)
    void InsertText(String Text,
            String ModuleName);
            
    /**
     * <p>id(0x86a)</p>
     * <p>vtableId(68)</p>
     */
    @ComMethod(name = "ReloadAddIns", dispId = 0x86a)
    void ReloadAddIns();
            
    /**
     * <p>id(0x86d)</p>
     * <p>vtableId(69)</p>
     */
    @ComMethod(name = "DefaultWorkspaceClone", dispId = 0x86d)
    jp.kenichi.jna.tlb.acedao.Workspace DefaultWorkspaceClone();
            
    /**
     * <p>id(0x86e)</p>
     * <p>vtableId(70)</p>
     */
    @ComMethod(name = "RefreshTitleBar", dispId = 0x86e)
    void RefreshTitleBar();
            
    /**
     * <p>id(0x86f)</p>
     * <p>vtableId(71)</p>
     * @param ChangeFrom [in] {@code String}
     * @param ChangeTo [in] {@code String}
     */
    @ComMethod(name = "AddAutoCorrect", dispId = 0x86f)
    void AddAutoCorrect(String ChangeFrom,
            String ChangeTo);
            
    /**
     * <p>id(0x870)</p>
     * <p>vtableId(72)</p>
     * @param ChangeFrom [in] {@code String}
     */
    @ComMethod(name = "DelAutoCorrect", dispId = 0x870)
    void DelAutoCorrect(String ChangeFrom);
            
    /**
     * <p>id(0x873)</p>
     * <p>vtableId(73)</p>
     */
    @ComMethod(name = "hWndAccessApp", dispId = 0x873)
    Integer hWndAccessApp();
            
    /**
     * <p>id(0x856)</p>
     * <p>vtableId(74)</p>
     * @param Procedure [in] {@code String}
     * @param Arg1 [inout, optional] {@code Object}
     * @param Arg2 [inout, optional] {@code Object}
     * @param Arg3 [inout, optional] {@code Object}
     * @param Arg4 [inout, optional] {@code Object}
     * @param Arg5 [inout, optional] {@code Object}
     * @param Arg6 [inout, optional] {@code Object}
     * @param Arg7 [inout, optional] {@code Object}
     * @param Arg8 [inout, optional] {@code Object}
     * @param Arg9 [inout, optional] {@code Object}
     * @param Arg10 [inout, optional] {@code Object}
     * @param Arg11 [inout, optional] {@code Object}
     * @param Arg12 [inout, optional] {@code Object}
     * @param Arg13 [inout, optional] {@code Object}
     * @param Arg14 [inout, optional] {@code Object}
     * @param Arg15 [inout, optional] {@code Object}
     * @param Arg16 [inout, optional] {@code Object}
     * @param Arg17 [inout, optional] {@code Object}
     * @param Arg18 [inout, optional] {@code Object}
     * @param Arg19 [inout, optional] {@code Object}
     * @param Arg20 [inout, optional] {@code Object}
     * @param Arg21 [inout, optional] {@code Object}
     * @param Arg22 [inout, optional] {@code Object}
     * @param Arg23 [inout, optional] {@code Object}
     * @param Arg24 [inout, optional] {@code Object}
     * @param Arg25 [inout, optional] {@code Object}
     * @param Arg26 [inout, optional] {@code Object}
     * @param Arg27 [inout, optional] {@code Object}
     * @param Arg28 [inout, optional] {@code Object}
     * @param Arg29 [inout, optional] {@code Object}
     * @param Arg30 [inout, optional] {@code Object}
     */
    @ComMethod(name = "Run", dispId = 0x856)
    Object Run(String Procedure,
            VARIANT Arg1,
            VARIANT Arg2,
            VARIANT Arg3,
            VARIANT Arg4,
            VARIANT Arg5,
            VARIANT Arg6,
            VARIANT Arg7,
            VARIANT Arg8,
            VARIANT Arg9,
            VARIANT Arg10,
            VARIANT Arg11,
            VARIANT Arg12,
            VARIANT Arg13,
            VARIANT Arg14,
            VARIANT Arg15,
            VARIANT Arg16,
            VARIANT Arg17,
            VARIANT Arg18,
            VARIANT Arg19,
            VARIANT Arg20,
            VARIANT Arg21,
            VARIANT Arg22,
            VARIANT Arg23,
            VARIANT Arg24,
            VARIANT Arg25,
            VARIANT Arg26,
            VARIANT Arg27,
            VARIANT Arg28,
            VARIANT Arg29,
            VARIANT Arg30);
            
    /**
     * <p>id(0x857)</p>
     * <p>vtableId(75)</p>
     * @param Value [in] {@code Object}
     * @param ValueIfNull [in, optional] {@code Object}
     */
    @ComMethod(name = "Nz", dispId = 0x857)
    Object Nz(Object Value,
            Object ValueIfNull);
            
    /**
     * <p>id(0x876)</p>
     * <p>vtableId(76)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "LoadPicture", dispId = 0x876)
    com.sun.jna.platform.win32.COM.util.IDispatch LoadPicture(String FileName);
            
    /**
     * <p>id(0x878)</p>
     * <p>vtableId(77)</p>
     * @param objtyp [in] {@code Integer}
     * @param ModuleName [in] {@code String}
     * @param FileName [in] {@code String}
     * @param token [in] {@code Integer}
     */
    @ComMethod(name = "ReplaceModule", dispId = 0x878)
    void ReplaceModule(Integer objtyp,
            String ModuleName,
            String FileName,
            Integer token);
            
    /**
     * <p>id(0x879)</p>
     * <p>vtableId(78)</p>
     * @param ErrorNumber [in] {@code Object}
     */
    @ComMethod(name = "AccessError", dispId = 0x879)
    Object AccessError(Object ErrorNumber);
            
    /**
     * <p>id(0x87a)</p>
     * <p>vtableId(79)</p>
     */
    @ComMethod(name = "BuilderString", dispId = 0x87a)
    Object BuilderString();
            
    /**
     * <p>id(0x87b)</p>
     * <p>vtableId(80)</p>
     * @param Guid [in] {@code Object}
     */
    @ComMethod(name = "StringFromGUID", dispId = 0x87b)
    Object StringFromGUID(Object Guid);
            
    /**
     * <p>id(0x87c)</p>
     * <p>vtableId(81)</p>
     * @param String [in] {@code Object}
     */
    @ComMethod(name = "GUIDFromString", dispId = 0x87c)
    Object GUIDFromString(Object String);
            
    /**
     * <p>id(0x87d)</p>
     * <p>vtableId(82)</p>
     * @param id [in] {@code Integer}
     */
    @ComMethod(name = "AppLoadString", dispId = 0x87d)
    Object AppLoadString(Integer id);
            
    /**
     * <p>id(0x87e)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x87e)
    jp.kenichi.jna.tlb.office.CommandBars getCommandBars();
            
    /**
     * <p>id(0x87f)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "Assistant", dispId = 0x87f)
    jp.kenichi.jna.tlb.office.Assistant getAssistant();
            
    /**
     * <p>id(0x880)</p>
     * <p>vtableId(85)</p>
     * @param Address [in] {@code String}
     * @param SubAddress [in, optional] {@code String}
     * @param NewWindow [in, optional] {@code Boolean}
     * @param AddHistory [in, optional] {@code Boolean}
     * @param ExtraInfo [in, optional] {@code Object}
     * @param Method [in, optional] {@code jp.kenichi.jna.tlb.office.MsoExtraInfoMethod}
     * @param HeaderInfo [in, optional] {@code String}
     */
    @ComMethod(name = "FollowHyperlink", dispId = 0x880)
    void FollowHyperlink(String Address,
            String SubAddress,
            Boolean NewWindow,
            Boolean AddHistory,
            Object ExtraInfo,
            jp.kenichi.jna.tlb.office.MsoExtraInfoMethod Method,
            String HeaderInfo);
            
    /**
     * <p>id(0x882)</p>
     * <p>vtableId(86)</p>
     * @param ObjectType [in] {@code AcObjectType}
     * @param ObjectName [in] {@code String}
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "SaveAsText", dispId = 0x882)
    void SaveAsText(AcObjectType ObjectType,
            String ObjectName,
            String FileName);
            
    /**
     * <p>id(0x883)</p>
     * <p>vtableId(87)</p>
     * @param ObjectType [in] {@code AcObjectType}
     * @param ObjectName [in] {@code String}
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "LoadFromText", dispId = 0x883)
    void LoadFromText(AcObjectType ObjectType,
            String ObjectName,
            String FileName);
            
    /**
     * <p>id(0x888)</p>
     * <p>vtableId(88)</p>
     */
    @ComMethod(name = "AddToFavorites", dispId = 0x888)
    void AddToFavorites();
            
    /**
     * <p>id(0x88a)</p>
     * <p>vtableId(89)</p>
     */
    @ComMethod(name = "RefreshDatabaseWindow", dispId = 0x88a)
    void RefreshDatabaseWindow();
            
    /**
     * <p>id(0x88b)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "References", dispId = 0x88b)
    References getReferences();
            
    /**
     * <p>id(0x88c)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "Modules", dispId = 0x88c)
    Modules getModules();
            
    /**
     * <p>id(0x88d)</p>
     * <p>vtableId(92)</p>
     */
    @ComProperty(name = "FileSearch", dispId = 0x88d)
    jp.kenichi.jna.tlb.office.FileSearch getFileSearch();
            
    /**
     * <p>id(0x891)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "IsCompiled", dispId = 0x891)
    Boolean getIsCompiled();
            
    /**
     * <p>id(0x892)</p>
     * <p>vtableId(94)</p>
     * @param Command [in] {@code AcCommand}
     */
    @ComMethod(name = "RunCommand", dispId = 0x892)
    void RunCommand(AcCommand Command);
            
    /**
     * <p>id(0x893)</p>
     * <p>vtableId(95)</p>
     * @param Hyperlink [in] {@code Object}
     * @param Part [in, optional] {@code AcHyperlinkPart}
     */
    @ComMethod(name = "HyperlinkPart", dispId = 0x893)
    String HyperlinkPart(Object Hyperlink,
            AcHyperlinkPart Part);
            
    /**
     * <p>id(0x895)</p>
     * <p>vtableId(96)</p>
     * @param ObjectType [in] {@code AcObjectType}
     * @param ObjectName [in] {@code String}
     */
    @ComMethod(name = "GetHiddenAttribute", dispId = 0x895)
    Boolean GetHiddenAttribute(AcObjectType ObjectType,
            String ObjectName);
            
    /**
     * <p>id(0x896)</p>
     * <p>vtableId(97)</p>
     * @param ObjectType [in] {@code AcObjectType}
     * @param ObjectName [in] {@code String}
     * @param fHidden [in] {@code Boolean}
     */
    @ComMethod(name = "SetHiddenAttribute", dispId = 0x896)
    void SetHiddenAttribute(AcObjectType ObjectType,
            String ObjectName,
            Boolean fHidden);
            
    /**
     * <p>id(0x8a2)</p>
     * <p>vtableId(98)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x8a2)
    jp.kenichi.jna.tlb.vbide.VBE getVBE();
            
    /**
     * <p>id(0x8a4)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "DataAccessPages", dispId = 0x8a4)
    DataAccessPages getDataAccessPages();
            
    /**
     * <p>id(0x8a5)</p>
     * <p>vtableId(100)</p>
     * @param FileName [in, optional] {@code Object}
     * @param CreateNewFile [in, optional] {@code Boolean}
     */
    @ComMethod(name = "CreateDataAccessPage", dispId = 0x8a5)
    DataAccessPage CreateDataAccessPage(Object FileName,
            Boolean CreateNewFile);
            
    /**
     * <p>id(0x8b9)</p>
     * <p>vtableId(101)</p>
     */
    @ComProperty(name = "ADOConnectString", dispId = 0x8b9)
    String getADOConnectString();
            
    /**
     * <p>id(0x8a7)</p>
     * <p>vtableId(102)</p>
     */
    @ComProperty(name = "CurrentProject", dispId = 0x8a7)
    CurrentProject getCurrentProject();
            
    /**
     * <p>id(0x8a8)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "CurrentData", dispId = 0x8a8)
    CurrentData getCurrentData();
            
    /**
     * <p>id(0x8a9)</p>
     * <p>vtableId(104)</p>
     */
    @ComProperty(name = "CodeProject", dispId = 0x8a9)
    CodeProject getCodeProject();
            
    /**
     * <p>id(0x8aa)</p>
     * <p>vtableId(105)</p>
     */
    @ComProperty(name = "CodeData", dispId = 0x8aa)
    CodeData getCodeData();
            
    /**
     * <p>id(0x8d6)</p>
     * <p>vtableId(106)</p>
     * @param filepath [in] {@code String}
     * @param Connect [in, optional] {@code Object}
     */
    @ComMethod(name = "NewAccessProject", dispId = 0x8d6)
    void NewAccessProject(String filepath,
            Object Connect);
            
    /**
     * <p>id(0x8d7)</p>
     * <p>vtableId(107)</p>
     * @param filepath [in] {@code String}
     * @param Exclusive [in, optional] {@code Boolean}
     */
    @ComMethod(name = "OpenAccessProject", dispId = 0x8d7)
    void OpenAccessProject(String filepath,
            Boolean Exclusive);
            
    /**
     * <p>id(0x8d8)</p>
     * <p>vtableId(108)</p>
     * @param filepath [in] {@code String}
     * @param Connect [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateAccessProject", dispId = 0x8d8)
    void CreateAccessProject(String filepath,
            Object Connect);
            
    /**
     * <p>id(0x8bb)</p>
     * <p>vtableId(109)</p>
     */
    @ComProperty(name = "WizHook", dispId = 0x8bb)
    WizHook getWizHook();
            
    /**
     * <p>id(0x8da)</p>
     * <p>vtableId(110)</p>
     */
    @ComProperty(name = "ProductCode", dispId = 0x8da)
    String getProductCode();
            
    /**
     * <p>id(0x8e5)</p>
     * <p>vtableId(111)</p>
     */
    @ComProperty(name = "COMAddIns", dispId = 0x8e5)
    jp.kenichi.jna.tlb.office.COMAddIns getCOMAddIns();
            
    /**
     * <p>id(0x82e)</p>
     * <p>vtableId(112)</p>
     */
    @ComProperty(name = "Name", dispId = 0x82e)
    String getName();
            
    /**
     * <p>id(0x8e6)</p>
     * <p>vtableId(113)</p>
     */
    @ComProperty(name = "DefaultWebOptions", dispId = 0x8e6)
    DefaultWebOptions getDefaultWebOptions();
            
    /**
     * <p>id(0x8fd)</p>
     * <p>vtableId(114)</p>
     */
    @ComProperty(name = "LanguageSettings", dispId = 0x8fd)
    jp.kenichi.jna.tlb.office.LanguageSettings getLanguageSettings();
            
    /**
     * <p>id(0x900)</p>
     * <p>vtableId(115)</p>
     */
    @ComProperty(name = "AnswerWizard", dispId = 0x900)
    jp.kenichi.jna.tlb.office.AnswerWizard getAnswerWizard();
            
    /**
     * <p>id(0x912)</p>
     * <p>vtableId(116)</p>
     */
    @ComProperty(name = "FeatureInstall", dispId = 0x912)
    jp.kenichi.jna.tlb.office.MsoFeatureInstall getFeatureInstall();
            
    /**
     * <p>id(0x912)</p>
     * <p>vtableId(117)</p>
     * @param param0 [in] {@code jp.kenichi.jna.tlb.office.MsoFeatureInstall}
     */
    @ComProperty(name = "FeatureInstall", dispId = 0x912)
    void setFeatureInstall(jp.kenichi.jna.tlb.office.MsoFeatureInstall param0);
            
    /**
     * <p>id(0x915)</p>
     * <p>vtableId(118)</p>
     * @param Number [in] {@code Double}
     * @param SourceCurrency [in] {@code String}
     * @param TargetCurrency [in] {@code String}
     * @param FullPrecision [in, optional] {@code Object}
     * @param TriangulationPrecision [in, optional] {@code Object}
     */
    @ComMethod(name = "EuroConvert", dispId = 0x915)
    Double EuroConvert(Double Number,
            String SourceCurrency,
            String TargetCurrency,
            Object FullPrecision,
            Object TriangulationPrecision);
            
    /**
     * <p>id(0x916)</p>
     * <p>vtableId(119)</p>
     */
    @ComProperty(name = "VGXFrameInterval", dispId = 0x916)
    Object getVGXFrameInterval();
            
    /**
     * <p>id(0x919)</p>
     * <p>vtableId(120)</p>
     * @param dialogType [in] {@code jp.kenichi.jna.tlb.office.MsoFileDialogType}
     */
    @ComProperty(name = "FileDialog", dispId = 0x919)
    jp.kenichi.jna.tlb.office.FileDialog getFileDialog(jp.kenichi.jna.tlb.office.MsoFileDialogType dialogType);
            
    /**
     * <p>id(0x91e)</p>
     * <p>vtableId(121)</p>
     */
    @ComProperty(name = "BrokenReference", dispId = 0x91e)
    Boolean getBrokenReference();
            
    /**
     * <p>id(0x91c)</p>
     * <p>vtableId(122)</p>
     * @param Path [in, optional] {@code String}
     * @param Name [in, optional] {@code String}
     * @param Company [in, optional] {@code String}
     * @param WorkgroupID [in, optional] {@code String}
     * @param Replace [in, optional] {@code Boolean}
     */
    @ComMethod(name = "CreateNewWorkgroupFile", dispId = 0x91c)
    void CreateNewWorkgroupFile(String Path,
            String Name,
            String Company,
            String WorkgroupID,
            Boolean Replace);
            
    /**
     * <p>id(0x91d)</p>
     * <p>vtableId(123)</p>
     * @param Path [in] {@code String}
     */
    @ComMethod(name = "SetDefaultWorkgroupFile", dispId = 0x91d)
    void SetDefaultWorkgroupFile(String Path);
            
    /**
     * <p>id(0x93c)</p>
     * <p>vtableId(124)</p>
     */
    @ComProperty(name = "Printers", dispId = 0x93c)
    Printers getPrinters();
            
    /**
     * <p>id(0x93d)</p>
     * <p>vtableId(125)</p>
     */
    @ComProperty(name = "Printer", dispId = 0x93d)
    _Printer getPrinter();
            
    /**
     * <p>id(0x93d)</p>
     * <p>vtableId(126)</p>
     * @param param0 [in] {@code _Printer}
     */
    @ComProperty(name = "Printer", dispId = 0x93d)
    void setPrinter(_Printer param0);
            
    /**
     * <p>id(0x91f)</p>
     * <p>vtableId(128)</p>
     */
    @ComProperty(name = "MsoDebugOptions", dispId = 0x91f)
    jp.kenichi.jna.tlb.office.MsoDebugOptions getMsoDebugOptions();
            
    /**
     * <p>id(0x948)</p>
     * <p>vtableId(129)</p>
     * @param SourceFilename [in] {@code String}
     * @param DestinationFilename [in] {@code String}
     * @param DestinationFileFormat [in] {@code AcFileFormat}
     */
    @ComMethod(name = "ConvertAccessProject", dispId = 0x948)
    void ConvertAccessProject(String SourceFilename,
            String DestinationFilename,
            AcFileFormat DestinationFileFormat);
            
    /**
     * <p>id(0x949)</p>
     * <p>vtableId(130)</p>
     */
    @ComProperty(name = "Version", dispId = 0x949)
    String getVersion();
            
    /**
     * <p>id(0x94a)</p>
     * <p>vtableId(131)</p>
     */
    @ComProperty(name = "Build", dispId = 0x94a)
    Integer getBuild();
            
    /**
     * <p>id(0x94e)</p>
     * <p>vtableId(132)</p>
     * @param filepath [in] {@code String}
     * @param Exclusive [in, optional] {@code Boolean}
     * @param bstrPassword [in, optional] {@code String}
     */
    @ComMethod(name = "OpenCurrentDatabase", dispId = 0x94e)
    void OpenCurrentDatabase(String filepath,
            Boolean Exclusive,
            String bstrPassword);
            
    /**
     * <p>id(0x960)</p>
     * <p>vtableId(133)</p>
     * @param SourceFile [in] {@code String}
     * @param DestinationFile [in] {@code String}
     * @param LogFile [in, optional] {@code Boolean}
     */
    @ComMethod(name = "CompactRepair", dispId = 0x960)
    Boolean CompactRepair(String SourceFile,
            String DestinationFile,
            Boolean LogFile);
            
    /**
     * <p>id(0x978)</p>
     * <p>vtableId(134)</p>
     * @param ObjectType [in] {@code AcExportXMLObjectType}
     * @param DataSource [in] {@code String}
     * @param DataTarget [in, optional] {@code String}
     * @param SchemaTarget [in, optional] {@code String}
     * @param PresentationTarget [in, optional] {@code String}
     * @param ImageTarget [in, optional] {@code String}
     * @param Encoding [in, optional] {@code AcExportXMLEncoding}
     * @param OtherFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "ExportXMLOld", dispId = 0x978)
    void ExportXMLOld(AcExportXMLObjectType ObjectType,
            String DataSource,
            String DataTarget,
            String SchemaTarget,
            String PresentationTarget,
            String ImageTarget,
            AcExportXMLEncoding Encoding,
            Integer OtherFlags);
            
    /**
     * <p>id(0x979)</p>
     * <p>vtableId(135)</p>
     * @param DataSource [in] {@code String}
     * @param ImportOptions [in, optional] {@code AcImportXMLOption}
     */
    @ComMethod(name = "ImportXML", dispId = 0x979)
    void ImportXML(String DataSource,
            AcImportXMLOption ImportOptions);
            
    /**
     * <p>id(0x921)</p>
     * <p>vtableId(136)</p>
     */
    @ComProperty(name = "NewFileTaskPane", dispId = 0x921)
    jp.kenichi.jna.tlb.office.NewFile getNewFileTaskPane();
            
    /**
     * <p>id(0x97e)</p>
     * <p>vtableId(137)</p>
     * @param DataSource [in] {@code String}
     * @param TransformSource [in] {@code String}
     * @param OutputTarget [in] {@code String}
     * @param WellFormedXMLOutput [in, optional] {@code Boolean}
     * @param ScriptOption [in, optional] {@code AcTransformXMLScriptOption}
     */
    @ComMethod(name = "TransformXML", dispId = 0x97e)
    void TransformXML(String DataSource,
            String TransformSource,
            String OutputTarget,
            Boolean WellFormedXMLOutput,
            AcTransformXMLScriptOption ScriptOption);
            
    /**
     * <p>id(0x97f)</p>
     * <p>vtableId(138)</p>
     */
    @ComMethod(name = "CreateAdditionalData", dispId = 0x97f)
    _AdditionalData CreateAdditionalData();
            
    /**
     * <p>id(0x980)</p>
     * <p>vtableId(139)</p>
     */
    @ComProperty(name = "AutoCorrect", dispId = 0x980)
    _AutoCorrect getAutoCorrect();
            
    /**
     * <p>id(0x989)</p>
     * <p>vtableId(140)</p>
     * @param ObjectType [in] {@code AcExportXMLObjectType}
     * @param DataSource [in] {@code String}
     * @param DataTarget [in, optional] {@code String}
     * @param SchemaTarget [in, optional] {@code String}
     * @param PresentationTarget [in, optional] {@code String}
     * @param ImageTarget [in, optional] {@code String}
     * @param Encoding [in, optional] {@code AcExportXMLEncoding}
     * @param OtherFlags [in, optional] {@code AcExportXMLOtherFlags}
     * @param WhereCondition [in, optional] {@code String}
     * @param AdditionalData [in, optional] {@code Object}
     */
    @ComMethod(name = "ExportXML", dispId = 0x989)
    void ExportXML(AcExportXMLObjectType ObjectType,
            String DataSource,
            String DataTarget,
            String SchemaTarget,
            String PresentationTarget,
            String ImageTarget,
            AcExportXMLEncoding Encoding,
            AcExportXMLOtherFlags OtherFlags,
            String WhereCondition,
            Object AdditionalData);
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(141)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    /**
     * <p>id(0x991)</p>
     * <p>vtableId(142)</p>
     */
    @ComProperty(name = "AutomationSecurity", dispId = 0x991)
    jp.kenichi.jna.tlb.office.MsoAutomationSecurity getAutomationSecurity();
            
    /**
     * <p>id(0x991)</p>
     * <p>vtableId(143)</p>
     * @param param0 [in] {@code jp.kenichi.jna.tlb.office.MsoAutomationSecurity}
     */
    @ComProperty(name = "AutomationSecurity", dispId = 0x991)
    void setAutomationSecurity(jp.kenichi.jna.tlb.office.MsoAutomationSecurity param0);
            
    /**
     * <p>id(0x99b)</p>
     * <p>vtableId(144)</p>
     * @param filepath [in] {@code String}
     * @param FileFormat [in, optional] {@code AcNewDatabaseFormat}
     * @param Template [in, optional] {@code Object}
     * @param SiteAddress [in, optional] {@code String}
     * @param ListID [in, optional] {@code String}
     */
    @ComMethod(name = "NewCurrentDatabase", dispId = 0x99b)
    void NewCurrentDatabase(String filepath,
            AcNewDatabaseFormat FileFormat,
            Object Template,
            String SiteAddress,
            String ListID);
            
    /**
     * <p>id(0x99e)</p>
     * <p>vtableId(145)</p>
     * @param RichText [in] {@code Object}
     * @param Length [in, optional] {@code Object}
     */
    @ComMethod(name = "PlainText", dispId = 0x99e)
    String PlainText(Object RichText,
            Object Length);
            
    /**
     * <p>id(0x9b5)</p>
     * <p>vtableId(146)</p>
     * @param PlainText [in] {@code Object}
     * @param Length [in, optional] {@code Object}
     */
    @ComMethod(name = "HtmlEncode", dispId = 0x9b5)
    String HtmlEncode(Object PlainText,
            Object Length);
            
    /**
     * <p>id(0x9ab)</p>
     * <p>vtableId(147)</p>
     */
    @ComProperty(name = "MacroError", dispId = 0x9ab)
    MacroError getMacroError();
            
    /**
     * <p>id(0x9b4)</p>
     * <p>vtableId(148)</p>
     * @param CustomUIName [in] {@code String}
     * @param CustomUIXML [in] {@code String}
     */
    @ComMethod(name = "LoadCustomUI", dispId = 0x9b4)
    void LoadCustomUI(String CustomUIName,
            String CustomUIXML);
            
    /**
     * <p>id(0x9b7)</p>
     * <p>vtableId(149)</p>
     */
    @ComProperty(name = "TempVars", dispId = 0x9b7)
    TempVars getTempVars();
            
    /**
     * <p>id(0x9ba)</p>
     * <p>vtableId(150)</p>
     * @param Path [in] {@code String}
     */
    @ComMethod(name = "ExportNavigationPane", dispId = 0x9ba)
    void ExportNavigationPane(String Path);
            
    /**
     * <p>id(0x9bb)</p>
     * <p>vtableId(151)</p>
     * @param Path [in] {@code String}
     * @param fAppendOnly [in, optional] {@code Boolean}
     */
    @ComMethod(name = "ImportNavigationPane", dispId = 0x9bb)
    void ImportNavigationPane(String Path,
            Boolean fAppendOnly);
            
    /**
     * <p>id(0x9bd)</p>
     * <p>vtableId(152)</p>
     * @param TableName [in] {@code String}
     * @param ColumnName [in] {@code String}
     * @param queryString [in] {@code String}
     */
    @ComMethod(name = "ColumnHistory", dispId = 0x9bd)
    String ColumnHistory(String TableName,
            String ColumnName,
            String queryString);
            
    /**
     * <p>id(0x9be)</p>
     * <p>vtableId(153)</p>
     */
    @ComProperty(name = "Assistance", dispId = 0x9be)
    jp.kenichi.jna.tlb.office.IAssistance getAssistance();
            
    /**
     * <p>id(0x9bf)</p>
     * <p>vtableId(154)</p>
     * @param FormName [in] {@code String}
     * @param ControlType [in] {@code AcControlType}
     * @param Section [in, optional] {@code AcSection}
     * @param Parent [in, optional] {@code Object}
     * @param ColumnName [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateControl", dispId = 0x9bf)
    _Control CreateControl(String FormName,
            AcControlType ControlType,
            AcSection Section,
            Object Parent,
            Object ColumnName,
            Object Left,
            Object Top,
            Object Width,
            Object Height);
            
    /**
     * <p>id(0x9c0)</p>
     * <p>vtableId(155)</p>
     * @param ReportName [in] {@code String}
     * @param ControlType [in] {@code AcControlType}
     * @param Section [in, optional] {@code AcSection}
     * @param Parent [in, optional] {@code Object}
     * @param ColumnName [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateReportControl", dispId = 0x9c0)
    _Control CreateReportControl(String ReportName,
            AcControlType ControlType,
            AcSection Section,
            Object Parent,
            Object ColumnName,
            Object Left,
            Object Top,
            Object Width,
            Object Height);
            
    /**
     * <p>id(0x9c1)</p>
     * <p>vtableId(156)</p>
     * @param FormName [in] {@code String}
     * @param ControlType [in] {@code AcControlType}
     * @param Section [in] {@code AcSection}
     * @param Parent [in] {@code String}
     * @param ControlSource [in] {@code String}
     * @param Left [in] {@code Integer}
     * @param Top [in] {@code Integer}
     * @param Width [in] {@code Integer}
     * @param Height [in] {@code Integer}
     */
    @ComMethod(name = "CreateControlEx", dispId = 0x9c1)
    _Control CreateControlEx(String FormName,
            AcControlType ControlType,
            AcSection Section,
            String Parent,
            String ControlSource,
            Integer Left,
            Integer Top,
            Integer Width,
            Integer Height);
            
    /**
     * <p>id(0x9c2)</p>
     * <p>vtableId(157)</p>
     * @param ReportName [in] {@code String}
     * @param ControlType [in] {@code AcControlType}
     * @param Section [in] {@code AcSection}
     * @param Parent [in] {@code String}
     * @param ControlName [in] {@code String}
     * @param Left [in] {@code Integer}
     * @param Top [in] {@code Integer}
     * @param Width [in] {@code Integer}
     * @param Height [in] {@code Integer}
     */
    @ComMethod(name = "CreateReportControlEx", dispId = 0x9c2)
    _Control CreateReportControlEx(String ReportName,
            AcControlType ControlType,
            AcSection Section,
            String Parent,
            String ControlName,
            Integer Left,
            Integer Top,
            Integer Width,
            Integer Height);
            
    /**
     * <p>id(0x9c3)</p>
     * <p>vtableId(158)</p>
     * @param ExternalExporter [in] {@code Object}
     * @param OutputFileName [in] {@code String}
     * @param ObjectName [in] {@code String}
     * @param ObjectType [in] {@code AcOutputObjectType}
     * @param SelectedRecords [in, optional] {@code Boolean}
     * @param FromPage [in, optional] {@code Integer}
     * @param ToPage [in, optional] {@code Integer}
     */
    @ComMethod(name = "ExportCustomFixedFormat", dispId = 0x9c3)
    void ExportCustomFixedFormat(Object ExternalExporter,
            String OutputFileName,
            String ObjectName,
            AcOutputObjectType ObjectType,
            Boolean SelectedRecords,
            Integer FromPage,
            Integer ToPage);
            
    /**
     * <p>id(0x9c9)</p>
     * <p>vtableId(159)</p>
     * @param ObjectType [in] {@code AcObjectType}
     * @param ObjectName [in] {@code String}
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "SaveAsAXL", dispId = 0x9c9)
    void SaveAsAXL(AcObjectType ObjectType,
            String ObjectName,
            String FileName);
            
    /**
     * <p>id(0x9ca)</p>
     * <p>vtableId(160)</p>
     * @param ObjectType [in] {@code AcObjectType}
     * @param ObjectName [in] {@code String}
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "LoadFromAXL", dispId = 0x9ca)
    void LoadFromAXL(AcObjectType ObjectType,
            String ObjectName,
            String FileName);
            
    /**
     * <p>id(0xa0a)</p>
     * <p>vtableId(161)</p>
     * @param Path [in] {@code String}
     * @param Title [in] {@code String}
     * @param IconPath [in] {@code String}
     * @param CoreTable [in] {@code String}
     * @param Category [in] {@code String}
     * @param PreviewPath [in, optional] {@code Object}
     * @param Description [in, optional] {@code Object}
     * @param InstantiationForm [in, optional] {@code Object}
     * @param ApplicationPart [in, optional] {@code Object}
     * @param IncludeData [in, optional] {@code Object}
     * @param Variation [in, optional] {@code Object}
     */
    @ComMethod(name = "SaveAsTemplate", dispId = 0xa0a)
    void SaveAsTemplate(String Path,
            String Title,
            String IconPath,
            String CoreTable,
            String Category,
            Object PreviewPath,
            Object Description,
            Object InstantiationForm,
            Object ApplicationPart,
            Object IncludeData,
            Object Variation);
            
    /**
     * <p>id(0xa0d)</p>
     * <p>vtableId(162)</p>
     * @param Path [in] {@code String}
     */
    @ComMethod(name = "InstantiateTemplate", dispId = 0xa0d)
    void InstantiateTemplate(String Path);
            
    /**
     * <p>id(0xa15)</p>
     * <p>vtableId(163)</p>
     */
    @ComProperty(name = "WebServices", dispId = 0xa15)
    WebServices getWebServices();
            
    /**
     * <p>id(0xa13)</p>
     * <p>vtableId(164)</p>
     */
    @ComProperty(name = "LocalVars", dispId = 0xa13)
    LocalVars getLocalVars();
            
    /**
     * <p>id(0xa1a)</p>
     * <p>vtableId(165)</p>
     * @param DisplayOption [in] {@code AcWebUserDisplay}
     */
    @ComMethod(name = "CurrentWebUser", dispId = 0xa1a)
    Object CurrentWebUser(AcWebUserDisplay DisplayOption);
            
    /**
     * <p>id(0xa1b)</p>
     * <p>vtableId(166)</p>
     * @param DisplayOption [in] {@code AcWebUserGroupsDisplay}
     */
    @ComMethod(name = "CurrentWebUserGroups", dispId = 0xa1b)
    Object CurrentWebUserGroups(AcWebUserGroupsDisplay DisplayOption);
            
    /**
     * <p>id(0xa1c)</p>
     * <p>vtableId(167)</p>
     * @param GroupNameOrID [in] {@code Object}
     */
    @ComMethod(name = "IsCurrentWebUserInGroup", dispId = 0xa1c)
    Boolean IsCurrentWebUserInGroup(Object GroupNameOrID);
            
    /**
     * <p>id(0xa22)</p>
     * <p>vtableId(168)</p>
     * @param ObjectType [in] {@code AcObjectType}
     * @param ObjectName [in] {@code String}
     */
    @ComMethod(name = "DirtyObject", dispId = 0xa22)
    void DirtyObject(AcObjectType ObjectType,
            String ObjectName);
            
    /**
     * <p>id(0xa26)</p>
     * <p>vtableId(169)</p>
     */
    @ComMethod(name = "IsClient", dispId = 0xa26)
    Boolean IsClient();
            
    /**
     * <p>id(0xa27)</p>
     * <p>vtableId(170)</p>
     */
    @ComProperty(name = "ReturnVars", dispId = 0xa27)
    ReturnVars getReturnVars();
            
    
}