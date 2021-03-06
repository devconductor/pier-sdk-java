package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto HistoricoPagamentoResponse
 **/

@ApiModel(description = "Objeto HistoricoPagamentoResponse")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class HistoricoPagamentoResponse   {
  
  private Long idConta = null;
  private Long idPagamento = null;
  private Long idEstabelecimento = null;
  private Long idBanco = null;
  private Long idCartao = null;
  private BigDecimal valorPagamento = null;
  private String dataHoraPagamento = null;
  private String dataHoraEntradaPagamento = null;
  private Long status = null;
  private Long nossoNumero = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   **/
  public HistoricoPagamentoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Pagamento
   **/
  public HistoricoPagamentoResponse idPagamento(Long idPagamento) {
    this.idPagamento = idPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Pagamento")
  @JsonProperty("idPagamento")
  public Long getIdPagamento() {
    return idPagamento;
  }
  public void setIdPagamento(Long idPagamento) {
    this.idPagamento = idPagamento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento onde o Pagamento foi realizado, quando este for o local de pagamento
   **/
  public HistoricoPagamentoResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento onde o Pagamento foi realizado, quando este for o local de pagamento")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Institui\u00E7\u00E3o Banc\u00E1ria onde o Pagamento foi realizado, quando este for o local de pagamento
   **/
  public HistoricoPagamentoResponse idBanco(Long idBanco) {
    this.idBanco = idBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Institui\u00E7\u00E3o Banc\u00E1ria onde o Pagamento foi realizado, quando este for o local de pagamento")
  @JsonProperty("idBanco")
  public Long getIdBanco() {
    return idBanco;
  }
  public void setIdBanco(Long idBanco) {
    this.idBanco = idBanco;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o
   **/
  public HistoricoPagamentoResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Valor do Pagamento
   **/
  public HistoricoPagamentoResponse valorPagamento(BigDecimal valorPagamento) {
    this.valorPagamento = valorPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do Pagamento")
  @JsonProperty("valorPagamento")
  public BigDecimal getValorPagamento() {
    return valorPagamento;
  }
  public void setValorPagamento(BigDecimal valorPagamento) {
    this.valorPagamento = valorPagamento;
  }

  
  /**
   * Data e Hora da realiza\u00E7\u00E3o do Pagamento. Quando feito em Institui\u00E7\u00E3o Banc\u00E1ria, o hor\u00E1rio do pagamento \u00E9 exibido com valor zero
   **/
  public HistoricoPagamentoResponse dataHoraPagamento(String dataHoraPagamento) {
    this.dataHoraPagamento = dataHoraPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e Hora da realiza\u00E7\u00E3o do Pagamento. Quando feito em Institui\u00E7\u00E3o Banc\u00E1ria, o hor\u00E1rio do pagamento \u00E9 exibido com valor zero")
  @JsonProperty("dataHoraPagamento")
  public String getDataHoraPagamento() {
    return dataHoraPagamento;
  }
  public void setDataHoraPagamento(String dataHoraPagamento) {
    this.dataHoraPagamento = dataHoraPagamento;
  }

  
  /**
   * Data e Hora em que o registro do Pagamento foi cadastrado
   **/
  public HistoricoPagamentoResponse dataHoraEntradaPagamento(String dataHoraEntradaPagamento) {
    this.dataHoraEntradaPagamento = dataHoraEntradaPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e Hora em que o registro do Pagamento foi cadastrado")
  @JsonProperty("dataHoraEntradaPagamento")
  public String getDataHoraEntradaPagamento() {
    return dataHoraEntradaPagamento;
  }
  public void setDataHoraEntradaPagamento(String dataHoraEntradaPagamento) {
    this.dataHoraEntradaPagamento = dataHoraEntradaPagamento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Status do Pagamento
   **/
  public HistoricoPagamentoResponse status(Long status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Status do Pagamento")
  @JsonProperty("status")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do nosso n\u00FAmero
   **/
  public HistoricoPagamentoResponse nossoNumero(Long nossoNumero) {
    this.nossoNumero = nossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do nosso n\u00FAmero")
  @JsonProperty("nossoNumero")
  public Long getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(Long nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricoPagamentoResponse historicoPagamentoResponse = (HistoricoPagamentoResponse) o;
    return Objects.equals(this.idConta, historicoPagamentoResponse.idConta) &&
        Objects.equals(this.idPagamento, historicoPagamentoResponse.idPagamento) &&
        Objects.equals(this.idEstabelecimento, historicoPagamentoResponse.idEstabelecimento) &&
        Objects.equals(this.idBanco, historicoPagamentoResponse.idBanco) &&
        Objects.equals(this.idCartao, historicoPagamentoResponse.idCartao) &&
        Objects.equals(this.valorPagamento, historicoPagamentoResponse.valorPagamento) &&
        Objects.equals(this.dataHoraPagamento, historicoPagamentoResponse.dataHoraPagamento) &&
        Objects.equals(this.dataHoraEntradaPagamento, historicoPagamentoResponse.dataHoraEntradaPagamento) &&
        Objects.equals(this.status, historicoPagamentoResponse.status) &&
        Objects.equals(this.nossoNumero, historicoPagamentoResponse.nossoNumero);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idPagamento, idEstabelecimento, idBanco, idCartao, valorPagamento, dataHoraPagamento, dataHoraEntradaPagamento, status, nossoNumero);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoPagamentoResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPagamento: ").append(toIndentedString(idPagamento)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    idBanco: ").append(toIndentedString(idBanco)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    valorPagamento: ").append(toIndentedString(valorPagamento)).append("\n");
    sb.append("    dataHoraPagamento: ").append(toIndentedString(dataHoraPagamento)).append("\n");
    sb.append("    dataHoraEntradaPagamento: ").append(toIndentedString(dataHoraEntradaPagamento)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    nossoNumero: ").append(toIndentedString(nossoNumero)).append("\n");
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

