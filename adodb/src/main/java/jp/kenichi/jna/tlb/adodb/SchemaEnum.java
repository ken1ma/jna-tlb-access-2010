
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000533-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum SchemaEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adSchemaProviderSpecific(-1),
    
    /**
     * (0)
     */
    adSchemaAsserts(0),
    
    /**
     * (1)
     */
    adSchemaCatalogs(1),
    
    /**
     * (2)
     */
    adSchemaCharacterSets(2),
    
    /**
     * (3)
     */
    adSchemaCollations(3),
    
    /**
     * (4)
     */
    adSchemaColumns(4),
    
    /**
     * (5)
     */
    adSchemaCheckConstraints(5),
    
    /**
     * (6)
     */
    adSchemaConstraintColumnUsage(6),
    
    /**
     * (7)
     */
    adSchemaConstraintTableUsage(7),
    
    /**
     * (8)
     */
    adSchemaKeyColumnUsage(8),
    
    /**
     * (9)
     */
    adSchemaReferentialContraints(9),
    
    /**
     * (9)
     */
    adSchemaReferentialConstraints(9),
    
    /**
     * (10)
     */
    adSchemaTableConstraints(10),
    
    /**
     * (11)
     */
    adSchemaColumnsDomainUsage(11),
    
    /**
     * (12)
     */
    adSchemaIndexes(12),
    
    /**
     * (13)
     */
    adSchemaColumnPrivileges(13),
    
    /**
     * (14)
     */
    adSchemaTablePrivileges(14),
    
    /**
     * (15)
     */
    adSchemaUsagePrivileges(15),
    
    /**
     * (16)
     */
    adSchemaProcedures(16),
    
    /**
     * (17)
     */
    adSchemaSchemata(17),
    
    /**
     * (18)
     */
    adSchemaSQLLanguages(18),
    
    /**
     * (19)
     */
    adSchemaStatistics(19),
    
    /**
     * (20)
     */
    adSchemaTables(20),
    
    /**
     * (21)
     */
    adSchemaTranslations(21),
    
    /**
     * (22)
     */
    adSchemaProviderTypes(22),
    
    /**
     * (23)
     */
    adSchemaViews(23),
    
    /**
     * (24)
     */
    adSchemaViewColumnUsage(24),
    
    /**
     * (25)
     */
    adSchemaViewTableUsage(25),
    
    /**
     * (26)
     */
    adSchemaProcedureParameters(26),
    
    /**
     * (27)
     */
    adSchemaForeignKeys(27),
    
    /**
     * (28)
     */
    adSchemaPrimaryKeys(28),
    
    /**
     * (29)
     */
    adSchemaProcedureColumns(29),
    
    /**
     * (30)
     */
    adSchemaDBInfoKeywords(30),
    
    /**
     * (31)
     */
    adSchemaDBInfoLiterals(31),
    
    /**
     * (32)
     */
    adSchemaCubes(32),
    
    /**
     * (33)
     */
    adSchemaDimensions(33),
    
    /**
     * (34)
     */
    adSchemaHierarchies(34),
    
    /**
     * (35)
     */
    adSchemaLevels(35),
    
    /**
     * (36)
     */
    adSchemaMeasures(36),
    
    /**
     * (37)
     */
    adSchemaProperties(37),
    
    /**
     * (38)
     */
    adSchemaMembers(38),
    
    /**
     * (39)
     */
    adSchemaTrustees(39),
    ;

    private SchemaEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}