/*
 * generated by Xtext 2.20.0
 */
package de.senacor.com.smt.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.senacor.com.smt.dsl.ide.contentassist.antlr.internal.InternalSimpleDSLParser;
import de.senacor.com.smt.dsl.services.SimpleDSLGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class SimpleDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SimpleDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SimpleDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
			builder.put(grammarAccess.getDocumentAccess().getGroup(), "rule__Document__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_0(), "rule__QualifiedName__Group_0__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_4(), "rule__Entity__Group_4__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_4_3(), "rule__Entity__Group_4_3__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_5(), "rule__Entity__Group_5__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_5_3(), "rule__Entity__Group_5_3__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_6(), "rule__Entity__Group_6__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_6_3(), "rule__Entity__Group_6_3__0");
			builder.put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_4(), "rule__Field__Group_4__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_5(), "rule__Field__Group_5__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_6(), "rule__Field__Group_6__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_7(), "rule__Field__Group_7__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_8(), "rule__Field__Group_8__0");
			builder.put(grammarAccess.getRelationshipAccess().getGroup(), "rule__Relationship__Group__0");
			builder.put(grammarAccess.getIncludesAccess().getGroup(), "rule__Includes__Group__0");
			builder.put(grammarAccess.getIncludesAccess().getGroup_4(), "rule__Includes__Group_4__0");
			builder.put(grammarAccess.getIncludesAccess().getGroup_4_3(), "rule__Includes__Group_4_3__0");
			builder.put(grammarAccess.getDocumentAccess().getNameAssignment_2(), "rule__Document__NameAssignment_2");
			builder.put(grammarAccess.getDocumentAccess().getEntitesAssignment_3(), "rule__Document__EntitesAssignment_3");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_2(), "rule__Entity__NameAssignment_2");
			builder.put(grammarAccess.getEntityAccess().getFieldsAssignment_4_2(), "rule__Entity__FieldsAssignment_4_2");
			builder.put(grammarAccess.getEntityAccess().getFieldsAssignment_4_3_1(), "rule__Entity__FieldsAssignment_4_3_1");
			builder.put(grammarAccess.getEntityAccess().getRelationshipsAssignment_5_2(), "rule__Entity__RelationshipsAssignment_5_2");
			builder.put(grammarAccess.getEntityAccess().getRelationshipsAssignment_5_3_1(), "rule__Entity__RelationshipsAssignment_5_3_1");
			builder.put(grammarAccess.getEntityAccess().getIncludesAssignment_6_2(), "rule__Entity__IncludesAssignment_6_2");
			builder.put(grammarAccess.getEntityAccess().getIncludesAssignment_6_3_1(), "rule__Entity__IncludesAssignment_6_3_1");
			builder.put(grammarAccess.getFieldAccess().getNameAssignment_2(), "rule__Field__NameAssignment_2");
			builder.put(grammarAccess.getFieldAccess().getTypeAssignment_4_1(), "rule__Field__TypeAssignment_4_1");
			builder.put(grammarAccess.getFieldAccess().getLengthAssignment_5_1(), "rule__Field__LengthAssignment_5_1");
			builder.put(grammarAccess.getFieldAccess().getPreciscionAssignment_6_1(), "rule__Field__PreciscionAssignment_6_1");
			builder.put(grammarAccess.getFieldAccess().getScaleAssignment_7_1(), "rule__Field__ScaleAssignment_7_1");
			builder.put(grammarAccess.getFieldAccess().getKeyAssignment_8_1(), "rule__Field__KeyAssignment_8_1");
			builder.put(grammarAccess.getRelationshipAccess().getNameAssignment_2(), "rule__Relationship__NameAssignment_2");
			builder.put(grammarAccess.getRelationshipAccess().getToEntityAssignment_5(), "rule__Relationship__ToEntityAssignment_5");
			builder.put(grammarAccess.getIncludesAccess().getNameAssignment_2(), "rule__Includes__NameAssignment_2");
			builder.put(grammarAccess.getIncludesAccess().getFieldAssignment_4_2(), "rule__Includes__FieldAssignment_4_2");
			builder.put(grammarAccess.getIncludesAccess().getFieldAssignment_4_3_1(), "rule__Includes__FieldAssignment_4_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SimpleDSLGrammarAccess grammarAccess;

	@Override
	protected InternalSimpleDSLParser createParser() {
		InternalSimpleDSLParser result = new InternalSimpleDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SimpleDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SimpleDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
