package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





/**
 * Objeto Notifica\u00C3\u00A7\u00C3\u00A3o
 **/

@ApiModel(description = "Objeto Notifica\u00C3\u00A7\u00C3\u00A3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class NotificacaoSMSBody   {
  
  private Long nsu = null;
  private Long idPessoa = null;
  private Long idConta = null;
  private String celular = null;
  private String conteudo = null;
  private Date dataAgendamento = null;


  public enum EventoEnum {
    RISCO_FRAUDE("RISCO_FRAUDE"),
    OUTROS("OUTROS");

    private String value;

    EventoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private EventoEnum evento = null;

  
  /**
   * N\u00C3\u00BAmero sequencial \u00C3\u00BAnico
   **/
  public NotificacaoSMSBody nsu(Long nsu) {
    this.nsu = nsu;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00C3\u00BAmero sequencial \u00C3\u00BAnico")
  @JsonProperty("nsu")
  public Long getNsu() {
    return nsu;
  }
  public void setNsu(Long nsu) {
    this.nsu = nsu;
  }

  
  /**
   * C\u00C3\u00B3digo identificado da pessoa
   **/
  public NotificacaoSMSBody idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo identificado da pessoa")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da conta
   **/
  public NotificacaoSMSBody idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Apresenta o celular a ser eviado o SMS no formato 5588999999999 ou 5588999999999.
   **/
  public NotificacaoSMSBody celular(String celular) {
    this.celular = celular;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o celular a ser eviado o SMS no formato 5588999999999 ou 5588999999999.")
  @JsonProperty("celular")
  public String getCelular() {
    return celular;
  }
  public void setCelular(String celular) {
    this.celular = celular;
  }

  
  /**
   * Apresenta o texto do SMS a ser enviado
   **/
  public NotificacaoSMSBody conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o texto do SMS a ser enviado")
  @JsonProperty("conteudo")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * Apresenta a data e hora em que ser\u00C3\u00A1 enviado a notifica\u00C3\u00A7\u00C3\u00A3o
   **/
  public NotificacaoSMSBody dataAgendamento(Date dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data e hora em que ser\u00C3\u00A1 enviado a notifica\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("dataAgendamento")
  public Date getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(Date dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * Apresenta o evento a qual pertence a notifica\u00C3\u00A7\u00C3\u00A3o
   **/
  public NotificacaoSMSBody evento(EventoEnum evento) {
    this.evento = evento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o evento a qual pertence a notifica\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("evento")
  public EventoEnum getEvento() {
    return evento;
  }
  public void setEvento(EventoEnum evento) {
    this.evento = evento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificacaoSMSBody notificacaoSMSBody = (NotificacaoSMSBody) o;
    return Objects.equals(this.nsu, notificacaoSMSBody.nsu) &&
        Objects.equals(this.idPessoa, notificacaoSMSBody.idPessoa) &&
        Objects.equals(this.idConta, notificacaoSMSBody.idConta) &&
        Objects.equals(this.celular, notificacaoSMSBody.celular) &&
        Objects.equals(this.conteudo, notificacaoSMSBody.conteudo) &&
        Objects.equals(this.dataAgendamento, notificacaoSMSBody.dataAgendamento) &&
        Objects.equals(this.evento, notificacaoSMSBody.evento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsu, idPessoa, idConta, celular, conteudo, dataAgendamento, evento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoSMSBody {\n");
    
    sb.append("    nsu: ").append(toIndentedString(nsu)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    celular: ").append(toIndentedString(celular)).append("\n");
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
    sb.append("    dataAgendamento: ").append(toIndentedString(dataAgendamento)).append("\n");
    sb.append("    evento: ").append(toIndentedString(evento)).append("\n");
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


