
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({548BFF17-5168-377C-8B1F-772982BD2D68})</p>
 */
public enum AcCommand implements IComEnum {
    
    /**
     * (1)
     */
    acCmdWindowUnhide(1),
    
    /**
     * (2)
     */
    acCmdWindowHide(2),
    
    /**
     * (3)
     */
    acCmdExit(3),
    
    /**
     * (4)
     */
    acCmdCompactDatabase(4),
    
    /**
     * (5)
     */
    acCmdEncryptDecryptDatabase(5),
    
    /**
     * (6)
     */
    acCmdRepairDatabase(6),
    
    /**
     * (7)
     */
    acCmdMakeMDEFile(7),
    
    /**
     * (8)
     */
    acCmdMoreWindows(8),
    
    /**
     * (9)
     */
    acCmdAppRestore(9),
    
    /**
     * (10)
     */
    acCmdAppMaximize(10),
    
    /**
     * (11)
     */
    acCmdAppMinimize(11),
    
    /**
     * (12)
     */
    acCmdAppMove(12),
    
    /**
     * (13)
     */
    acCmdAppSize(13),
    
    /**
     * (14)
     */
    acCmdDocRestore(14),
    
    /**
     * (15)
     */
    acCmdDocMaximize(15),
    
    /**
     * (16)
     */
    acCmdDocMove(16),
    
    /**
     * (17)
     */
    acCmdDocSize(17),
    
    /**
     * (18)
     */
    acCmdRefresh(18),
    
    /**
     * (19)
     */
    acCmdFont(19),
    
    /**
     * (20)
     */
    acCmdSave(20),
    
    /**
     * (21)
     */
    acCmdSaveAs(21),
    
    /**
     * (22)
     */
    acCmdWindowCascade(22),
    
    /**
     * (23)
     */
    acCmdTileVertically(23),
    
    /**
     * (24)
     */
    acCmdWindowArrangeIcons(24),
    
    /**
     * (25)
     */
    acCmdOpenDatabase(25),
    
    /**
     * (26)
     */
    acCmdNewDatabase(26),
    
    /**
     * (27)
     */
    acCmdOLEDDELinks(27),
    
    /**
     * (28)
     */
    acCmdRecordsGoToNew(28),
    
    /**
     * (29)
     */
    acCmdReplace(29),
    
    /**
     * (30)
     */
    acCmdFind(30),
    
    /**
     * (31)
     */
    acCmdRunMacro(31),
    
    /**
     * (32)
     */
    acCmdPageSetup(32),
    
    /**
     * (33)
     */
    acCmdInsertObject(33),
    
    /**
     * (34)
     */
    acCmdDuplicate(34),
    
    /**
     * (35)
     */
    acCmdAboutMicrosoftAccess(35),
    
    /**
     * (36)
     */
    acCmdFormHdrFtr(36),
    
    /**
     * (37)
     */
    acCmdReportHdrFtr(37),
    
    /**
     * (38)
     */
    acCmdPasteAppend(38),
    
    /**
     * (39)
     */
    acCmdInsertFile(39),
    
    /**
     * (40)
     */
    acCmdSelectForm(40),
    
    /**
     * (41)
     */
    acCmdTabOrder(41),
    
    /**
     * (42)
     */
    acCmdFieldList(42),
    
    /**
     * (43)
     */
    acCmdAlignLeft(43),
    
    /**
     * (44)
     */
    acCmdAlignRight(44),
    
    /**
     * (45)
     */
    acCmdAlignTop(45),
    
    /**
     * (46)
     */
    acCmdAlignBottom(46),
    
    /**
     * (47)
     */
    acCmdAlignToGrid(47),
    
    /**
     * (48)
     */
    acCmdSizeToGrid(48),
    
    /**
     * (49)
     */
    acCmdOptions(49),
    
    /**
     * (50)
     */
    acCmdSelectRecord(50),
    
    /**
     * (51)
     */
    acCmdSortingAndGrouping(51),
    
    /**
     * (52)
     */
    acCmdBringToFront(52),
    
    /**
     * (53)
     */
    acCmdSendToBack(53),
    
    /**
     * (54)
     */
    acCmdPrintPreview(54),
    
    /**
     * (55)
     */
    acCmdApplyDefault(55),
    
    /**
     * (56)
     */
    acCmdSetControlDefaults(56),
    
    /**
     * (57)
     */
    acCmdOLEObjectDefaultVerb(57),
    
    /**
     * (58)
     */
    acCmdClose(58),
    
    /**
     * (59)
     */
    acCmdSizeToFit(59),
    
    /**
     * (60)
     */
    acCmdDocMinimize(60),
    
    /**
     * (61)
     */
    acCmdViewRuler(61),
    
    /**
     * (62)
     */
    acCmdSnapToGrid(62),
    
    /**
     * (63)
     */
    acCmdViewGrid(63),
    
    /**
     * (64)
     */
    acCmdPasteSpecial(64),
    
    /**
     * (65)
     */
    acCmdRecordsGoToNext(65),
    
    /**
     * (66)
     */
    acCmdRecordsGoToPrevious(66),
    
    /**
     * (67)
     */
    acCmdRecordsGoToFirst(67),
    
    /**
     * (68)
     */
    acCmdRecordsGoToLast(68),
    
    /**
     * (69)
     */
    acCmdSizeToFitForm(69),
    
    /**
     * (70)
     */
    acCmdEditingAllowed(70),
    
    /**
     * (71)
     */
    acCmdClearGrid(71),
    
    /**
     * (72)
     */
    acCmdJoinProperties(72),
    
    /**
     * (73)
     */
    acCmdQueryTotals(73),
    
    /**
     * (74)
     */
    acCmdQueryTypeCrosstab(74),
    
    /**
     * (75)
     */
    acCmdTableNames(75),
    
    /**
     * (76)
     */
    acCmdQueryParameters(76),
    
    /**
     * (77)
     */
    acCmdFormatCells(77),
    
    /**
     * (78)
     */
    acCmdDataEntry(78),
    
    /**
     * (79)
     */
    acCmdHideColumns(79),
    
    /**
     * (80)
     */
    acCmdUnhideColumns(80),
    
    /**
     * (81)
     */
    acCmdDeleteQueryColumn(81),
    
    /**
     * (82)
     */
    acCmdInsertQueryColumn(82),
    
    /**
     * (84)
     */
    acCmdRemoveTable(84),
    
    /**
     * (85)
     */
    acCmdViewToolbox(85),
    
    /**
     * (86)
     */
    acCmdMacroNames(86),
    
    /**
     * (87)
     */
    acCmdMacroConditions(87),
    
    /**
     * (88)
     */
    acCmdSingleStep(88),
    
    /**
     * (89)
     */
    acCmdQueryTypeSelect(89),
    
    /**
     * (90)
     */
    acCmdQueryTypeUpdate(90),
    
    /**
     * (91)
     */
    acCmdQueryTypeAppend(91),
    
    /**
     * (92)
     */
    acCmdQueryTypeDelete(92),
    
    /**
     * (93)
     */
    acCmdApplyFilterSort(93),
    
