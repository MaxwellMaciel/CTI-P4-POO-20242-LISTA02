Aqui está o resumo com os pseudocódigos fornecidos em markdown:

---

### 1. Aumento Salarial de Funcionário

**Problema:** Um funcionário de uma empresa recebe aumento salarial anual conforme um percentual específico. O programa deve calcular o salário atual do funcionário com base nos aumentos anuais.

**Pseudocódigo:**
```pseudocode
ALGORITMO
DECLARE i, ano_atual, salario NUMÉRICO
novo_salario, percentual NUMÉRICO
LEIA ano_atual
salario ← 1000
percentual ← 1.5/100
novo_salario ← salario + percentual * salario
PARA i ← 2007 ATÉ ano_atual FAÇA
    percentual ← 2 * percentual
    novo_salario ← novo_salario + percentual * novo_salario
FIM
ESCREVA novo_salario
FIM_ALGORITMO.
```

---

### 2. Cálculo do valor de E (Série)

**Problema:** Calcular o valor de \( E \) conforme a fórmula:

\[
E = 1 + \frac{1}{1!} + \frac{1}{2!} + \frac{1}{3!} + ... + \frac{1}{N!}
\]

**Pseudocódigo:**
```pseudocode
ALGORITMO
DECLARE n, e, i, j, fat NUMÉRICO
LEIA n
e ← 1
PARA i ← 1 ATÉ n FAÇA
    fat ← 1
    PARA j ← 1 ATÉ i FAÇA
        fat ← fat * j
    FIM
    e ← e + 1/fat
FIM
ESCREVA e
FIM_ALGORITMO.
```

---

### 3. Tabela de Fatorial de N Valores

**Problema:** Calcular o fatorial dos números fornecidos, conforme o número \( N \) de valores fornecidos.

**Pseudocódigo:**
```pseudocode
ALGORITMO
DECLARE n, num, i, j, fat NUMÉRICO
LEIA n
PARA i ← 1 ATÉ n FAÇA
    LEIA num
    fat ← 1
    PARA j ← 1 ATÉ num FAÇA
        fat ← fat * j
    FIM
    ESCREVA fat
FIM
FIM_ALGORITMO.
```

---

### 4. Estatísticas de Acidentes de Trânsito

**Problema:** Calcular o maior e menor índice de acidentes de trânsito, a média de veículos, e a média de acidentes nas cidades com menos de 2.000 veículos.

**Pseudocódigo:**
```pseudocode
ALGORITMO
DECLARE cont, cod, num_vei, num_acid NUMÉRICO
maior, cid_maior, menor, cid_menor NUMÉRICO
media_vei, soma_vei, media_acid NUMÉRICO
soma_acid, cont_acid NUMÉRICO
soma_vei ← 0
soma_acid ← 0
cont_acid ← 0
PARA cont ← 1 ATÉ 5 FAÇA
    LEIA cod, num_vei, num_acid
    SE cont = 1
        maior ← num_acid
        cid_maior ← cod
        menor ← num_acid
        cid_menor ← cod
    SENÃO
        SE num_acid > maior
            maior ← num_acid
            cid_maior ← cod
        FIM
        SE num_acid < menor
            menor ← num_acid
            cid_menor ← cod
        FIM
    FIM
    soma_vei ← soma_vei + num_vei
    SE num_vei < 2000
        soma_acid ← soma_acid + num_acid
        cont_acid ← cont_acid + 1
    FIM
FIM
ESCREVA maior, cid_maior
ESCREVA menor, cid_menor
media_vei ← soma_vei / 5
ESCREVA media_vei
SE cont_acid = 0
    ESCREVA "Não foi digitada nenhuma cidade com menos de 2000 veículos"
SENÃO
    media_acid ← soma_acid / cont_acid
    ESCREVA media_acid
FIM
FIM_ALGORITMO.
```

---

### 5. Cálculo de Série com Fatoriais

**Problema:** Calcular a série:

\[
S = -\frac{X^2}{1!} + \frac{X^3}{2!} - \frac{X^4}{3!} + \frac{X^5}{4!} - \dots
\]

