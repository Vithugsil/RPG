package org.example.entities


class Modifiers {
    companion object {
        fun modifierCost(attributeValue: Int): Int {
            var cost = 0
            when (attributeValue) {
                8 -> cost = 0
                9 -> cost = 1
                10 -> cost = 2
                11 -> cost = 3
                12 -> cost = 4
                13 -> cost = 5
                14 -> cost = 7
                15 -> cost = 9
            }
            return cost
        }

        fun modifierAttribute(attributeValue: Int): Int {
            var modifier = 0
            when (attributeValue) {
                8, 9 -> modifier = -1
                10, 11 -> modifier = 0
                12, 13 -> modifier = 1
                14, 15 -> modifier = 2
            }
            return modifier
        }

    }

}

/* Para cada 1 ponto tem seu custo, se eu tiver 8 pontos na habilidade, eu posso aumentar 1 ponto dela sem gastar nada
   dos 27 pontos para distribuição, apartir de 9 pontos na habilidade, desconta-se 1 nos 27 pontos
 */