package com.vinicius.cursomc.repositories;

import com.vinicius.cursomc.ItemPedidoPK;
import com.vinicius.cursomc.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPK> {
}
