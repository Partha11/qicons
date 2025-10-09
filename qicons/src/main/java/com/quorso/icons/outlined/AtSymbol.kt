package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.AtSymbol: ImageVector
    get() {
        if (_AtSymbol != null) {
            return _AtSymbol!!
        }
        _AtSymbol = ImageVector.Builder(
            name = "Outlined.AtSymbol",
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
                moveTo(16.5f, 12f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 0f)
                close()
                moveTo(16.5f, 12f)
                curveToRelative(0f, 1.657f, 1.007f, 3f, 2.25f, 3f)
                reflectiveCurveTo(21f, 13.657f, 21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.636f, 6.364f)
                moveTo(16.5f, 12f)
                lineTo(16.5f, 8.25f)
            }
        }.build()

        return _AtSymbol!!
    }

@Suppress("ObjectPropertyName")
private var _AtSymbol: ImageVector? = null