    /**
     * (94)
     */
    acCmdQueryTypeMakeTable(94),
    
    /**
     * (95)
     */
    acCmdLoadFromQuery(95),
    
    /**
     * (96)
     */
    acCmdSaveAsQuery(96),
    
    /**
     * (97)
     */
    acCmdSaveRecord(97),
    
    /**
     * (99)
     */
    acCmdAdvancedFilterSort(99),
    
    /**
     * (100)
     */
    acCmdMicrosoftAccessHelpTopics(100),
    
    /**
     * (102)
     */
    acCmdLinkTables(102),
    
    /**
     * (103)
     */
    acCmdUserAndGroupPermissions(103),
    
    /**
     * (104)
     */
    acCmdUserAndGroupAccounts(104),
    
    /**
     * (105)
     */
    acCmdFreezeColumn(105),
    
    /**
     * (106)
     */
    acCmdUnfreezeAllColumns(106),
    
    /**
     * (107)
     */
    acCmdPrimaryKey(107),
    
    /**
     * (108)
     */
    acCmdSubformDatasheet(108),
    
    /**
     * (109)
     */
    acCmdSelectAllRecords(109),
    
    /**
     * (110)
     */
    acCmdViewTables(110),
    
    /**
     * (111)
     */
    acCmdViewQueries(111),
    
    /**
     * (112)
     */
    acCmdViewForms(112),
    
    /**
     * (113)
     */
    acCmdViewReports(113),
    
    /**
     * (114)
     */
    acCmdViewMacros(114),
    
    /**
     * (115)
     */
    acCmdViewModules(115),
    
    /**
     * (116)
     */
    acCmdRowHeight(116),
    
    /**
     * (117)
     */
    acCmdColumnWidth(117),
    
    /**
     * (118)
     */
    acCmdInsertFileIntoModule(118),
    
    /**
     * (119)
     */
    acCmdSaveModuleAsText(119),
    
    /**
     * (120)
     */
    acCmdFindPrevious(120),
    
    /**
     * (121)
     */
    acCmdWindowSplit(121),
    
    /**
     * (122)
     */
    acCmdProcedureDefinition(122),
    
    /**
     * (123)
     */
    acCmdDebugWindow(123),
    
    /**
     * (124)
     */
    acCmdReset(124),
    
    /**
     * (125)
     */
    acCmdCompileAllModules(125),
    
    /**
     * (126)
     */
    acCmdCompileAndSaveAllModules(126),
    
    /**
     * (127)
     */
    acCmdGoContinue(127),
    
    /**
     * (128)
     */
    acCmdStepOver(128),
    
    /**
     * (129)
     */
    acCmdSetNextStatement(129),
    
    /**
     * (130)
     */
    acCmdShowNextStatement(130),
    
    /**
     * (131)
     */
    acCmdToggleBreakpoint(131),
    
    /**
     * (132)
     */
    acCmdClearAllBreakpoints(132),
    
    /**
     * (133)
     */
    acCmdRelationships(133),
    
    /**
     * (134)
     */
    acCmdNewObjectTable(134),
    
    /**
     * (135)
     */
    acCmdNewObjectQuery(135),
    
    /**
     * (136)
     */
    acCmdNewObjectForm(136),
    
    /**
     * (137)
     */
    acCmdNewObjectReport(137),
    
    /**
     * (138)
     */
    acCmdNewObjectMacro(138),
    
    /**
     * (139)
     */
    acCmdNewObjectModule(139),
    
    /**
     * (140)
     */
    acCmdNewObjectClassModule(140),
    
    /**
     * (141)
     */
    acCmdLayoutPreview(141),
    
    /**
     * (142)
     */
    acCmdSaveAsReport(142),
    
    /**
     * (143)
     */
    acCmdRename(143),
    
    /**
     * (144)
     */
    acCmdRemoveFilterSort(144),
    
    /**
     * (145)
     */
    acCmdSaveLayout(145),
    
    /**
     * (146)
     */
    acCmdClearAll(146),
    
    /**
     * (147)
     */
    acCmdHideTable(147),
    
    /**
     * (148)
     */
    acCmdShowDirectRelationships(148),
    
    /**
     * (149)
     */
    acCmdShowAllRelationships(149),
    
    /**
     * (150)
     */
    acCmdCreateRelationship(150),
    
    /**
     * (151)
     */
    acCmdEditRelationship(151),
    
    /**
     * (152)
     */
    acCmdIndexes(152),
    
    /**
     * (153)
     */
    acCmdAlignToShortest(153),
    
    /**
     * (154)
     */
    acCmdAlignToTallest(154),
    
    /**
     * (155)
     */
    acCmdSizeToNarrowest(155),
    
    /**
     * (156)
     */
    acCmdSizeToWidest(156),
    
    /**
     * (157)
     */
    acCmdHorizontalSpacingMakeEqual(157),
    
    /**
     * (158)
     */
    acCmdHorizontalSpacingDecrease(158),
    
    /**
     * (159)
     */
    acCmdHorizontalSpacingIncrease(159),
    
    /**
     * (160)
     */
    acCmdVerticalSpacingMakeEqual(160),
    
    /**
     * (161)
     */
    acCmdVerticalSpacingDecrease(161),
    
    /**
     * (162)
     */
    acCmdVerticalSpacingIncrease(162),
    
    /**
     * (163)
     */
    acCmdSortAscending(163),
    
    /**
     * (164)
     */
    acCmdSortDescending(164),
    
    /**
     * (165)
     */
    acCmdToolbarsCustomize(165),
    
    /**
     * (167)
     */
    acCmdOLEObjectConvert(167),
    
    /**
     * (168)
     */
    acCmdQueryTypeSQLDataDefinition(168),
    
    /**
     * (169)
     */
    acCmdQueryTypeSQLPassThrough(169),
    
    /**
     * (170)
     */
    acCmdViewCode(170),
    
    /**
     * (171)
     */
    acCmdConvertDatabase(171),
    
    /**
     * (172)
     */
    acCmdCallStack(172),
    
    /**
     * (173)
     */
    acCmdSend(173),
    
    /**
     * (175)
     */
    acCmdOutputToExcel(175),
    
    /**
     * (176)
     */
    acCmdOutputToRTF(176),
    
    /**
     * (177)
     */
    acCmdOutputToText(177),
    
    /**
     * (178)
     */
    acCmdInvokeBuilder(178),
    
    /**
     * (179)
     */
    acCmdZoomBox(179),
    
    /**
     * (180)
     */
    acCmdQueryTypeSQLUnion(180),
    
    /**
     * (181)
     */
    acCmdRun(181),
    
    /**
     * (182)
     */
    acCmdPageHdrFtr(182),
    
    /**
     * (183)
     */
    acCmdDesignView(183),
    
    /**
     * (184)
     */
    acCmdSQLView(184),
    
    /**
     * (185)
     */
    acCmdShowTable(185),
    
    /**
     * (186)
     */
    acCmdCloseWindow(186),
    
    /**
     * (187)
     */
    acCmdInsertRows(187),
    
    /**
     * (188)
     */
    acCmdDeleteRows(188),
    
