
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({C547E760-9658-101B-81EE-00AA004750E2})</p>
 */
@ComInterface(iid="{C547E760-9658-101B-81EE-00AA004750E2}")
public interface DoCmd extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(7)</p>
     * @param MenuName [in] {@code Object}
     * @param MenuMacroName [in] {@code Object}
     * @param StatusBarText [in, optional] {@code Object}
     */
    @ComMethod(name = "AddMenu", dispId = 0x3e9)
    void AddMenu(Object MenuName,
            Object MenuMacroName,
            Object StatusBarText);
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(8)</p>
     * @param FilterName [in, optional] {@code Object}
     * @param WhereCondition [in, optional] {@code Object}
     */
    @ComMethod(name = "ApplyFilterOld0", dispId = 0x3ea)
    void ApplyFilterOld0(Object FilterName,
            Object WhereCondition);
            
    /**
     * <p>id(0x3eb)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "Beep", dispId = 0x3eb)
    void Beep();
            
    /**
     * <p>id(0x3ec)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "CancelEvent", dispId = 0x3ec)
    void CancelEvent();
            
    /**
     * <p>id(0x3ed)</p>
     * <p>vtableId(11)</p>
     * @param ObjectType [in, optional] {@code AcObjectType}
     * @param ObjectName [in, optional] {@code Object}
     * @param Save [in, optional] {@code AcCloseSave}
     */
    @ComMethod(name = "Close", dispId = 0x3ed)
    void Close(AcObjectType ObjectType,
            Object ObjectName,
            AcCloseSave Save);
            
    /**
     * <p>id(0x3ee)</p>
     * <p>vtableId(12)</p>
     * @param DestinationDatabase [in, optional] {@code Object}
     * @param NewName [in, optional] {@code Object}
     * @param SourceObjectType [in, optional] {@code AcObjectType}
     * @param SourceObjectName [in, optional] {@code Object}
     */
    @ComMethod(name = "CopyObject", dispId = 0x3ee)
    void CopyObject(Object DestinationDatabase,
            Object NewName,
            AcObjectType SourceObjectType,
            Object SourceObjectName);
            
    /**
     * <p>id(0x3ef)</p>
     * <p>vtableId(13)</p>
     * @param MenuBar [in] {@code Object}
     * @param MenuName [in] {@code Object}
     * @param Command [in] {@code Object}
     * @param Subcommand [in, optional] {@code Object}
     * @param Version [in, optional] {@code Object}
     */
    @ComMethod(name = "DoMenuItem", dispId = 0x3ef)
    void DoMenuItem(Object MenuBar,
            Object MenuName,
            Object Command,
            Object Subcommand,
            Object Version);
            
    /**
     * <p>id(0x3f0)</p>
     * <p>vtableId(14)</p>
     * @param EchoOn [in] {@code Object}
     * @param StatusBarText [in, optional] {@code Object}
     */
    @ComMethod(name = "Echo", dispId = 0x3f0)
    void Echo(Object EchoOn,
            Object StatusBarText);
            
    /**
     * <p>id(0x3f1)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "FindNext", dispId = 0x3f1)
    void FindNext();
            
    /**
     * <p>id(0x3f2)</p>
     * <p>vtableId(16)</p>
     * @param FindWhat [in] {@code Object}
     * @param Match [in, optional] {@code AcFindMatch}
     * @param MatchCase [in, optional] {@code Object}
     * @param Search [in, optional] {@code AcSearchDirection}
     * @param SearchAsFormatted [in, optional] {@code Object}
     * @param OnlyCurrentField [in, optional] {@code AcFindField}
     * @param FindFirst [in, optional] {@code Object}
     */
    @ComMethod(name = "FindRecord", dispId = 0x3f2)
    void FindRecord(Object FindWhat,
            AcFindMatch Match,
            Object MatchCase,
            AcSearchDirection Search,
            Object SearchAsFormatted,
            AcFindField OnlyCurrentField,
            Object FindFirst);
            
    /**
     * <p>id(0x3f3)</p>
     * <p>vtableId(17)</p>
     * @param ControlName [in] {@code Object}
     */
    @ComMethod(name = "GoToControl", dispId = 0x3f3)
    void GoToControl(Object ControlName);
            
    /**
     * <p>id(0x3f4)</p>
     * <p>vtableId(18)</p>
     * @param PageNumber [in] {@code Object}
     * @param Right [in, optional] {@code Object}
     * @param Down [in, optional] {@code Object}
     */
    @ComMethod(name = "GoToPage", dispId = 0x3f4)
    void GoToPage(Object PageNumber,
            Object Right,
            Object Down);
            
    /**
     * <p>id(0x3f5)</p>
     * <p>vtableId(19)</p>
     * @param ObjectType [in, optional] {@code AcDataObjectType}
     * @param ObjectName [in, optional] {@code Object}
     * @param Record [in, optional] {@code AcRecord}
     * @param Offset [in, optional] {@code Object}
     */
    @ComMethod(name = "GoToRecord", dispId = 0x3f5)
    void GoToRecord(AcDataObjectType ObjectType,
            Object ObjectName,
            AcRecord Record,
            Object Offset);
            
    /**
     * <p>id(0x3f6)</p>
     * <p>vtableId(20)</p>
     * @param HourglassOn [in] {@code Object}
     */
    @ComMethod(name = "Hourglass", dispId = 0x3f6)
    void Hourglass(Object HourglassOn);
            
    /**
     * <p>id(0x3f7)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Maximize", dispId = 0x3f7)
    void Maximize();
            
    /**
     * <p>id(0x3f8)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "Minimize", dispId = 0x3f8)
    void Minimize();
            
    /**
     * <p>id(0x3f9)</p>
     * <p>vtableId(23)</p>
     * @param Right [in, optional] {@code Object}
     * @param Down [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveSize", dispId = 0x3f9)
    void MoveSize(Object Right,
            Object Down,
            Object Width,
            Object Height);
            
    /**
     * <p>id(0x3fb)</p>
     * <p>vtableId(24)</p>
     * @param FormName [in] {@code Object}
     * @param View [in, optional] {@code AcFormView}
     * @param FilterName [in, optional] {@code Object}
     * @param WhereCondition [in, optional] {@code Object}
     * @param DataMode [in, optional] {@code AcFormOpenDataMode}
     * @param WindowMode [in, optional] {@code AcWindowMode}
     * @param OpenArgs [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenForm", dispId = 0x3fb)
    void OpenForm(Object FormName,
            AcFormView View,
            Object FilterName,
            Object WhereCondition,
            AcFormOpenDataMode DataMode,
            AcWindowMode WindowMode,
            Object OpenArgs);
            
    /**
     * <p>id(0x3fc)</p>
     * <p>vtableId(25)</p>
     * @param QueryName [in] {@code Object}
     * @param View [in, optional] {@code AcView}
     * @param DataMode [in, optional] {@code AcOpenDataMode}
     */
    @ComMethod(name = "OpenQuery", dispId = 0x3fc)
    void OpenQuery(Object QueryName,
            AcView View,
            AcOpenDataMode DataMode);
            
    /**
     * <p>id(0x3fd)</p>
     * <p>vtableId(26)</p>
     * @param TableName [in] {@code Object}
     * @param View [in, optional] {@code AcView}
     * @param DataMode [in, optional] {@code AcOpenDataMode}
     */
    @ComMethod(name = "OpenTable", dispId = 0x3fd)
    void OpenTable(Object TableName,
            AcView View,
            AcOpenDataMode DataMode);
            
    /**
     * <p>id(0x3fe)</p>
     * <p>vtableId(27)</p>
     * @param PrintRange [in, optional] {@code AcPrintRange}
     * @param PageFrom [in, optional] {@code Object}
     * @param PageTo [in, optional] {@code Object}
     * @param PrintQuality [in, optional] {@code AcPrintQuality}
     * @param Copies [in, optional] {@code Object}
     * @param CollateCopies [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintOut", dispId = 0x3fe)
    void PrintOut(AcPrintRange PrintRange,
            Object PageFrom,
            Object PageTo,
            AcPrintQuality PrintQuality,
            Object Copies,
            Object CollateCopies);
            
    /**
     * <p>id(0x3ff)</p>
     * <p>vtableId(28)</p>
     * @param Options [in, optional] {@code AcQuitOption}
     */
    @ComMethod(name = "Quit", dispId = 0x3ff)
    void Quit(AcQuitOption Options);
            
    /**
     * <p>id(0x400)</p>
     * <p>vtableId(29)</p>
     * @param ControlName [in, optional] {@code Object}
     */
    @ComMethod(name = "Requery", dispId = 0x400)
    void Requery(Object ControlName);
            
    /**
     * <p>id(0x401)</p>
     * <p>vtableId(30)</p>
     * @param ObjectType [in, optional] {@code AcObjectType}
     * @param ObjectName [in, optional] {@code Object}
     */
    @ComMethod(name = "RepaintObject", dispId = 0x401)
    void RepaintObject(AcObjectType ObjectType,
            Object ObjectName);
            
    /**
     * <p>id(0x402)</p>
     * <p>vtableId(31)</p>
     * @param NewName [in] {@code Object}
     * @param ObjectType [in, optional] {@code AcObjectType}
     * @param OldName [in, optional] {@code Object}
     */
    @ComMethod(name = "Rename", dispId = 0x402)
    void Rename(Object NewName,
            AcObjectType ObjectType,
            Object OldName);
            
    /**
     * <p>id(0x403)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "Restore", dispId = 0x403)
    void Restore();
            
    /**
     * <p>id(0x406)</p>
     * <p>vtableId(33)</p>
     * @param MacroName [in] {@code Object}
     * @param RepeatCount [in, optional] {@code Object}
     * @param RepeatExpression [in, optional] {@code Object}
     */
    @ComMethod(name = "RunMacro", dispId = 0x406)
    void RunMacro(Object MacroName,
            Object RepeatCount,
            Object RepeatExpression);
            
    /**
     * <p>id(0x407)</p>
     * <p>vtableId(34)</p>
     * @param SQLStatement [in] {@code Object}
     * @param UseTransaction [in, optional] {@code Object}
     */
    @ComMethod(name = "RunSQL", dispId = 0x407)
    void RunSQL(Object SQLStatement,
            Object UseTransaction);
            
    /**
     * <p>id(0x408)</p>
     * <p>vtableId(35)</p>
     * @param ObjectType [in] {@code AcObjectType}
     * @param ObjectName [in, optional] {@code Object}
     * @param InDatabaseWindow [in, optional] {@code Object}
     */
    @ComMethod(name = "SelectObject", dispId = 0x408)
    void SelectObject(AcObjectType ObjectType,
            Object ObjectName,
            Object InDatabaseWindow);
            
    /**
     * <p>id(0x40b)</p>
     * <p>vtableId(36)</p>
     * @param WarningsOn [in] {@code Object}
     */
    @ComMethod(name = "SetWarnings", dispId = 0x40b)
    void SetWarnings(Object WarningsOn);
            
    /**
     * <p>id(0x40c)</p>
     * <p>vtableId(37)</p>
     */
    @ComMethod(name = "ShowAllRecords", dispId = 0x40c)
    void ShowAllRecords();
            
    /**
     * <p>id(0x40f)</p>
     * <p>vtableId(38)</p>
     * @param ReportName [in] {@code Object}
     * @param View [in, optional] {@code AcView}
     * @param FilterName [in, optional] {@code Object}
     * @param WhereCondition [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenReportOld0", dispId = 0x40f)
    void OpenReportOld0(Object ReportName,
            AcView View,
            Object FilterName,
            Object WhereCondition);
            
    /**
     * <p>id(0x410)</p>
     * <p>vtableId(39)</p>
     * @param TransferType [in, optional] {@code AcDataTransferType}
     * @param DatabaseType [in, optional] {@code Object}
     * @param DatabaseName [in, optional] {@code Object}
     * @param ObjectType [in, optional] {@code AcObjectType}
     * @param Source [in, optional] {@code Object}
     * @param Destination [in, optional] {@code Object}
     * @param StructureOnly [in, optional] {@code Object}
     * @param StoreLogin [in, optional] {@code Object}
     */
    @ComMethod(name = "TransferDatabase", dispId = 0x410)
    void TransferDatabase(AcDataTransferType TransferType,
            Object DatabaseType,
            Object DatabaseName,
            AcObjectType ObjectType,
            Object Source,
            Object Destination,
            Object StructureOnly,
            Object StoreLogin);
            
    /**
     * <p>id(0x411)</p>
     * <p>vtableId(40)</p>
     * @param TransferType [in, optional] {@code AcDataTransferType}
     * @param SpreadsheetType [in, optional] {@code AcSpreadSheetType}
     * @param TableName [in, optional] {@code Object}
     * @param FileName [in, optional] {@code Object}
     * @param HasFieldNames [in, optional] {@code Object}
     * @param Range [in, optional] {@code Object}
     * @param UseOA [in, optional] {@code Object}
     */
    @ComMethod(name = "TransferSpreadsheet", dispId = 0x411)
    void TransferSpreadsheet(AcDataTransferType TransferType,
            AcSpreadSheetType SpreadsheetType,
            Object TableName,
            Object FileName,
            Object HasFieldNames,
            Object Range,
            Object UseOA);
            
    /**
     * <p>id(0x412)</p>
     * <p>vtableId(41)</p>
     * @param TransferType [in, optional] {@code AcTextTransferType}
     * @param SpecificationName [in, optional] {@code Object}
     * @param TableName [in, optional] {@code Object}
     * @param FileName [in, optional] {@code Object}
     * @param HasFieldNames [in, optional] {@code Object}
     * @param HTMLTableName [in, optional] {@code Object}
     * @param CodePage [in, optional] {@code Object}
     */
    @ComMethod(name = "TransferText", dispId = 0x412)
    void TransferText(AcTextTransferType TransferType,
            Object SpecificationName,
            Object TableName,
            Object FileName,
            Object HasFieldNames,
            Object HTMLTableName,
            Object CodePage);
            
    /**
     * <p>id(0x53d)</p>
     * <p>vtableId(42)</p>
     * @param ObjectType [in] {@code AcOutputObjectType}
     * @param ObjectName [in, optional] {@code Object}
     * @param OutputFormat [in, optional] {@code Object}
     * @param OutputFile [in, optional] {@code Object}
     * @param AutoStart [in, optional] {@code Object}
     * @param TemplateFile [in, optional] {@code Object}
     */
    @ComMethod(name = "OutputToOld0", dispId = 0x53d)
    void OutputToOld0(AcOutputObjectType ObjectType,
            Object ObjectName,
            Object OutputFormat,
            Object OutputFile,
            Object AutoStart,
            Object TemplateFile);
            
    /**
     * <p>id(0x55c)</p>
     * <p>vtableId(43)</p>
     * @param ObjectType [in, optional] {@code AcObjectType}
     * @param ObjectName [in, optional] {@code Object}
     */
    @ComMethod(name = "DeleteObject", dispId = 0x55c)
    void DeleteObject(AcObjectType ObjectType,
            Object ObjectName);
            
    /**
     * <p>id(0x55e)</p>
     * <p>vtableId(44)</p>
     * @param ModuleName [in, optional] {@code Object}
     * @param ProcedureName [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenModule", dispId = 0x55e)
    void OpenModule(Object ModuleName,
            Object ProcedureName);
            
    /**
     * <p>id(0x561)</p>
     * <p>vtableId(45)</p>
     * @param ObjectType [in, optional] {@code AcSendObjectType}
     * @param ObjectName [in, optional] {@code Object}
     * @param OutputFormat [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Cc [in, optional] {@code Object}
     * @param Bcc [in, optional] {@code Object}
     * @param Subject [in, optional] {@code Object}
     * @param MessageText [in, optional] {@code Object}
     * @param EditMessage [in, optional] {@code Object}
     * @param TemplateFile [in, optional] {@code Object}
     */
    @ComMethod(name = "SendObject", dispId = 0x561)
    void SendObject(AcSendObjectType ObjectType,
            Object ObjectName,
            Object OutputFormat,
            Object To,
            Object Cc,
            Object Bcc,
            Object Subject,
            Object MessageText,
            Object EditMessage,
            Object TemplateFile);
            
    /**
     * <p>id(0x572)</p>
     * <p>vtableId(46)</p>
     * @param ToolbarName [in] {@code Object}
     * @param Show [in, optional] {@code AcShowToolbar}
     */
    @ComMethod(name = "ShowToolbar", dispId = 0x572)
    void ShowToolbar(Object ToolbarName,
            AcShowToolbar Show);
            
    /**
     * <p>id(0x5ad)</p>
     * <p>vtableId(47)</p>
     * @param ObjectType [in, optional] {@code AcObjectType}
     * @param ObjectName [in, optional] {@code Object}
     */
    @ComMethod(name = "Save", dispId = 0x5ad)
    void Save(AcObjectType ObjectType,
            Object ObjectName);
            
    /**
     * <p>id(0x5ae)</p>
     * <p>vtableId(48)</p>
     * @param MenuIndex [in] {@code Object}
     * @param CommandIndex [in, optional] {@code Object}
     * @param SubcommandIndex [in, optional] {@code Object}
     * @param Flag [in, optional] {@code Object}
     */
    @ComMethod(name = "SetMenuItem", dispId = 0x5ae)
    void SetMenuItem(Object MenuIndex,
            Object CommandIndex,
            Object SubcommandIndex,
            Object Flag);
            
    /**
     * <p>id(0x642)</p>
     * <p>vtableId(49)</p>
     * @param Command [in] {@code AcCommand}
     */
    @ComMethod(name = "RunCommand", dispId = 0x642)
    void RunCommand(AcCommand Command);
            
    /**
     * <p>id(0x6eb)</p>
     * <p>vtableId(50)</p>
     * @param DataAccessPageName [in] {@code Object}
     * @param View [in, optional] {@code AcDataAccessPageView}
     */
    @ComMethod(name = "OpenDataAccessPage", dispId = 0x6eb)
    void OpenDataAccessPage(Object DataAccessPageName,
            AcDataAccessPageView View);
            
    /**
     * <p>id(0x701)</p>
     * <p>vtableId(51)</p>
     * @param ViewName [in] {@code Object}
     * @param View [in, optional] {@code AcView}
     * @param DataMode [in, optional] {@code AcOpenDataMode}
     */
    @ComMethod(name = "OpenView", dispId = 0x701)
    void OpenView(Object ViewName,
            AcView View,
            AcOpenDataMode DataMode);
            
    /**
     * <p>id(0x702)</p>
     * <p>vtableId(52)</p>
     * @param DiagramName [in] {@code Object}
     */
    @ComMethod(name = "OpenDiagram", dispId = 0x702)
    void OpenDiagram(Object DiagramName);
            
    /**
     * <p>id(0x703)</p>
     * <p>vtableId(53)</p>
     * @param ProcedureName [in] {@code Object}
     * @param View [in, optional] {@code AcView}
     * @param DataMode [in, optional] {@code AcOpenDataMode}
     */
    @ComMethod(name = "OpenStoredProcedure", dispId = 0x703)
    void OpenStoredProcedure(Object ProcedureName,
            AcView View,
            AcOpenDataMode DataMode);
            
    /**
     * <p>id(0x957)</p>
     * <p>vtableId(54)</p>
     * @param ReportName [in] {@code Object}
     * @param View [in, optional] {@code AcView}
     * @param FilterName [in, optional] {@code Object}
     * @param WhereCondition [in, optional] {@code Object}
     * @param WindowMode [in, optional] {@code AcWindowMode}
     * @param OpenArgs [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenReport", dispId = 0x957)
    void OpenReport(Object ReportName,
            AcView View,
            Object FilterName,
            Object WhereCondition,
            AcWindowMode WindowMode,
            Object OpenArgs);
            
    /**
     * <p>id(0x1523)</p>
     * <p>vtableId(55)</p>
     * @param ObjectType [in] {@code AcOutputObjectType}
     * @param ObjectName [in, optional] {@code Object}
     * @param OutputFormat [in, optional] {@code Object}
     * @param OutputFile [in, optional] {@code Object}
     * @param AutoStart [in, optional] {@code Object}
     * @param TemplateFile [in, optional] {@code Object}
     * @param Encoding [in, optional] {@code Object}
     */
    @ComMethod(name = "OutputToOld1", dispId = 0x1523)
    void OutputToOld1(AcOutputObjectType ObjectType,
            Object ObjectName,
            Object OutputFormat,
            Object OutputFile,
            Object AutoStart,
            Object TemplateFile,
            Object Encoding);
            
    /**
     * <p>id(0x74b)</p>
     * <p>vtableId(56)</p>
     * @param Server [in] {@code Object}
     * @param Database [in] {@code Object}
     * @param UseTrustedConnection [in, optional] {@code Object}
     * @param Login [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param TransferCopyData [in, optional] {@code Object}
     */
    @ComMethod(name = "TransferSQLDatabase", dispId = 0x74b)
    void TransferSQLDatabase(Object Server,
            Object Database,
            Object UseTrustedConnection,
            Object Login,
            Object Password,
            Object TransferCopyData);
            
    /**
     * <p>id(0x74c)</p>
     * <p>vtableId(57)</p>
     * @param DatabaseFileName [in] {@code Object}
     * @param OverwriteExistingFile [in, optional] {@code Object}
     * @param DisconnectAllUsers [in, optional] {@code Object}
     */
    @ComMethod(name = "CopyDatabaseFile", dispId = 0x74c)
    void CopyDatabaseFile(Object DatabaseFileName,
            Object OverwriteExistingFile,
            Object DisconnectAllUsers);
            
    /**
     * <p>id(0x74d)</p>
     * <p>vtableId(58)</p>
     * @param FunctionName [in] {@code Object}
     * @param View [in, optional] {@code AcView}
     * @param DataMode [in, optional] {@code AcOpenDataMode}
     */
    @ComMethod(name = "OpenFunction", dispId = 0x74d)
    void OpenFunction(Object FunctionName,
            AcView View,
            AcOpenDataMode DataMode);
            
    /**
     * <p>id(0x7e7)</p>
     * <p>vtableId(59)</p>
     * @param FilterName [in, optional] {@code Object}
     * @param WhereCondition [in, optional] {@code Object}
     * @param ControlName [in, optional] {@code Object}
     */
    @ComMethod(name = "ApplyFilter", dispId = 0x7e7)
    void ApplyFilter(Object FilterName,
            Object WhereCondition,
            Object ControlName);
            
    /**
     * <p>id(0x1525)</p>
     * <p>vtableId(60)</p>
     * @param ObjectType [in] {@code AcOutputObjectType}
     * @param ObjectName [in, optional] {@code Object}
     * @param OutputFormat [in, optional] {@code Object}
     * @param OutputFile [in, optional] {@code Object}
     * @param AutoStart [in, optional] {@code Object}
     * @param TemplateFile [in, optional] {@code Object}
     * @param Encoding [in, optional] {@code Object}
     * @param OutputQuality [in, optional] {@code AcExportQuality}
     */
    @ComMethod(name = "OutputTo", dispId = 0x1525)
    void OutputTo(AcOutputObjectType ObjectType,
            Object ObjectName,
            Object OutputFormat,
            Object OutputFile,
            Object AutoStart,
            Object TemplateFile,
            Object Encoding,
            AcExportQuality OutputQuality);
            
    /**
     * <p>id(0x758)</p>
     * <p>vtableId(61)</p>
     * @param TransferType [in] {@code AcSharePointListTransferType}
     * @param SiteAddress [in] {@code Object}
     * @param ListID [in] {@code Object}
     * @param ViewID [in, optional] {@code Object}
     * @param TableName [in, optional] {@code Object}
     * @param GetLookupDisplayValues [in, optional] {@code Object}
     */
    @ComMethod(name = "TransferSharePointList", dispId = 0x758)
    void TransferSharePointList(AcSharePointListTransferType TransferType,
            Object SiteAddress,
            Object ListID,
            Object ViewID,
            Object TableName,
            Object GetLookupDisplayValues);
            
    /**
     * <p>id(0x763)</p>
     * <p>vtableId(62)</p>
     */
    @ComMethod(name = "CloseDatabase", dispId = 0x763)
    void CloseDatabase();
            
    /**
     * <p>id(0x76d)</p>
     * <p>vtableId(63)</p>
     * @param Category [in, optional] {@code Object}
     * @param Group [in, optional] {@code Object}
     */
    @ComMethod(name = "NavigateTo", dispId = 0x76d)
    void NavigateTo(Object Category,
            Object Group);
            
    /**
     * <p>id(0x76e)</p>
     * <p>vtableId(64)</p>
     * @param ObjectType [in, optional] {@code AcDataObjectType}
     * @param ObjectName [in, optional] {@code Object}
     * @param Record [in, optional] {@code AcRecord}
     * @param WhereCondition [in, optional] {@code Object}
     */
    @ComMethod(name = "SearchForRecord", dispId = 0x76e)
    void SearchForRecord(AcDataObjectType ObjectType,
            Object ObjectName,
            AcRecord Record,
            Object WhereCondition);
            
    /**
     * <p>id(0x76f)</p>
     * <p>vtableId(65)</p>
     * @param ControlName [in, optional] {@code Object}
     * @param Property [in, optional] {@code AcProperty}
     * @param Value [in, optional] {@code Object}
     */
    @ComMethod(name = "SetProperty", dispId = 0x76f)
    void SetProperty(Object ControlName,
            AcProperty Property,
            Object Value);
            
    /**
     * <p>id(0x770)</p>
     * <p>vtableId(66)</p>
     */
    @ComMethod(name = "SingleStep", dispId = 0x770)
    void SingleStep();
            
    /**
     * <p>id(0x771)</p>
     * <p>vtableId(67)</p>
     */
    @ComMethod(name = "ClearMacroError", dispId = 0x771)
    void ClearMacroError();
            
    /**
     * <p>id(0x779)</p>
     * <p>vtableId(68)</p>
     * @param Show [in] {@code Object}
     * @param Category [in, optional] {@code Object}
     */
    @ComMethod(name = "SetDisplayedCategories", dispId = 0x779)
    void SetDisplayedCategories(Object Show,
            Object Category);
            
    /**
     * <p>id(0x77a)</p>
     * <p>vtableId(69)</p>
     * @param Lock [in] {@code Object}
     */
    @ComMethod(name = "LockNavigationPane", dispId = 0x77a)
    void LockNavigationPane(Object Lock);
            
    /**
     * <p>id(0x77e)</p>
     * <p>vtableId(70)</p>
     * @param SavedImportExportName [in] {@code Object}
     */
    @ComMethod(name = "RunSavedImportExport", dispId = 0x77e)
    void RunSavedImportExport(Object SavedImportExportName);
            
    /**
     * <p>id(0x784)</p>
     * <p>vtableId(71)</p>
     * @param ObjectType [in] {@code AcBrowseToObjectType}
     * @param ObjectName [in] {@code Object}
     * @param PathtoSubformControl [in, optional] {@code Object}
     * @param WhereCondition [in, optional] {@code Object}
     * @param Page [in, optional] {@code Object}
     * @param DataMode [in, optional] {@code AcFormOpenDataMode}
     */
    @ComMethod(name = "BrowseTo", dispId = 0x784)
    void BrowseTo(AcBrowseToObjectType ObjectType,
            Object ObjectName,
            Object PathtoSubformControl,
            Object WhereCondition,
            Object Page,
            AcFormOpenDataMode DataMode);
            
    /**
     * <p>id(0x788)</p>
     * <p>vtableId(72)</p>
     * @param Name [in] {@code Object}
     * @param Expression [in] {@code Object}
     */
    @ComMethod(name = "SetParameter", dispId = 0x788)
    void SetParameter(Object Name,
            Object Expression);
            
    /**
     * <p>id(0x789)</p>
     * <p>vtableId(73)</p>
     * @param MacroName [in] {@code Object}
     */
    @ComMethod(name = "RunDataMacro", dispId = 0x789)
    void RunDataMacro(Object MacroName);
            
    /**
     * <p>id(0x78a)</p>
     * <p>vtableId(74)</p>
     * @param OrderBy [in] {@code Object}
     * @param ControlName [in, optional] {@code Object}
     */
    @ComMethod(name = "SetOrderBy", dispId = 0x78a)
    void SetOrderBy(Object OrderBy,
            Object ControlName);
            
    /**
     * <p>id(0x78c)</p>
     * <p>vtableId(75)</p>
     * @param FilterName [in, optional] {@code Object}
     * @param WhereCondition [in, optional] {@code Object}
     * @param ControlName [in, optional] {@code Object}
     */
    @ComMethod(name = "SetFilter", dispId = 0x78c)
    void SetFilter(Object FilterName,
            Object WhereCondition,
            Object ControlName);
            
    /**
     * <p>id(0x78d)</p>
     * <p>vtableId(76)</p>
     */
    @ComMethod(name = "RefreshRecord", dispId = 0x78d)
    void RefreshRecord();
            
    
}