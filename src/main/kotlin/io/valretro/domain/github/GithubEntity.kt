package io.valretro.domain.github

import io.valretro.domain.common.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "`githubs`")
class GithubEntity(
    name: String,
) : BaseEntity() {
    @Column(nullable = false)
    var name: String = name
        protected set
}