    /**
     * (189)
     */
    acCmdCut(189),
    
    /**
     * (190)
     */
    acCmdCopy(190),
    
    /**
     * (191)
     */
    acCmdPaste(191),
    
    /**
     * (192)
     */
    acCmdAutoDial(192),
    
    /**
     * (193)
     */
    acCmdNewObjectAutoForm(193),
    
    /**
     * (194)
     */
    acCmdNewObjectAutoReport(194),
    
    /**
     * (195)
     */
    acCmdWordMailMerge(195),
    
    /**
     * (196)
     */
    acCmdTestValidationRules(196),
    
    /**
     * (197)
     */
    acCmdControlWizardsToggle(197),
    
    /**
     * (198)
     */
    acCmdEnd(198),
    
    /**
     * (199)
     */
    acCmdRedo(199),
    
    /**
     * (200)
     */
    acCmdObjectBrowser(200),
    
    /**
     * (201)
     */
    acCmdAddWatch(201),
    
    /**
     * (202)
     */
    acCmdEditWatch(202),
    
    /**
     * (203)
     */
    acCmdQuickWatch(203),
    
    /**
     * (204)
     */
    acCmdStepToCursor(204),
    
    /**
     * (205)
     */
    acCmdIndent(205),
    
    /**
     * (206)
     */
    acCmdOutdent(206),
    
    /**
     * (207)
     */
    acCmdFilterByForm(207),
    
    /**
     * (208)
     */
    acCmdFilterBySelection(208),
    
    /**
     * (209)
     */
    acCmdViewLargeIcons(209),
    
    /**
     * (210)
     */
    acCmdViewDetails(210),
    
    /**
     * (211)
     */
    acCmdViewSmallIcons(211),
    
    /**
     * (212)
     */
    acCmdViewList(212),
    
    /**
     * (213)
     */
    acCmdLineUpIcons(213),
    
    /**
     * (214)
     */
    acCmdArrangeIconsByName(214),
    
    /**
     * (215)
     */
    acCmdArrangeIconsByType(215),
    
    /**
     * (216)
     */
    acCmdArrangeIconsByCreated(216),
    
    /**
     * (217)
     */
    acCmdArrangeIconsByModified(217),
    
    /**
     * (218)
     */
    acCmdArrangeIconsAuto(218),
    
    /**
     * (219)
     */
    acCmdCreateShortcut(219),
    
    /**
     * (220)
     */
    acCmdToggleFilter(220),
    
    /**
     * (221)
     */
    acCmdOpenTable(221),
    
    /**
     * (222)
     */
    acCmdInsertPicture(222),
    
    /**
     * (223)
     */
    acCmdDeleteRecord(223),
    
    /**
     * (224)
     */
    acCmdStartupProperties(224),
    
    /**
     * (225)
     */
    acCmdPageNumber(225),
    
    /**
     * (226)
     */
    acCmdDateAndTime(226),
    
    /**
     * (227)
     */
    acCmdChangeToTextBox(227),
    
    /**
     * (228)
     */
    acCmdChangeToLabel(228),
    
    /**
     * (229)
     */
    acCmdChangeToListBox(229),
    
    /**
     * (230)
     */
    acCmdChangeToComboBox(230),
    
    /**
     * (231)
     */
    acCmdChangeToCheckBox(231),
    
    /**
     * (232)
     */
    acCmdChangeToToggleButton(232),
    
    /**
     * (233)
     */
    acCmdChangeToOptionButton(233),
    
    /**
     * (234)
     */
    acCmdChangeToImage(234),
    
    /**
     * (235)
     */
    acCmdAnswerWizard(235),
    
    /**
     * (236)
     */
    acCmdMicrosoftOnTheWeb(236),
    
    /**
     * (237)
     */
    acCmdClearItemDefaults(237),
    
    /**
     * (238)
     */
    acCmdZoom200(238),
    
    /**
     * (239)
     */
    acCmdZoom150(239),
    
    /**
     * (240)
     */
    acCmdZoom100(240),
    
    /**
     * (241)
     */
    acCmdZoom75(241),
    
    /**
     * (242)
     */
    acCmdZoom50(242),
    
    /**
     * (243)
     */
    acCmdZoom25(243),
    
    /**
     * (244)
     */
    acCmdZoom10(244),
    
    /**
     * (245)
     */
    acCmdFitToWindow(245),
    
    /**
     * (246)
     */
    acCmdPreviewOnePage(246),
    
    /**
     * (247)
     */
    acCmdPreviewTwoPages(247),
    
    /**
     * (248)
     */
    acCmdPreviewFourPages(248),
    
    /**
     * (249)
     */
    acCmdPreviewEightPages(249),
    
    /**
     * (250)
     */
    acCmdPreviewTwelvePages(250),
    
    /**
     * (251)
     */
    acCmdOpenURL(251),
    
    /**
     * (252)
     */
    acCmdOpenStartPage(252),
    
    /**
     * (253)
     */
    acCmdOpenSearchPage(253),
    
    /**
     * (254)
     */
    acCmdRegisterActiveXControls(254),
    
    /**
     * (255)
     */
    acCmdDeleteTab(255),
    
    /**
     * (256)
     */
    acCmdDatabaseProperties(256),
    
    /**
     * (257)
     */
    acCmdImport(257),
    
    /**
     * (258)
     */
    acCmdInsertActiveXControl(258),
    
    /**
     * (259)
     */
    acCmdInsertHyperlink(259),
    
    /**
     * (260)
     */
    acCmdReferences(260),
    
    /**
     * (261)
     */
    acCmdAutoCorrect(261),
    
    /**
     * (262)
     */
    acCmdInsertProcedure(262),
    
    /**
     * (263)
     */
    acCmdCreateReplica(263),
    
    /**
     * (264)
     */
    acCmdSynchronizeNow(264),
    
    /**
     * (265)
     */
    acCmdRecoverDesignMaster(265),
    
    /**
     * (266)
     */
    acCmdResolveConflicts(266),
    
    /**
     * (267)
     */
    acCmdDeleteWatch(267),
    
    /**
     * (269)
     */
    acCmdSpelling(269),
    
    /**
     * (270)
     */
    acCmdAutoFormat(270),
    
    /**
     * (271)
     */
    acCmdDeleteTableColumn(271),
    
    /**
     * (272)
     */
    acCmdInsertTableColumn(272),
    
    /**
     * (273)
     */
    acCmdInsertLookupColumn(273),
    
    /**
     * (274)
     */
    acCmdRenameColumn(274),
    
    /**
     * (275)
     */
    acCmdSetDatabasePassword(275),
    
    /**
     * (276)
     */
    acCmdUserLevelSecurityWizard(276),
    
    /**
     * (277)
     */
    acCmdFilterExcludingSelection(277),
    
    /**
     * (278)
     */
    acCmdQuickPrint(278),
    
    /**
     * (279)
     */
    acCmdConvertMacrosToVisualBasic(279),
    
    /**
     * (280)
     */
    acCmdSaveAllModules(280),
    
    /**
     * (281)
     */
    acCmdFormView(281),
    
