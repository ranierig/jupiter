import csv
import sys
import os
import os.path
from _csv import writer

#
# def via_csv():
#     nome_arquivo = 'arquivo.csv'
#     with open(nome_arquivo, 'r') as arquivo:
#         linhas = csv.reader(arquivo, delimiter=';')
#         try:
#             for linha in linhas:
#                 print(linha)
#         except csv.Error as e:
#             sys.exit('Arquivo %s linha %d: %s' % (nome_arquivo, linhas.line_num, e))
#
#     letras = 'Ranieri'
#     caminho_arquivos = r'C:\\jupiter\\python\\Jupiter'
#     for file in os.listdir(caminho_arquivos):
#         caminho_atual = os.path.join(caminho_arquivos, file)
#         if os.path.isfile(caminho_atual):
#             with open(caminho_atual, 'r') as file_writer:
#                 if letras in file_writer.read():
#                     print('string found')

caminho_arquivos = r'C:\\jupiter\\python\\Jupiter'
text_file = 'arquivo.txt'
dados_procurar = 'dadosaprocurar.txt'
file_result = 'resultado.csv'
nome_arquivo = 'arquivo.csv'
#print('linha;texto')


def get_line(word_line):
    with open(text_file, 'r') as file:
        try:
            for num_line, line in enumerate(file, 1):
                if word_line in line.lower():
                    print('%i; %s' % (num_line, line.strip()))
                    return [file_result, num_line, line.strip()]
            return ["", "", ""]
        except csv.Error as e:
            return["", "", ""]

with open(dados_procurar, mode='r', encoding='UTF-8') as dado:
    for word in dado:
        #print(word.strip())
        [file_result, num_line, line] = get_line(word.lower().strip())
        if line.strip() != "":
            dados = [file_result, num_line, line.strip()]
            with open('dados.csv', mode='a', newline='') as arquivo:
                arquivo.write("\n" + "; ".join([str(item) for item in dados]))