**Pseudocódigo:**
```pseudocode
ALGORITMO
DECLARE fim, i, j, x, expoente, num_termos NUMÉRICO
den, denominador, fat, s NUMÉRICO
LEIA num_termos, x
s ← 0
denominador ← 1
PARA i ← 1 ATÉ num_termos FAÇA
    fim ← denominador
    fat ← 1
    PARA j ← 1 ATÉ fim FAÇA
        fat ← fat * j
    FIM
    expoente ← i + 1
    SE RESTO (expoente / 2) = 0
        s ← s - x ^ expoente / fat
    SENÃO
        s ← s + x ^ expoente / fat
    FIM
    SE denominador = 4
        den ← -1
    SE denominador = 1
        den ← 1
    SE den = 1
        denominador ← denominador + 1
    SENÃO
        denominador ← denominador - 1
    FIM
ESCREVA s
FIM_ALGORITMO.
```

---

### 6. Cálculo de Salário e Benefícios

**Problema:** Calcular o valor da hora trabalhada, salário inicial, auxílio alimentação e salário final para 10 funcionários com base em suas categorias, turnos e horas trabalhadas.

**Pseudocódigo:**
```pseudocode
ALGORITMO
DECLARE cont, codigo, nht, valor NUMÉRICO
sal_min, sal_inicial, aux, sal_final NUMÉRICO
turno, categoria LITERAL
sal_min ← 450
PARA cont ← 1 ATÉ 10 FAÇA
    LEIA codigo, nht, turno, categoria
    ENQUANTO turno ≠ "M" E turno ≠ "V" E turno ≠ "N" FAÇA
        LEIA turno
    FIM
    ENQUANTO categoria ≠ "G" E categoria ≠ "O" FAÇA
        LEIA categoria
    FIM
    SE categoria = "G"
        SE turno = "N"
            valor ← sal_min * 18 / 100
        SENÃO
            valor ← sal_min * 15 / 100
    SENÃO
        SE turno = "N"
            valor ← sal_min * 13 / 100
        SENÃO
            valor ← sal_min * 10 / 100
    FIM
    sal_inicial ← nht * valor
    SE sal_inicial <= 300
        aux ← sal_inicial * 20 / 100
    SENÃO SE sal_inicial < 600
        aux ← sal_inicial * 15 / 100
    SENÃO
        aux ← sal_inicial * 5 / 100
    FIM
    sal_final ← sal_inicial + aux
    ESCREVA codigo, nht, valor, sal_inicial, aux, sal_final
FIM
FIM_ALGORITMO.
```

---

### 7. Sequência de Fibonacci

**Problema:** Mostrar os oito primeiros termos da sequência de Fibonacci.

**Pseudocódigo:**
```pseudocode
ALGORITMO
DECLARE cont, num1, num2, res NUMÉRICO
num1 ← 0
num2 ← 1
ESCREVA num1
ESCREVA num2
PARA cont ← 3 ATÉ 8 FAÇA
    res ← num1 + num2
    ESCREVA res
    num1 ← num2
    num2 ← res
FIM
FIM_ALGORITMO.
```

---

### 8. Série com Multiplicações e Divisões

**Problema:** Calcular e mostrar os valores de acordo com uma série específica que alterna multiplicações e divisões.

**Pseudocódigo:**
```pseudocode
ALGORITMO
DECLARE i, num_termos, num1, num2, num3 NUMÉRICO
LEIA num_termos
num1 ← 2
num2 ← 7
num3 ← 3
ESCREVA num1
ESCREVA num2
ESCREVA num3
i ← 4
ENQUANTO i ≠ num_termos FAÇA
    num1 ← num1 * 2
    ESCREVA num1
    i ← i + 1
    SE i ≠ num_termos
        num2 ← num2 * 3
        ESCREVA num2
        i ← i + 1
        SE i ≠ num_termos
            num3 ← num3 * 4


            ESCREVA num3
        FIM
    FIM
FIM
FIM_ALGORITMO.
```

---

Agora, todos os pseudocódigos e resumos estão em markdown!