    /**
     * (282)
     */
    acCmdDatasheetView(282),
    
    /**
     * (283)
     */
    acCmdAnalyzePerformance(283),
    
    /**
     * (284)
     */
    acCmdAnalyzeTable(284),
    
    /**
     * (285)
     */
    acCmdDocumenter(285),
    
    /**
     * (286)
     */
    acCmdTileHorizontally(286),
    
    /**
     * (287)
     */
    acCmdProperties(287),
    
    /**
     * (288)
     */
    acCmdTransparentBackground(288),
    
    /**
     * (289)
     */
    acCmdTransparentBorder(289),
    
    /**
     * (290)
     */
    acCmdCompileLoadedModules(290),
    
    /**
     * (291)
     */
    acCmdInsertLookupField(291),
    
    /**
     * (292)
     */
    acCmdUndo(292),
    
    /**
     * (293)
     */
    acCmdInsertChart(293),
    
    /**
     * (294)
     */
    acCmdGoBack(294),
    
    /**
     * (295)
     */
    acCmdGoForward(295),
    
    /**
     * (296)
     */
    acCmdStopLoadingPage(296),
    
    /**
     * (297)
     */
    acCmdRefreshPage(297),
    
    /**
     * (298)
     */
    acCmdFavoritesOpen(298),
    
    /**
     * (299)
     */
    acCmdFavoritesAddTo(299),
    
    /**
     * (300)
     */
    acCmdShowOnlyWebToolbar(300),
    
    /**
     * (301)
     */
    acCmdToolbarControlProperties(301),
    
    /**
     * (302)
     */
    acCmdShowMembers(302),
    
    /**
     * (303)
     */
    acCmdListConstants(303),
    
    /**
     * (304)
     */
    acCmdQuickInfo(304),
    
    /**
     * (305)
     */
    acCmdParameterInfo(305),
    
    /**
     * (306)
     */
    acCmdCompleteWord(306),
    
    /**
     * (307)
     */
    acCmdBookmarksToggle(307),
    
    /**
     * (308)
     */
    acCmdBookmarksNext(308),
    
    /**
     * (309)
     */
    acCmdBookmarksPrevious(309),
    
    /**
     * (310)
     */
    acCmdBookmarksClearAll(310),
    
    /**
     * (311)
     */
    acCmdStepOut(311),
    
    /**
     * (312)
     */
    acCmdFindPrevWordUnderCursor(312),
    
    /**
     * (313)
     */
    acCmdFindNextWordUnderCursor(313),
    
    /**
     * (314)
     */
    acCmdObjBrwFindWholeWordOnly(314),
    
    /**
     * (315)
     */
    acCmdObjBrwShowHiddenMembers(315),
    
    /**
     * (316)
     */
    acCmdObjBrwHelp(316),
    
    /**
     * (317)
     */
    acCmdObjBrwViewDefinition(317),
    
    /**
     * (318)
     */
    acCmdObjBrwGroupMembers(318),
    
    /**
     * (319)
     */
    acCmdSelectReport(319),
    
    /**
     * (321)
     */
    acCmdSaveAsHTML(321),
    
    /**
     * (322)
     */
    acCmdSaveAsIDC(322),
    
    /**
     * (323)
     */
    acCmdSaveAsASP(323),
    
    /**
     * (324)
     */
    acCmdPublishDefaults(324),
    
    /**
     * (325)
     */
    acCmdEditHyperlink(325),
    
    /**
     * (326)
     */
    acCmdOpenHyperlink(326),
    
    /**
     * (327)
     */
    acCmdOpenNewHyperlink(327),
    
    /**
     * (328)
     */
    acCmdCopyHyperlink(328),
    
    /**
     * (329)
     */
    acCmdHyperlinkDisplayText(329),
    
    /**
     * (330)
     */
    acCmdTabControlPageOrder(330),
    
    /**
     * (331)
     */
    acCmdInsertPage(331),
    
    /**
     * (332)
     */
    acCmdDeletePage(332),
    
    /**
     * (333)
     */
    acCmdSelectAll(333),
    
    /**
     * (334)
     */
    acCmdCreateMenuFromMacro(334),
    
    /**
     * (335)
     */
    acCmdCreateToolbarFromMacro(335),
    
    /**
     * (336)
     */
    acCmdCreateShortcutMenuFromMacro(336),
    
    /**
     * (337)
     */
    acCmdDelete(337),
    
    /**
     * (338)
     */
    acCmdRunOpenMacro(338),
    
    /**
     * (339)
     */
    acCmdLastPosition(339),
    
    /**
     * (340)
     */
    acCmdPrint(340),
    
    /**
     * (341)
     */
    acCmdFindNext(341),
    
    /**
     * (342)
     */
    acCmdStepInto(342),
    
    /**
     * (343)
     */
    acCmdClearHyperlink(343),
    
    /**
     * (344)
     */
    acCmdDataAccessPageBrowse(344),
    
    /**
     * (346)
     */
    acCmdNewObjectDataAccessPage(346),
    
    /**
     * (347)
     */
    acCmdSelectDataAccessPage(347),
    
    /**
     * (349)
     */
    acCmdViewDataAccessPages(349),
    
    /**
     * (350)
     */
    acCmdNewObjectView(350),
    
    /**
     * (351)
     */
    acCmdNewObjectStoredProcedure(351),
    
    /**
     * (352)
     */
    acCmdNewObjectDiagram(352),
    
    /**
     * (353)
     */
    acCmdViewFieldList(353),
    
    /**
     * (354)
     */
    acCmdViewDiagrams(354),
    
    /**
     * (355)
     */
    acCmdViewStoredProcedures(355),
    
    /**
     * (356)
     */
    acCmdViewViews(356),
    
    /**
     * (357)
     */
    acCmdViewShowPaneSQL(357),
    
    /**
     * (358)
     */
    acCmdViewShowPaneDiagram(358),
    
    /**
     * (359)
     */
    acCmdViewShowPaneGrid(359),
    
    /**
     * (360)
     */
    acCmdViewVerifySQL(360),
    
    /**
     * (361)
     */
    acCmdQueryGroupBy(361),
    
    /**
     * (362)
     */
    acCmdQueryAddToOutput(362),
    
    /**
     * (363)
     */
    acCmdViewTableColumnNames(363),
    
    /**
     * (364)
     */
    acCmdViewTableNameOnly(364),
    
    /**
     * (365)
     */
    acCmdHidePane(365),
    
    /**
     * (366)
     */
    acCmdRemove(366),
    
    /**
     * (368)
     */
    acCmdViewTableColumnProperties(368),
    
    /**
     * (369)
     */
    acCmdViewTableKeys(369),
    
    /**
     * (370)
     */
    acCmdViewTableUserView(370),
    
    /**
     * (371)
     */
    acCmdZoomSelection(371),
    
    /**
     * (372)
     */
    acCmdDiagramNewLabel(372),
    
    /**
     * (373)
     */
    acCmdDiagramAddRelatedTables(373),
    
    /**
     * (374)
     */
    acCmdDiagramShowRelationshipLabels(374),
    
