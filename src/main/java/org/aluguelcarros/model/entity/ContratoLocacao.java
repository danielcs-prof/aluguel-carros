package org.aluguelcarros.model.entity;

import java.util.Date;
import java.util.List;

public class ContratoLocacao {
    private Long id;
    private Date dataLocacao;
    private Date dataDevolucao;
    private float valorCaucao;
    private float valorTotal;
    private String status;
    private List<Ocorrencia> ocorrenciaList;
    private List<Veiculo> veiculoList;
}
