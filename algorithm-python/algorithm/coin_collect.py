# -*- coding: utf-8 -*-

class CoinCollect:

    @staticmethod
    def coin_change(coins: list[int], amount: int):
        def dp(n):
            if amount < 0:
                return -1
            if amount == 0:
                return 0
            res = float('INF')
            for coin in coins:
                sub = dp(n - coin)
                if sub == -1:
                    continue
                res = min(res, 1 + sub)
            return res if res != float('INF') else -1

        return dp(amount)

    @staticmethod
    def coin_change_map(coins: list[int], amount: int):
        table = dict()

        def dp(n):
            if n in table:
                return table[n]
            if n < 0:
                return -1
            if n == 0:
                return 0
            res = float('INF')
            for coin in coins:
                sub = dp(n - coin)
                if sub == -1:
                    continue
                res = min(res, 1 + sub)
            table[n] = res if res != float('INF') else -1
            return table[n]

        return dp(amount)

    @staticmethod
    def coin_collect(coins: list[int], amount: int) -> int:
        return
