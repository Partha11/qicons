package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ChartPie: ImageVector
    get() {
        if (_ChartPie != null) {
            return _ChartPie!!
        }
        _ChartPie = ImageVector.Builder(
            name = "Outlined.ChartPie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 6f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.5f, 7.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineTo(6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.5f, 10.5f)
                horizontalLineTo(21f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 3f)
                verticalLineToRelative(7.5f)
                close()
            }
        }.build()

        return _ChartPie!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPie: ImageVector? = null