    /**
     * (375)
     */
    acCmdDiagramModifyUserDefinedView(375),
    
    /**
     * (376)
     */
    acCmdDiagramViewPageBreaks(376),
    
    /**
     * (377)
     */
    acCmdDiagramRecalculatePageBreaks(377),
    
    /**
     * (378)
     */
    acCmdDiagramAutosizeSelectedTables(378),
    
    /**
     * (379)
     */
    acCmdDiagramLayoutSelection(379),
    
    /**
     * (380)
     */
    acCmdDiagramLayoutDiagram(380),
    
    /**
     * (381)
     */
    acCmdDiagramNewTable(381),
    
    /**
     * (382)
     */
    acCmdDiagramDeleteRelationship(382),
    
    /**
     * (383)
     */
    acCmdConnection(383),
    
    /**
     * (384)
     */
    acCmdEditTriggers(384),
    
    /**
     * (385)
     */
    acCmdDataAccessPageDesignView(385),
    
    /**
     * (386)
     */
    acCmdPromote(386),
    
    /**
     * (387)
     */
    acCmdGroupByTable(387),
    
    /**
     * (388)
     */
    acCmdDemote(388),
    
    /**
     * (389)
     */
    acCmdSaveAsDataAccessPage(389),
    
    /**
     * (390)
     */
    acCmdMicrosoftScriptEditor(390),
    
    /**
     * (391)
     */
    acCmdWorkgroupAdministrator(391),
    
    /**
     * (394)
     */
    acCmdNewObjectFunction(394),
    
    /**
     * (395)
     */
    acCmdViewFunctions(395),
    
    /**
     * (396)
     */
    acCmdPivotTableView(396),
    
    /**
     * (397)
     */
    acCmdPivotChartView(397),
    
    /**
     * (398)
     */
    acCmdPivotAutoFilter(398),
    
    /**
     * (399)
     */
    acCmdPivotTableSubtotal(399),
    
    /**
     * (400)
     */
    acCmdPivotCollapse(400),
    
    /**
     * (401)
     */
    acCmdPivotExpand(401),
    
    /**
     * (402)
     */
    acCmdPivotTableHideDetails(402),
    
    /**
     * (403)
     */
    acCmdPivotTableShowDetails(403),
    
    /**
     * (404)
     */
    acCmdPivotRefresh(404),
    
    /**
     * (405)
     */
    acCmdPivotTableExportToExcel(405),
    
    /**
     * (406)
     */
    acCmdPivotTableMoveToRowArea(406),
    
    /**
     * (407)
     */
    acCmdPivotTableMoveToColumnArea(407),
    
    /**
     * (408)
     */
    acCmdPivotTableMoveToFilterArea(408),
    
    /**
     * (409)
     */
    acCmdPivotTableMoveToDetailArea(409),
    
    /**
     * (410)
     */
    acCmdPivotTablePromote(410),
    
    /**
     * (411)
     */
    acCmdPivotTableDemote(411),
    
    /**
     * (412)
     */
    acCmdPivotAutoSum(412),
    
    /**
     * (413)
     */
    acCmdPivotAutoCount(413),
    
    /**
     * (414)
     */
    acCmdPivotAutoMin(414),
    
    /**
     * (415)
     */
    acCmdPivotAutoMax(415),
    
    /**
     * (416)
     */
    acCmdPivotAutoAverage(416),
    
    /**
     * (417)
     */
    acCmdPivotAutoStdDev(417),
    
    /**
     * (418)
     */
    acCmdPivotAutoVar(418),
    
    /**
     * (419)
     */
    acCmdPivotAutoStdDevP(419),
    
    /**
     * (420)
     */
    acCmdPivotAutoVarP(420),
    
    /**
     * (421)
     */
    acCmdPivotShowTop1(421),
    
    /**
     * (422)
     */
    acCmdPivotShowTop2(422),
    
    /**
     * (423)
     */
    acCmdPivotShowTop5(423),
    
    /**
     * (424)
     */
    acCmdPivotShowTop10(424),
    
    /**
     * (425)
     */
    acCmdPivotShowTop25(425),
    
    /**
     * (426)
     */
    acCmdPivotShowTop1Percent(426),
    
    /**
     * (427)
     */
    acCmdPivotShowTop2Percent(427),
    
    /**
     * (428)
     */
    acCmdPivotShowTop5Percent(428),
    
    /**
     * (429)
     */
    acCmdPivotShowTop10Percent(429),
    
    /**
     * (430)
     */
    acCmdPivotShowTop25Percent(430),
    
    /**
     * (431)
     */
    acCmdPivotShowTopOther(431),
    
    /**
     * (432)
     */
    acCmdPivotShowBottom1(432),
    
    /**
     * (433)
     */
    acCmdPivotShowBottom2(433),
    
    /**
     * (434)
     */
    acCmdPivotShowBottom5(434),
    
    /**
     * (435)
     */
    acCmdPivotShowBottom10(435),
    
    /**
     * (436)
     */
    acCmdPivotShowBottom25(436),
    
    /**
     * (437)
     */
    acCmdPivotShowBottom1Percent(437),
    
    /**
     * (438)
     */
    acCmdPivotShowBottom2Percent(438),
    
    /**
     * (439)
     */
    acCmdPivotShowBottom5Percent(439),
    
    /**
     * (440)
     */
    acCmdPivotShowBottom10Percent(440),
    
    /**
     * (441)
     */
    acCmdPivotShowBottom25Percent(441),
    
    /**
     * (442)
     */
    acCmdPivotShowBottomOther(442),
    
    /**
     * (443)
     */
    acCmdPivotTableCreateCalcTotal(443),
    
    /**
     * (444)
     */
    acCmdPivotTableCreateCalcField(444),
    
    /**
     * (445)
     */
    acCmdPivotTableShowAsNormal(445),
    
    /**
     * (446)
     */
    acCmdPivotTablePercentRowTotal(446),
    
    /**
     * (447)
     */
    acCmdPivotTablePercentColumnTotal(447),
    
    /**
     * (448)
     */
    acCmdPivotTablePercentParentRowItem(448),
    
    /**
     * (449)
     */
    acCmdPivotTablePercentParentColumnItem(449),
    
    /**
     * (450)
     */
    acCmdPivotTablePercentGrandTotal(450),
    
    /**
     * (451)
     */
    acCmdPivotTableExpandIndicators(451),
    
    /**
     * (452)
     */
    acCmdPivotDropAreas(452),
    
    /**
     * (453)
     */
    acCmdPivotChartType(453),
    
    /**
     * (454)
     */
    acCmdPivotDelete(454),
    
    /**
     * (455)
     */
    acCmdPivotChartShowLegend(455),
    
    /**
     * (456)
     */
    acCmdPivotChartByRowByColumn(456),
    
    /**
     * (457)
     */
    acCmdPivotChartDrillInto(457),
    
    /**
     * (458)
     */
    acCmdPivotChartMultiplePlots(458),
    
    /**
     * (459)
     */
    acCmdPivotChartMultiplePlotsUnifiedScale(459),
    
    /**
     * (460)
     */
    acCmdPivotChartUndo(460),
    
