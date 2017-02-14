package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





/**
 * Portador
 **/

@ApiModel(description = "Portador")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class Portador   {
  
  private Long idConta = null;
  private Long idProduto = null;
  private Long idPessoa = null;
  private Long idParentesco = null;
  private String tipoPortador = null;
  private String nomeImpresso = null;
  private Long idTipoCartao = null;
  private Integer flagAtivo = null;
  private Date dataCadastroPortador = null;
  private Date dataCancelamentoPortador = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id).
   **/
  public Portador idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id).")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).
   **/
  public Portador idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id).
   **/
  public Portador idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id).")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Parentesco (id)
   **/
  public Portador idParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Parentesco (id)")
  @JsonProperty("idParentesco")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * Apresenta o tipo do Portador do cart\u00C3\u00A3o, sendo: ('T': Titular, 'A': Adicional).
   **/
  public Portador tipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o tipo do Portador do cart\u00C3\u00A3o, sendo: ('T': Titular, 'A': Adicional).")
  @JsonProperty("tipoPortador")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * Apresenta o nome a ser impresso no cart\u00C3\u00A3o.
   **/
  public Portador nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome a ser impresso no cart\u00C3\u00A3o.")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Apresenta o c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo do cart\u00C3\u00A3o (id), que ser\u00C3\u00A1 utilizado para gerar os cart\u00C3\u00B5es deste portador, vinculados a sua respectiva conta atrav\u00C3\u00A9s do campo idConta.
   **/
  public Portador idTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo do cart\u00C3\u00A3o (id), que ser\u00C3\u00A1 utilizado para gerar os cart\u00C3\u00B5es deste portador, vinculados a sua respectiva conta atrav\u00C3\u00A9s do campo idConta.")
  @JsonProperty("idTipoCartao")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * Quanto ativa, indica que o cadastro do Portador est\u00C3\u00A1 ativo, em emissores que realizam este tipo de gest\u00C3\u00A3o.
   **/
  public Portador flagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quanto ativa, indica que o cadastro do Portador est\u00C3\u00A1 ativo, em emissores que realizam este tipo de gest\u00C3\u00A3o.")
  @JsonProperty("flagAtivo")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Apresenta a data em que o Portador fora cadastrado, quando possuir esta informa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public Portador dataCadastroPortador(Date dataCadastroPortador) {
    this.dataCadastroPortador = dataCadastroPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data em que o Portador fora cadastrado, quando possuir esta informa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("dataCadastroPortador")
  public Date getDataCadastroPortador() {
    return dataCadastroPortador;
  }
  public void setDataCadastroPortador(Date dataCadastroPortador) {
    this.dataCadastroPortador = dataCadastroPortador;
  }

  
  /**
   * Apresenta a data em que o Portador fora cancelado, quando possuir esta informa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public Portador dataCancelamentoPortador(Date dataCancelamentoPortador) {
    this.dataCancelamentoPortador = dataCancelamentoPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data em que o Portador fora cancelado, quando possuir esta informa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("dataCancelamentoPortador")
  public Date getDataCancelamentoPortador() {
    return dataCancelamentoPortador;
  }
  public void setDataCancelamentoPortador(Date dataCancelamentoPortador) {
    this.dataCancelamentoPortador = dataCancelamentoPortador;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Portador portador = (Portador) o;
    return Objects.equals(this.idConta, portador.idConta) &&
        Objects.equals(this.idProduto, portador.idProduto) &&
        Objects.equals(this.idPessoa, portador.idPessoa) &&
        Objects.equals(this.idParentesco, portador.idParentesco) &&
        Objects.equals(this.tipoPortador, portador.tipoPortador) &&
        Objects.equals(this.nomeImpresso, portador.nomeImpresso) &&
        Objects.equals(this.idTipoCartao, portador.idTipoCartao) &&
        Objects.equals(this.flagAtivo, portador.flagAtivo) &&
        Objects.equals(this.dataCadastroPortador, portador.dataCadastroPortador) &&
        Objects.equals(this.dataCancelamentoPortador, portador.dataCancelamentoPortador);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idProduto, idPessoa, idParentesco, tipoPortador, nomeImpresso, idTipoCartao, flagAtivo, dataCadastroPortador, dataCancelamentoPortador);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Portador {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idParentesco: ").append(toIndentedString(idParentesco)).append("\n");
    sb.append("    tipoPortador: ").append(toIndentedString(tipoPortador)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    idTipoCartao: ").append(toIndentedString(idTipoCartao)).append("\n");
    sb.append("    flagAtivo: ").append(toIndentedString(flagAtivo)).append("\n");
    sb.append("    dataCadastroPortador: ").append(toIndentedString(dataCadastroPortador)).append("\n");
    sb.append("    dataCancelamentoPortador: ").append(toIndentedString(dataCancelamentoPortador)).append("\n");
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



