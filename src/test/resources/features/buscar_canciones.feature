# language : es
Característica: Buscar Canciones
  Yo como melomano quiero buscar canciones que me gustan
  para sentirme feliz

  Esquema del escenario: Jhon quiere busca canciones que mas le gustan
    para sentirme muy feliz.

    Dado que Jhon quiere buscar canciones
    Cuando el ingresa la <cancion>
    Entonces se debe visualizar el <resultado> en el listado de busqueda

    Ejemplos: 
      | cancion                | resultado         |
      | mujeres ricardo arjona | Mujeres (canción) |