    /**
     * (461)
     */
    acCmdPivotShowAll(461),
    
    /**
     * (462)
     */
    acCmdSubformFormView(462),
    
    /**
     * (463)
     */
    acCmdSubformDatasheetView(463),
    
    /**
     * (464)
     */
    acCmdSubformPivotTableView(464),
    
    /**
     * (465)
     */
    acCmdSubformPivotChartView(465),
    
    /**
     * (466)
     */
    acCmdWebPagePreview(466),
    
    /**
     * (467)
     */
    acCmdPageProperties(467),
    
    /**
     * (468)
     */
    acCmdDataOutline(468),
    
    /**
     * (469)
     */
    acCmdInsertMovieFromFile(469),
    
    /**
     * (470)
     */
    acCmdInsertPivotTable(470),
    
    /**
     * (471)
     */
    acCmdInsertSpreadsheet(471),
    
    /**
     * (472)
     */
    acCmdInsertUnboundSection(472),
    
    /**
     * (473)
     */
    acCmdWebTheme(473),
    
    /**
     * (474)
     */
    acCmdBackgroundPicture(474),
    
    /**
     * (475)
     */
    acCmdBackgroundSound(475),
    
    /**
     * (476)
     */
    acCmdAlignMiddle(476),
    
    /**
     * (477)
     */
    acCmdAlignCenter(477),
    
    /**
     * (478)
     */
    acCmdAlignmentAndSizing(478),
    
    /**
     * (479)
     */
    acCmdDataAccessPageFieldListRefresh(479),
    
    /**
     * (480)
     */
    acCmdDataAccessPageAddToPage(480),
    
    /**
     * (481)
     */
    acCmdZoom500(481),
    
    /**
     * (482)
     */
    acCmdZoom1000(482),
    
    /**
     * (483)
     */
    acCmdPrintRelationships(483),
    
    /**
     * (484)
     */
    acCmdGroupControls(484),
    
    /**
     * (485)
     */
    acCmdUngroupControls(485),
    
    /**
     * (486)
     */
    acCmdWebPageProperties(486),
    
    /**
     * (487)
     */
    acCmdExport(487),
    
    /**
     * (488)
     */
    acCmdOfficeClipboard(488),
    
    /**
     * (489)
     */
    acCmdDeleteTable(489),
    
    /**
     * (490)
     */
    acCmdPasteAsHyperlink(490),
    
    /**
     * (491)
     */
    acCmdNewGroup(491),
    
    /**
     * (492)
     */
    acCmdRenameGroup(492),
    
    /**
     * (493)
     */
    acCmdDeleteGroup(493),
    
    /**
     * (494)
     */
    acCmdAddToNewGroup(494),
    
    /**
     * (495)
     */
    acCmdSubformInNewWindow(495),
    
    /**
     * (496)
     */
    acCmdServerProperties(496),
    
    /**
     * (497)
     */
    acCmdTableCustomView(497),
    
    /**
     * (498)
     */
    acCmdTableAddTable(498),
    
    /**
     * (499)
     */
    acCmdInsertSubdatasheet(499),
    
    /**
     * (500)
     */
    acCmdConditionalFormatting(500),
    
    /**
     * (501)
     */
    acCmdChangeToCommandButton(501),
    
    /**
     * (504)
     */
    acCmdSubdatasheetExpandAll(504),
    
    /**
     * (505)
     */
    acCmdSubdatasheetCollapseAll(505),
    
    /**
     * (506)
     */
    acCmdSubdatasheetRemove(506),
    
    /**
     * (507)
     */
    acCmdServerFilterByForm(507),
    
    /**
     * (508)
     */
    acCmdMaximiumRecords(508),
    
    /**
     * (511)
     */
    acCmdSpeech(511),
    
    /**
     * (513)
     */
    acCmdBackup(513),
    
    /**
     * (514)
     */
    acCmdRestore(514),
    
    /**
     * (515)
     */
    acCmdTransferSQLDatabase(515),
    
    /**
     * (516)
     */
    acCmdCopyDatabaseFile(516),
    
    /**
     * (517)
     */
    acCmdDropSQLDatabase(517),
    
    /**
     * (519)
     */
    acCmdLinkedTableManager(519),
    
    /**
     * (520)
     */
    acCmdDatabaseSplitter(520),
    
    /**
     * (521)
     */
    acCmdSwitchboardManager(521),
    
    /**
     * (522)
     */
    acCmdUpsizingWizard(522),
    
    /**
     * (524)
     */
    acCmdPartialReplicaWizard(524),
    
    /**
     * (525)
     */
    acCmdVisualBasicEditor(525),
    
    /**
     * (526)
     */
    acCmdAddInManager(526),
    
    /**
     * (527)
     */
    acCmdPivotTableClearCustomOrdering(527),
    
    /**
     * (528)
     */
    acCmdPivotTableFilterBySelection(528),
    
    /**
     * (529)
     */
    acCmdPivotTableRemove(529),
    
    /**
     * (530)
     */
    acCmdPivotTableGroupItems(530),
    
    /**
     * (531)
     */
    acCmdPivotTableUngroupItems(531),
    
    /**
     * (532)
     */
    acCmdPivotChartDrillOut(532),
    
    /**
     * (533)
     */
    acCmdShowEnvelope(533),
    
    /**
     * (534)
     */
    acCmdPivotChartSortAscByTotal(534),
    
    /**
     * (535)
     */
    acCmdPivotChartSortDescByTotal(535),
    
    /**
     * (536)
     */
    acCmdViewObjectDependencies(536),
    
    /**
     * (537)
     */
    acCmdPublishDatabase(537),
    
    /**
     * (538)
     */
    acCmdCloseDatabase(538),
    
    /**
     * (539)
     */
    acCmdReportView(539),
    
    /**
     * (540)
     */
    acCmdToggleOffline(540),
    
    /**
     * (541)
     */
    acCmdRefreshData(541),
    
    /**
     * (542)
     */
    acCmdShareOnSharePoint(542),
    
    /**
     * (543)
     */
    acCmdSavedImports(543),
    
    /**
     * (544)
     */
    acCmdImportAttachAccess(544),
    
    /**
     * (545)
     */
    acCmdImportAttachExcel(545),
    
    /**
     * (546)
     */
    acCmdImportAttachText(546),
    
    /**
     * (547)
     */
    acCmdImportAttachSharePointList(547),
    
    /**
     * (548)
     */
    acCmdImportAttachXML(548),
    
    /**
     * (549)
     */
    acCmdImportAttachODBC(549),
    
    /**
     * (550)
     */
    acCmdImportAttachHTML(550),
    
    /**
     * (551)
     */
    acCmdImportAttachOutlook(551),
    
    /**
     * (552)
     */
    acCmdImportAttachdBase(552),
    
    /**
     * (553)
     */
    acCmdImportAttachParadox(553),
    
    /**
     * (554)
     */
    acCmdImportAttachLotus(554),
    
    /**
     * (555)
     */
    acCmdSavedExports(555),
    
    /**
     * (556)
     */
    acCmdExportExcel(556),
    
