package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.DetalheOportunidadePersist;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Objeto Oportunidade
 **/

@ApiModel(description = "Objeto Oportunidade")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OportunidadePersist   {
  
  private Long idTipoOportunidade = null;
  private Long idStatusOportunidade = null;
  private String numeroReceitaFederal = null;
  private String dataInicioVigencia = null;
  private String dataFimVigencia = null;
  private Boolean flagAtivo = null;
  private List<DetalheOportunidadePersist> detalhes = new ArrayList<DetalheOportunidadePersist>();

  
  /**
   * C\u00F3digo identificador do tipo oportunidade
   **/
  public OportunidadePersist idTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador do tipo oportunidade")
  @JsonProperty("idTipoOportunidade")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * C\u00F3digo identificador do status oportunidade
   **/
  public OportunidadePersist idStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador do status oportunidade")
  @JsonProperty("idStatusOportunidade")
  public Long getIdStatusOportunidade() {
    return idStatusOportunidade;
  }
  public void setIdStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
  }

  
  /**
   * N\u00FAmero Receita Federal
   **/
  public OportunidadePersist numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero Receita Federal")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Date de in\u00EDcio da vig\u00EAncia da oportunidade
   **/
  public OportunidadePersist dataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", required = true, value = "Date de in\u00EDcio da vig\u00EAncia da oportunidade")
  @JsonProperty("dataInicioVigencia")
  public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }
  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  
  /**
   * Data do fim da vig\u00EAncia da oportunidade
   **/
  public OportunidadePersist dataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", required = true, value = "Data do fim da vig\u00EAncia da oportunidade")
  @JsonProperty("dataFimVigencia")
  public String getDataFimVigencia() {
    return dataFimVigencia;
  }
  public void setDataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  
  /**
   * Atributo que indica se a oportunidade est\u00E1 ativa
   **/
  public OportunidadePersist flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "true", required = true, value = "Atributo que indica se a oportunidade est\u00E1 ativa")
  @JsonProperty("flagAtivo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Lista de detalhes
   **/
  public OportunidadePersist detalhes(List<DetalheOportunidadePersist> detalhes) {
    this.detalhes = detalhes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Lista de detalhes")
  @JsonProperty("detalhes")
  public List<DetalheOportunidadePersist> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<DetalheOportunidadePersist> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OportunidadePersist oportunidadePersist = (OportunidadePersist) o;
    return Objects.equals(this.idTipoOportunidade, oportunidadePersist.idTipoOportunidade) &&
        Objects.equals(this.idStatusOportunidade, oportunidadePersist.idStatusOportunidade) &&
        Objects.equals(this.numeroReceitaFederal, oportunidadePersist.numeroReceitaFederal) &&
        Objects.equals(this.dataInicioVigencia, oportunidadePersist.dataInicioVigencia) &&
        Objects.equals(this.dataFimVigencia, oportunidadePersist.dataFimVigencia) &&
        Objects.equals(this.flagAtivo, oportunidadePersist.flagAtivo) &&
        Objects.equals(this.detalhes, oportunidadePersist.detalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoOportunidade, idStatusOportunidade, numeroReceitaFederal, dataInicioVigencia, dataFimVigencia, flagAtivo, detalhes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OportunidadePersist {\n");
    
    sb.append("    idTipoOportunidade: ").append(toIndentedString(idTipoOportunidade)).append("\n");
    sb.append("    idStatusOportunidade: ").append(toIndentedString(idStatusOportunidade)).append("\n");
    sb.append("    numeroReceitaFederal: ").append(toIndentedString(numeroReceitaFederal)).append("\n");
    sb.append("    dataInicioVigencia: ").append(toIndentedString(dataInicioVigencia)).append("\n");
    sb.append("    dataFimVigencia: ").append(toIndentedString(dataFimVigencia)).append("\n");
    sb.append("    flagAtivo: ").append(toIndentedString(flagAtivo)).append("\n");
    sb.append("    detalhes: ").append(toIndentedString(detalhes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

