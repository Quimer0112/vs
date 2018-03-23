<%-- 
    Document   : trocar
    Created on : 22/03/2018, 20:51:54
    Author     : aluno
--%>

<%@page import="com.mycompany.adoptionmaven.pessoa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <%
            pessoa usuario = (pessoa) session.getAttribute("usuariologado");
        %>
    </head>
    <body>
        <form method="post" action="Trocardados">
            <!-- Main -->
            <section id="main" class="wrapper">
                <div class="container">

                    <header class="major">
                        <h2>Cadastre-se</h2>
                    </header>
                    <section>
                        <div class="row uniform 50%">
                             <table>
                                <tr>
                                    <td>
                                        <!--<input type="text" id="nome" placeholder="Nome" />-->
                                        <h5>Nome:</h5>
                                        <input type="text" name="nome" value="${nome}" />
                                    </td>
                                </tr>
                                <tr>
                                    <td>                                      <h5>Cpf:</h5>

                                        <input type="text" name="cpf" value="${cpf}" />
                                    </td>
                                </tr>
                                <tr>
                                    <td>                                      <h5>Telefone:</h5>

                                        <input type="text" name="telefone" value="${telefone}" />
                                    </td>
                                </tr>
                                <tr>
                                    <td>                                      <h5>Endereço:</h5>

                                        <input type="text" name="endereco" value="${endereco}" />
                                    </td>
                                </tr>
                                <tr>
                                    <td>                                      <h5>Email:</h5>

                                        <input type="text" name="email" value="${email}" />
                                    </td>
                                </tr>
                                <tr>
                                    <td>                                      <h5>Senha:</h5>

                                        <input type="password" name="senha" value="${senha}" />
                                    </td>
                                </tr>
                            </table>
                            <br />
                            <div class="row">
                                <input type="submit"  /> 
                            </div> 
                        </div>
                    </section>
                </div>
            </section>
        </form>
    </body>
</html>