    /**
     * (557)
     */
    acCmdExportSharePointList(557),
    
    /**
     * (558)
     */
    acCmdExportRTF(558),
    
    /**
     * (559)
     */
    acCmdExportAccess(559),
    
    /**
     * (560)
     */
    acCmdExportText(560),
    
    /**
     * (561)
     */
    acCmdExportXML(561),
    
    /**
     * (562)
     */
    acCmdExportODBC(562),
    
    /**
     * (563)
     */
    acCmdExportSnapShot(563),
    
    /**
     * (564)
     */
    acCmdExportHTML(564),
    
    /**
     * (565)
     */
    acCmdExportdBase(565),
    
    /**
     * (566)
     */
    acCmdExportParadox(566),
    
    /**
     * (567)
     */
    acCmdExportLotus(567),
    
    /**
     * (568)
     */
    acCmdStackedLayout(568),
    
    /**
     * (569)
     */
    acCmdTabularLayout(569),
    
    /**
     * (570)
     */
    acCmdSelectEntireRow(570),
    
    /**
     * (571)
     */
    acCmdSelectEntireColumn(571),
    
    /**
     * (572)
     */
    acCmdMoveColumnCellUp(572),
    
    /**
     * (573)
     */
    acCmdMoveColumnCellDown(573),
    
    /**
     * (574)
     */
    acCmdLayoutGridlinesBoth(574),
    
    /**
     * (575)
     */
    acCmdLayoutGridlinesVertical(575),
    
    /**
     * (576)
     */
    acCmdLayoutGridlinesHorizontal(576),
    
    /**
     * (577)
     */
    acCmdLayoutGridlinesNone(577),
    
    /**
     * (578)
     */
    acCmdLayoutGridlinesCrossHatch(578),
    
    /**
     * (579)
     */
    acCmdLayoutGridlinesTop(579),
    
    /**
     * (580)
     */
    acCmdLayoutGridlinesBottom(580),
    
    /**
     * (581)
     */
    acCmdLayoutGridlinesOutline(581),
    
    /**
     * (582)
     */
    acCmdRemoveFromLayout(582),
    
    /**
     * (583)
     */
    acCmdAddFromOutlook(583),
    
    /**
     * (584)
     */
    acCmdSaveAsOutlookContact(584),
    
    /**
     * (585)
     */
    acCmdInsertLogo(585),
    
    /**
     * (586)
     */
    acCmdInsertTitle(586),
    
    /**
     * (587)
     */
    acCmdPasteFormatting(587),
    
    /**
     * (588)
     */
    acCmdMacroArguments(588),
    
    /**
     * (589)
     */
    acCmdMacroAllActions(589),
    
    /**
     * (590)
     */
    acCmdPrintSelection(590),
    
    /**
     * (591)
     */
    acCmdPublishFixedFormat(591),
    
    /**
     * (592)
     */
    acCmdExportFixedFormat(592),
    
    /**
     * (593)
     */
    acCmdLayoutView(593),
    
    /**
     * (594)
     */
    acCmdNewObjectContinuousForm(594),
    
    /**
     * (595)
     */
    acCmdNewObjectSplitForm(595),
    
    /**
     * (596)
     */
    acCmdNewObjectPivotChart(596),
    
    /**
     * (597)
     */
    acCmdNewObjectPivotTable(597),
    
    /**
     * (598)
     */
    acCmdNewObjectDatasheetForm(598),
    
    /**
     * (599)
     */
    acCmdNewObjectModalForm(599),
    
    /**
     * (600)
     */
    acCmdNewObjectBlankForm(600),
    
    /**
     * (601)
     */
    acCmdNewObjectLabelsReport(601),
    
    /**
     * (602)
     */
    acCmdNewObjectBlankReport(602),
    
    /**
     * (603)
     */
    acCmdNewObjectDesignQuery(603),
    
    /**
     * (604)
     */
    acCmdNewObjectDesignForm(604),
    
    /**
     * (605)
     */
    acCmdNewObjectDesignReport(605),
    
    /**
     * (606)
     */
    acCmdNewObjectDesignTable(606),
    
    /**
     * (607)
     */
    acCmdEditListItems(607),
    
    /**
     * (608)
     */
    acCmdCollectDataViaEmail(608),
    
    /**
     * (609)
     */
    acCmdManageReplies(609),
    
    /**
     * (610)
     */
    acCmdAnchorTopLeft(610),
    
    /**
     * (611)
     */
    acCmdAnchorStretchAcross(611),
    
    /**
     * (612)
     */
    acCmdAnchorTopRight(612),
    
    /**
     * (613)
     */
    acCmdAnchorStretchDown(613),
    
    /**
     * (614)
     */
    acCmdAnchorStretchDownAcross(614),
    
    /**
     * (615)
     */
    acCmdAnchorStretchDownRight(615),
    
    /**
     * (616)
     */
    acCmdAnchorBottomLeft(616),
    
    /**
     * (617)
     */
    acCmdAnchorBottomStretchAcross(617),
    
    /**
     * (618)
     */
    acCmdAnchorBottomRight(618),
    
    /**
     * (619)
     */
    acCmdFilterMenu(619),
    
    /**
     * (620)
     */
    acCmdShowColumnHistory(620),
    
    /**
     * (621)
     */
    acCmdBrowseSharePointList(621),
    
    /**
     * (622)
     */
    acCmdModifySharePointList(622),
    
    /**
     * (623)
     */
    acCmdModifySharePointListAlerts(623),
    
    /**
     * (624)
     */
    acCmdModifySharePointListWorkflow(624),
    
    /**
     * (625)
     */
    acCmdModifySharePointListPermissions(625),
    
    /**
     * (626)
     */
    acCmdRefreshSharePointList(626),
    
    /**
     * (627)
     */
    acCmdDeleteSharePointList(627),
    
    /**
     * (628)
     */
    acCmdControlMarginsNone(628),
    
    /**
     * (629)
     */
    acCmdControlMarginsNarrow(629),
    
    /**
     * (630)
     */
    acCmdControlMarginsMedium(630),
    
    /**
     * (631)
     */
    acCmdControlMarginsWide(631),
    
    /**
     * (632)
     */
    acCmdControlPaddingNone(632),
    
    /**
     * (633)
     */
    acCmdControlPaddingNarrow(633),
    
    /**
     * (634)
     */
    acCmdControlPaddingMedium(634),
    
    /**
     * (635)
     */
    acCmdControlPaddingWide(635),
    
    /**
     * (636)
     */
    acCmdShowDatePicker(636),
    
    /**
     * (637)
     */
    acCmdSetCaption(637),
    
    /**
     * (638)
     */
    acCmdSynchronize(638),
    
    /**
     * (639)
     */
    acCmdDiscardChanges(639),
    
    /**
     * (640)
     */
    acCmdDiscardChangesAndRefresh(640),
    
    /**
     * (641)
     */
    acCmdSharePointSiteRecycleBin(641),
    
    /**
     * (642)
     */
    acCmdToggleCacheListData(642),
    
    /**
     * (643)
     */
    acCmdRemoveFilterFromCurrentColumn(643),
    
