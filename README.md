# Arquivo Explicativo da API by brielpg

## Visão Geral
Esta API em Java foi desenvolvida para permitir operações CRUD (Criar, Ler, Atualizar, Deletar) em um repositório de vídeos. Ela é construída usando o framework Spring Boot e segue os princípios REST.

## Endpoints

### POST /videos
- **Descrição**: Cadastra um novo vídeo.
- **Corpo da Requisição**: JSON com os dados de cadastro do vídeo.
- **Resposta**: Não retorna conteúdo. Status 200 OK se bem-sucedido.

### GET /videos
- **Descrição**: Lista todos os vídeos ativos.
- **Resposta**: JSON contendo uma lista de vídeos.

### GET /videos/{id}
- **Descrição**: Exibe um vídeo específico pelo ID.
- **Parâmetros de URL**: ID do vídeo.
- **Resposta**: JSON contendo os dados do vídeo ou status 404 Not Found se não existir.

### PUT /videos
- **Descrição**: Atualiza os dados de um vídeo existente.
- **Corpo da Requisição**: JSON com os dados atualizados do vídeo.
- **Resposta**: Não retorna conteúdo. Status 200 OK se bem-sucedido.

### DELETE /videos/{id}
- **Descrição**: Desativa ou ativa um vídeo pelo ID.
- **Parâmetros de URL**: ID do vídeo.
- **Resposta**: Não retorna conteúdo. Status 200 OK se bem-sucedido.

## Modelos de Dados
- `DadosCadastroVideo`: Modelo para dados de cadastro de um novo vídeo.
- `DadosUpdateVideo`: Modelo para dados de atualização de um vídeo existente.
