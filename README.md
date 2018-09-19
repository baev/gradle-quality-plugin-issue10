Repository to reproduce an issue https://github.com/xvik/gradle-quality-plugin/issues/10

```bash
$ ./gradlew clean build
```

In logs you will see multiply pmd warnings:

```
> Task :pmdMain
Could not determine ant log level, no supported build listeners found. Log level is set to FINEST
This analysis could be faster, please consider using Incremental Analysis: https://pmd.github.io/pmd-6.6.0/pmd_userdocs_incremental_analysis.html
This analysis could be faster, please consider using Incremental Analysis: https://pmd.github.io/pmd-6.6.0/pmd_userdocs_incremental_analysis.html
This analysis could be faster, please consider using Incremental Analysis: https://pmd.github.io/pmd-6.6.0/pmd_userdocs_incremental_analysis.html
```

I guess it is related to `excludeSources = fileTree('build/generated-sources')` configuration section.
