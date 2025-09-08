# :link: Install Instruction #

## Java

### windows

1. Install [JDK](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
2. Set Environment Variables 
    
   ![1](https://hackmd.io/_uploads/r1NpRuWclx.jpg)
   ![2](https://hackmd.io/_uploads/BkEaROZcxe.jpg)
   ![3](https://hackmd.io/_uploads/rkVTCd-cee.jpg)
    
4. 確認安裝成功
    ```
    java -version
    javac -version
    ```

### macOS
0. Install Homebrew（若尚未安裝）
開啟「終端機」執行：
    ```
    /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
    brew doctor
    brew update
    ```


1. 使用 Homebrew 安裝 JDK
    ``` 
    brew install openjdk@21
    ```
2. 設定環境變數
    ```
    sudo mkdir -p /Library/Java/JavaVirtualMachines
    sudo ln -sfn "$(brew --prefix)/opt/openjdk@21/libexec/openjdk.jdk" /Library/Java/JavaVirtualMachines/openjdk-21.jdk
    ```
3. 確認安裝成功
    ```
    java -version
    javac -version
    ```


## IDE - VScode

1. Download [VScode](https://code.visualstudio.com/)
    windows configure:
     ![截圖 2025-08-31 下午4.22.53](https://hackmd.io/_uploads/Bk5_8YW5el.jpg)

2. Add Extension

    ![截圖 2025-08-31 下午4.26.14](https://hackmd.io/_uploads/HkiLvYbcex.png)

    

## Git

### windows
- Install [Git](https://git-scm.com/)
![1](https://hackmd.io/_uploads/B1K7x9W5le.jpg)

### macOS
```
brew install git
```


## Supplementary 

- [Github Copilot](https://code.visualstudio.com/docs/copilot/overview)
- [Github Education](https://william8510.pixnet.net/blog/post/576720564)







