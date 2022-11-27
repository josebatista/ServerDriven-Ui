package com.github.josebatista.serverdrivenui.data.local

import com.github.josebatista.serverdrivenui.data.dto.ResultDto
import com.google.gson.Gson

class Mock {

    private val mockUi = """
        {
          "data": [
            {
              "type": "SCAFFOLD",
              "top_bar": [
                {
                  "type": "APP_BAR",
                  "children": [
                    {
                      "type": "TEXT",
                      "value": "Server Driven Ui"
                    }
                  ]
                }
              ],
              "children": [
                {
                  "type": "VERTICAL_LIST",
                  "children": [
                    {
                      "type": "ROW",
                      "children": [
                        {
                          "type": "TEXT",
                          "value": "Hi 1"
                        },
                        {
                          "type": "IMAGE",
                          "value": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzbsS4RLb_hYypkzuw3DbezcUMlYwomAci7w9AEYkH6fWsyeykzdZprLAgFi6fTpfNhEk&usqp=CAU"
                        }
                      ],
                      "action": {
                        "type": "SHOW_MESSAGE",
                        "value": "TESTE DE CLICK Hi 1"
                      }
                    },
                    {
                      "type": "ROW",
                      "children": [
                        {
                          "type": "TEXT",
                          "value": "Hi 2"
                        },
                        {
                          "type": "IMAGE",
                          "value": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzbsS4RLb_hYypkzuw3DbezcUMlYwomAci7w9AEYkH6fWsyeykzdZprLAgFi6fTpfNhEk&usqp=CAU"
                        }
                      ],
                      "action": {
                        "type": "SHOW_MESSAGE",
                        "value": "TESTE DE CLICK Hi 2"
                      }
                    },
                    {
                      "type": "ROW",
                      "children": [
                        {
                          "type": "TEXT",
                          "value": "Hi 3"
                        },
                        {
                          "type": "IMAGE",
                          "value": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzbsS4RLb_hYypkzuw3DbezcUMlYwomAci7w9AEYkH6fWsyeykzdZprLAgFi6fTpfNhEk&usqp=CAU"
                        }
                      ],
                      "action": {
                        "type": "SHOW_MESSAGE",
                        "value": "TESTE DE CLICK Hi 3"
                      }
                    },
                    {
                      "type": "ROW",
                      "children": [
                        {
                          "type": "TEXT",
                          "value": "Hi 4"
                        },
                        {
                          "type": "IMAGE",
                          "value": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzbsS4RLb_hYypkzuw3DbezcUMlYwomAci7w9AEYkH6fWsyeykzdZprLAgFi6fTpfNhEk&usqp=CAU"
                        }
                      ]
                    },
                    {
                      "type": "ROW",
                      "children": [
                        {
                          "type": "TEXT",
                          "value": "Hi 5"
                        },
                        {
                          "type": "IMAGE",
                          "value": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzbsS4RLb_hYypkzuw3DbezcUMlYwomAci7w9AEYkH6fWsyeykzdZprLAgFi6fTpfNhEk&usqp=CAU"
                        }
                      ]
                    },
                    {
                      "type": "ROW",
                      "children": [
                        {
                          "type": "TEXT",
                          "value": "Hi 6"
                        },
                        {
                          "type": "IMAGE",
                          "value": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzbsS4RLb_hYypkzuw3DbezcUMlYwomAci7w9AEYkH6fWsyeykzdZprLAgFi6fTpfNhEk&usqp=CAU"
                        }
                      ]
                    },
                    {
                      "type": "ROW",
                      "children": [
                        {
                          "type": "TEXT",
                          "value": "Hi 7"
                        },
                        {
                          "type": "IMAGE",
                          "value": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzbsS4RLb_hYypkzuw3DbezcUMlYwomAci7w9AEYkH6fWsyeykzdZprLAgFi6fTpfNhEk&usqp=CAU"
                        }
                      ]
                    },
                    {
                      "type": "ROW",
                      "children": [
                        {
                          "type": "TEXT",
                          "value": "Hi 8"
                        },
                        {
                          "type": "IMAGE",
                          "value": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzbsS4RLb_hYypkzuw3DbezcUMlYwomAci7w9AEYkH6fWsyeykzdZprLAgFi6fTpfNhEk&usqp=CAU"
                        }
                      ]
                    },
                    {
                      "type": "ROW",
                      "children": [
                        {
                          "type": "TEXT",
                          "value": "Hi 9"
                        },
                        {
                          "type": "IMAGE",
                          "value": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzbsS4RLb_hYypkzuw3DbezcUMlYwomAci7w9AEYkH6fWsyeykzdZprLAgFi6fTpfNhEk&usqp=CAU"
                        }
                      ]
                    },
                    {
                      "type": "ROW",
                      "children": [
                        {
                          "type": "TEXT",
                          "value": "Hi 10"
                        },
                        {
                          "type": "IMAGE",
                          "value": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzbsS4RLb_hYypkzuw3DbezcUMlYwomAci7w9AEYkH6fWsyeykzdZprLAgFi6fTpfNhEk&usqp=CAU"
                        }
                      ]
                    }
                  ]
                }
              ]
            }
          ]
        }
    """.trimIndent()

    fun getMainUi() = Gson().fromJson(mockUi, ResultDto::class.java)
}