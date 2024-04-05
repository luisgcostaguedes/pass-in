# Pass.in - Gestão de Participantes em Eventos

O Pass.in é uma aplicação desenvolvida em Java para facilitar a gestão de participantes em eventos presenciais. Com ele, os organizadores podem cadastrar eventos e abrir uma página pública de inscrição, enquanto os participantes podem se inscrever e emitir uma credencial para check-in no dia do evento.

## Funcionalidades

- Cadastro de eventos: Os organizadores podem cadastrar informações sobre o evento, como nome, data, local, descrição, etc.
- Página de inscrição pública: Após cadastrar um evento, é gerada uma página pública de inscrição onde os participantes podem se inscrever.
- Emissão de credencial: Os participantes inscritos podem emitir uma credencial após a inscrição para utilizar no check-in no dia do evento.
- Scan de credencial: O sistema oferece a funcionalidade de fazer scan da credencial do participante para permitir sua entrada no evento.

## Tecnologias Utilizadas

- Java: A aplicação é desenvolvida em Java, uma linguagem de programação robusta e amplamente utilizada no desenvolvimento de aplicações empresariais.
- Spring Framework: Para facilitar o desenvolvimento e fornecer uma estrutura sólida, o Spring Framework é utilizado no Pass.in.
- Banco de Dados: Para armazenar informações sobre eventos, participantes e credenciais, é utilizado um banco de dados relacional, como MySQL ou PostgreSQL.

## Como Contribuir

Se você deseja contribuir com o Pass.in, siga estes passos:

1. Faça um fork do repositório.
2. Crie uma branch para sua feature: `git checkout -b feature/nova-feature`.
3. Faça commit das suas alterações: `git commit -m 'Adicionando uma nova feature'`.
4. Faça push para a branch: `git push origin feature/nova-feature`.
5. Abra um pull request.

## Como Executar

Para executar o Pass.in localmente, siga estas etapas:

1. Clone o repositório: `git clone https://github.com/seu-usuario/passin.git`.
2. Entre no diretório do projeto: `cd passin`.
3. Instale as dependências utilizando o Maven: `mvn install`.
4. Configure o banco de dados com as informações necessárias.
5. Execute a aplicação: `java -jar passin.jar`.

## Licença

Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter mais informações.

---

Esse README é apenas um exemplo básico. Certifique-se de incluir detalhes específicos sobre como configurar, executar e contribuir para o projeto à medida que ele for desenvolvido.