    /**
     * (644)
     */
    acCmdRemoveAllFilters(644),
    
    /**
     * (645)
     */
    acCmdRemoveAllSorts(645),
    
    /**
     * (646)
     */
    acCmdCloseAll(646),
    
    /**
     * (647)
     */
    acCmdFieldTemplates(647),
    
    /**
     * (648)
     */
    acCmdApplyAutoFormat1(648),
    
    /**
     * (649)
     */
    acCmdApplyAutoFormat2(649),
    
    /**
     * (650)
     */
    acCmdApplyAutoFormat3(650),
    
    /**
     * (651)
     */
    acCmdApplyAutoFormat4(651),
    
    /**
     * (652)
     */
    acCmdApplyAutoFormat5(652),
    
    /**
     * (653)
     */
    acCmdApplyAutoFormat6(653),
    
    /**
     * (654)
     */
    acCmdApplyAutoFormat7(654),
    
    /**
     * (655)
     */
    acCmdApplyAutoFormat8(655),
    
    /**
     * (656)
     */
    acCmdApplyAutoFormat9(656),
    
    /**
     * (657)
     */
    acCmdApplyAutoFormat10(657),
    
    /**
     * (658)
     */
    acCmdApplyAutoFormat11(658),
    
    /**
     * (659)
     */
    acCmdApplyAutoFormat12(659),
    
    /**
     * (660)
     */
    acCmdApplyAutoFormat13(660),
    
    /**
     * (661)
     */
    acCmdApplyAutoFormat14(661),
    
    /**
     * (662)
     */
    acCmdApplyAutoFormat15(662),
    
    /**
     * (663)
     */
    acCmdApplyAutoFormat16(663),
    
    /**
     * (664)
     */
    acCmdApplyAutoFormat17(664),
    
    /**
     * (665)
     */
    acCmdApplyAutoFormat18(665),
    
    /**
     * (666)
     */
    acCmdApplyAutoFormat19(666),
    
    /**
     * (667)
     */
    acCmdApplyAutoFormat20(667),
    
    /**
     * (668)
     */
    acCmdApplyAutoFormat21(668),
    
    /**
     * (669)
     */
    acCmdApplyAutoFormat22(669),
    
    /**
     * (670)
     */
    acCmdApplyAutoFormat23(670),
    
    /**
     * (671)
     */
    acCmdApplyAutoFormat24(671),
    
    /**
     * (672)
     */
    acCmdApplyAutoFormat25(672),
    
    /**
     * (673)
     */
    acCmdManageAttachments(673),
    
    /**
     * (674)
     */
    acCmdWorkflowTasks(674),
    
    /**
     * (675)
     */
    acCmdStartNewWorkflow(675),
    
    /**
     * (676)
     */
    acCmdShowMessageBar(676),
    
    /**
     * (677)
     */
    acCmdHideMessageBar(677),
    
    /**
     * (678)
     */
    acCmdLayoutInsertRowAbove(678),
    
    /**
     * (679)
     */
    acCmdLayoutInsertRowBelow(679),
    
    /**
     * (680)
     */
    acCmdLayoutInsertColumnLeft(680),
    
    /**
     * (681)
     */
    acCmdLayoutInsertColumnRight(681),
    
    /**
     * (682)
     */
    acCmdLayoutMergeCells(682),
    
    /**
     * (683)
     */
    acCmdLayoutSplitColumnCell(683),
    
    /**
     * (684)
     */
    acCmdLayoutSplitRowCell(684),
    
    /**
     * (685)
     */
    acCmdShowLogicCatalog(685),
    
    /**
     * (686)
     */
    acCmdSaveAsTemplate(686),
    
    /**
     * (687)
     */
    acCmdSaveDatabaseAsNewTemplatePart(687),
    
    /**
     * (688)
     */
    acCmdSaveSelectionAsNewDataType(688),
    
    /**
     * (689)
     */
    acCmdNewObjectNavigationTop(689),
    
    /**
     * (690)
     */
    acCmdNewObjectNavigationLeft(690),
    
    /**
     * (691)
     */
    acCmdNewObjectNavigationRight(691),
    
    /**
     * (692)
     */
    acCmdNewObjectNavigationTopTop(692),
    
    /**
     * (693)
     */
    acCmdNewObjectNavigationTopLeft(693),
    
    /**
     * (694)
     */
    acCmdNewObjectNavigationTopRight(694),
    
    /**
     * (695)
     */
    acCmdCompatCheckDatabase(695),
    
    /**
     * (696)
     */
    acCmdCompatCheckCurrentObject(696),
    
    /**
     * (697)
     */
    acCmdDesignObject(697),
    
    /**
     * (698)
     */
    acCmdCalculatedColumn(698),
    
    /**
     * (699)
     */
    acCmdSyncWebApplication(699),
    
    /**
     * (700)
     */
    acCmdConvertLinkedTableToLocal(700),
    
    /**
     * (701)
     */
    acCmdNewObjectContinuousFormWeb(701),
    
    /**
     * (702)
     */
    acCmdNewObjectDatasheetFormWeb(702),
    
    /**
     * (703)
     */
    acCmdNewObjectBlankFormWeb(703),
    
    /**
     * (704)
     */
    acCmdNewObjectBlankReportWeb(704),
    
    /**
     * (705)
     */
    acCmdNewObjectAutoFormWeb(705),
    
    /**
     * (706)
     */
    acCmdNewObjectAutoReportWeb(706),
    
    /**
     * (707)
     */
    acCmdNewObjectQueryWeb(707),
    
    /**
     * (708)
     */
    acCmdNewObjectMacroWeb(708),
    
    /**
     * (709)
     */
    acCmdNewObjectNavigationTopWeb(709),
    
    /**
     * (710)
     */
    acCmdNewObjectNavigationLeftWeb(710),
    
    /**
     * (711)
     */
    acCmdNewObjectNavigationRightWeb(711),
    
    /**
     * (712)
     */
    acCmdNewObjectNavigationTopTopWeb(712),
    
    /**
     * (713)
     */
    acCmdNewObjectNavigationTopLeftWeb(713),
    
    /**
     * (714)
     */
    acCmdNewObjectNavigationTopRightWeb(714),
    
    /**
     * (715)
     */
    acCmdSelectEntireLayout(715),
    
    /**
     * (716)
     */
    acCmdPrepareDatabaseForWeb(716),
    
    /**
     * (717)
     */
    acCmdManageTableEvents(717),
    
    /**
     * (718)
     */
    acCmdAddDataMacroAfterInsert(718),
    
    /**
     * (719)
     */
    acCmdAddDataMacroAfterUpdate(719),
    
    /**
     * (720)
     */
    acCmdAddDataMacroAfterDelete(720),
    
    /**
     * (721)
     */
    acCmdAddDataMacroBeforeDelete(721),
    
    /**
     * (722)
     */
    acCmdAddDataMacroBeforeChange(722),
    
    /**
     * (723)
     */
    acCmdAddNamedDataMacro(723),
    
    /**
     * (724)
     */
    acCmdInsertNavigationButton(724),
    ;

    private AcCommand(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}