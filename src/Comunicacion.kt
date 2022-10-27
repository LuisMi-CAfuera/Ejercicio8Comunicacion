

class Comunicacion {
    var respuesta: String = ""
    //Funcion de adolescente aqui se ponen todos los dialogos de todas las razas cuando son adolescentes
    fun adolescente(nombre: String, raza: String) {
        if (raza == "Elfo" || raza == "elfo" || raza == "Goblin" || raza == "goblin") {
            do {
                println("Di algo")
                respuesta = readLine().toString()
                if (respuesta == "¿Como estas?" || respuesta == "¿como estas?" || respuesta == "Como estas?" || respuesta == "como estas?") {
                    println(EncriptarClase().control("De lujo"))
                } else {
                    if (respuesta == respuesta.toUpperCase() && respuesta.contains("?") && respuesta != "ADIOS") {
                        println(EncriptarClase().control("Tranqui se lo que hago"))
                    } else {
                        if (respuesta == respuesta.toUpperCase() && respuesta != "ADIOS") {
                            println(EncriptarClase().control("Eh relajate"))
                        } else {
                            if (respuesta.contains(nombre)) {
                                println("${EncriptarClase().control("Que pasa")}?")
                            } else {
                                if (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS") {
                                    println(EncriptarClase().control("Yo que se"))
                                }

                            }

                        }


                    }


                }

            } while (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS")
        } else {
            if (raza == "Humano" || raza == "humano") {
                do {
                    println("Di algo")
                    respuesta = readLine().toString()
                    if (respuesta == "¿Como estas?" || respuesta == "¿como estas?" || respuesta == "Como estas?" || respuesta == "como estas?") {
                        println("De lujo")
                    } else {
                        if (respuesta == respuesta.toUpperCase() && respuesta.contains("?") && respuesta != "ADIOS") {
                            println("Tranqui se lo que hago")
                        } else {
                            if (respuesta == respuesta.toUpperCase() && respuesta != "ADIOS") {
                                println("Eh relajate")
                            } else {
                                if (respuesta.contains(nombre)) {
                                    println("Que pasa?")
                                } else {
                                    if (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS") {
                                        println("Yo que se")
                                    }

                                }

                            }


                        }


                    }

                } while (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS")
            } else {
                if (raza == "Enano" || raza == "enano") {
                    do {
                        println("Di algo")
                        respuesta = readLine().toString()
                        if (respuesta == "¿Como estas?" || respuesta == "¿como estas?" || respuesta == "Como estas?" || respuesta == "como estas?") {
                            println("DE LUJO")
                        } else {
                            if (respuesta == respuesta.toUpperCase() && respuesta.contains("?") && respuesta != "ADIOS") {
                                println("TRANQUI SE LO QUE HAGO")
                            } else {
                                if (respuesta == respuesta.toUpperCase() && respuesta != "ADIOS") {
                                    println("EH RELAJATE")
                                } else {
                                    if (respuesta.contains(nombre)) {
                                        println("QUE PASA?")
                                    } else {
                                        if (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS") {
                                            println("YO QUE SE")
                                        }

                                    }

                                }


                            }


                        }

                    } while (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS")
                } else {
                    do {
                        println("Di algo")
                        respuesta = readLine().toString()
                        if (respuesta == "¿Como estas?" || respuesta == "¿como estas?" || respuesta == "Como estas?" || respuesta == "como estas?") {
                            println("De lujo")
                        } else {
                            if (respuesta == respuesta.toUpperCase() && respuesta.contains("?") && respuesta != "ADIOS") {
                                println("Tranqui se lo que hago")
                            } else {
                                if (respuesta == respuesta.toUpperCase() && respuesta != "ADIOS") {
                                    println("Eh relajate")
                                } else {
                                    if (respuesta.contains(nombre)) {
                                        println("Que pasa?")
                                    } else {
                                        if (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS") {
                                            println("Yo que se")
                                        }

                                    }

                                }


                            }


                        }

                    } while (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS")
                }


            }
        }
    }
    //Funcion de adultos aqui se ponen todos los dialogos de todas las razas cuando son adultos

    fun adulto(nombre: String, raza: String) {
        if (raza == "Elfo" || raza == "elfo" || raza == "Goblin" || raza == "goblin") {
            do {
                println("Di algo")
                respuesta = readLine().toString()
                if (respuesta == "¿Como estas?" || respuesta == "¿como estas?" || respuesta == "Como estas?" || respuesta == "como estas?") {
                    println(EncriptarClase().control("En la flor de la vida, pero me empieza a doler la espalda"))
                } else {
                    if (respuesta == respuesta.toUpperCase() && respuesta.contains("?") && respuesta != "ADIOS") {
                        println(EncriptarClase().control("Estoy buscando la mejor solución"))
                    } else {
                        if (respuesta == respuesta.toUpperCase() && respuesta != "ADIOS") {
                            println(EncriptarClase().control("No me levantes la voz mequetrefe"))
                        } else {
                            if (respuesta.contains(nombre)) {
                                println("¿${EncriptarClase().control("Necesitas algo")}?")
                            } else {
                                if (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS") {
                                    println(EncriptarClase().control("No sé de qué me estás hablando"))
                                }

                            }

                        }


                    }


                }

            } while (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS")
        } else {
            if (raza == "Humano" || raza == "humano") {
                do {
                    println("Di algo")
                    respuesta = readLine().toString()
                    if (respuesta == "¿Como estas?" || respuesta == "¿como estas?" || respuesta == "Como estas?" || respuesta == "como estas?") {
                        println("En la flor de la vida, pero me empieza a doler la espalda")
                    } else {
                        if (respuesta == respuesta.toUpperCase() && respuesta.contains("?") && respuesta != "ADIOS") {
                            println("Estoy buscando la mejor solución")
                        } else {
                            if (respuesta == respuesta.toUpperCase() && respuesta != "ADIOS") {
                                println("No me levantes la voz mequetrefe")
                            } else {
                                if (respuesta.contains(nombre)) {
                                    println("¿Necesitas algo?")
                                } else {
                                    if (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS") {
                                        println("No sé de qué me estás hablando")
                                    }

                                }

                            }


                        }


                    }

                } while (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS")
            } else {
                if (raza == "Enano" || raza == "enano") {
                    do {
                        println("Di algo")
                        respuesta = readLine().toString()
                        if (respuesta == "¿Como estas?" || respuesta == "¿como estas?" || respuesta == "Como estas?" || respuesta == "como estas?") {
                            println("EN LA FLOR DE LA VIDA, PERO ME EMPIEZA A DOLER LA ESPALDA")
                        } else {
                            if (respuesta == respuesta.toUpperCase() && respuesta.contains("?") && respuesta != "ADIOS") {
                                println("ESTOY BUSCANDO LA MEJOR SOLUCIÓN")
                            } else {
                                if (respuesta == respuesta.toUpperCase() && respuesta != "ADIOS") {
                                    println("NO ME LEVANTES LA VOZ MEQUETREFE")
                                } else {
                                    if (respuesta.contains(nombre)) {
                                        println("¿NECESITAS ALGO?")
                                    } else {
                                        if (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS") {
                                            println("NO SÉ DE QUÉ ME ESTÁS HABLANDO")
                                        }

                                    }

                                }


                            }


                        }

                    } while (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS")
                } else {
                    do {
                        println("Di algo")
                        respuesta = readLine().toString()
                        if (respuesta == "¿Como estas?" || respuesta == "¿como estas?" || respuesta == "Como estas?" || respuesta == "como estas?") {
                            println("En la flor de la vida, pero me empieza a doler la espalda")
                        } else {
                            if (respuesta == respuesta.toUpperCase() && respuesta.contains("?") && respuesta != "ADIOS") {
                                println("Estoy buscando la mejor solución")
                            } else {
                                if (respuesta == respuesta.toUpperCase() && respuesta != "ADIOS") {
                                    println("No me levantes la voz mequetrefe")
                                } else {
                                    if (respuesta.contains(nombre)) {
                                        println("¿Necesitas algo?")
                                    } else {
                                        if (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS") {
                                            println("No sé de qué me estás hablando")
                                        }

                                    }

                                }


                            }


                        }

                    } while (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS")
                }


            }
        }
    }
    //Funcion de anciano aqui se ponen todos los dialogos de todas las razas cuando son anciano
    fun anciano(nombre: String, raza: String) {
        if (raza == "Elfo" || raza == "elfo" || raza == "Goblin" || raza == "goblin") {
            do {
                println("Di algo")
                respuesta = readLine().toString()
                if (respuesta == "¿Como estas?" || respuesta == "¿como estas?" || respuesta == "Como estas?" || respuesta == "como estas?") {
                    println(EncriptarClase().control("No me puedo mover"))
                } else {
                    if (respuesta == respuesta.toUpperCase() && respuesta.contains("?") && respuesta != "ADIOS") {
                        println("${EncriptarClase().control("Que no te escucho")}!!")
                    } else {
                        if (respuesta == respuesta.toUpperCase() && respuesta != "ADIOS") {
                            println(EncriptarClase().control("Háblame más alto que no te escucho"))
                        } else {
                            if (respuesta.contains(nombre)) {
                                println(EncriptarClase().control("Las 5 de la tarde"))
                            } else {
                                if (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS") {
                                    println(EncriptarClase().control("En mis tiempos esto no pasaba"))
                                }

                            }

                        }


                    }


                }

            } while (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS")
        } else {
            if (raza == "Humano" || raza == "humano") {
                do {
                    println("Di algo")
                    respuesta = readLine().toString()
                    if (respuesta == "¿Como estas?" || respuesta == "¿como estas?" || respuesta == "Como estas?" || respuesta == "como estas?") {
                        println("No me puedo mover")
                    } else {
                        if (respuesta == respuesta.toUpperCase() && respuesta.contains("?") && respuesta != "ADIOS") {
                            println("¿Que no te escucho?!!")
                        } else {
                            if (respuesta == respuesta.toUpperCase() && respuesta != "ADIOS") {
                                println("Háblame más alto que no te escucho")
                            } else {
                                if (respuesta.contains(nombre)) {
                                    println("Las 5 de la tarde")
                                } else {
                                    if (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS") {
                                        println("En mis tiempos esto no pasaba")
                                    }

                                }

                            }


                        }


                    }

                } while (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS")
            } else {
                if (raza == "Enano" || raza == "enano") {
                    do {
                        println("Di algo")
                        respuesta = readLine().toString()
                        if (respuesta == "¿Como estas?" || respuesta == "¿como estas?" || respuesta == "Como estas?" || respuesta == "como estas?") {
                            println("NO ME PUEDO MOVER")
                        } else {
                            if (respuesta == respuesta.toUpperCase() && respuesta.contains("?") && respuesta != "ADIOS") {
                                println("¿QUE NO TE ESCUCHO?!!")
                            } else {
                                if (respuesta == respuesta.toUpperCase() && respuesta != "ADIOS") {
                                    println("HÁBLAME MÁS ALTO QUE NO TE ESCUCHO")
                                } else {
                                    if (respuesta.contains(nombre)) {
                                        println("LAS 5 DE LA TARDE")
                                    } else {
                                        if (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS") {
                                            println("EN MIS TIEMPOS ESTO NO PASABA")
                                        }

                                    }

                                }


                            }


                        }

                    } while (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS")
                } else {
                    do {
                        println("Di algo")
                        respuesta = readLine().toString()
                        if (respuesta == "¿Como estas?" || respuesta == "¿como estas?" || respuesta == "Como estas?" || respuesta == "como estas?") {
                            println("No me puedo mover")
                        } else {
                            if (respuesta == respuesta.toUpperCase() && respuesta.contains("?") && respuesta != "ADIOS") {
                                println("¿Que no te escucho?!!")
                            } else {
                                if (respuesta == respuesta.toUpperCase() && respuesta != "ADIOS") {
                                    println("Háblame más alto que no te escucho")
                                } else {
                                    if (respuesta.contains(nombre)) {
                                        println("Las 5 de la tarde")
                                    } else {
                                        if (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS") {
                                            println("En mis tiempos esto no pasaba")
                                        }

                                    }

                                }


                            }


                        }

                    } while (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS")
                }


            }
        }
    }
}