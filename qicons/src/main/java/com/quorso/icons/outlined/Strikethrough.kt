package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Strikethrough: ImageVector
    get() {
        if (_Strikethrough != null) {
            return _Strikethrough!!
        }
        _Strikethrough = ImageVector.Builder(
            name = "Outlined.Strikethrough",
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
                moveTo(12f, 12f)
                arcToRelative(8.912f, 8.912f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.318f, -0.079f)
                curveToRelative(-1.585f, -0.424f, -2.904f, -1.247f, -3.76f, -2.236f)
                curveToRelative(-0.873f, -1.009f, -1.265f, -2.19f, -0.968f, -3.301f)
                curveToRelative(0.59f, -2.2f, 3.663f, -3.29f, 6.863f, -2.432f)
                arcTo(8.186f, 8.186f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 5.21f)
                moveTo(6.42f, 17.81f)
                curveToRelative(0.857f, 0.99f, 2.176f, 1.812f, 3.761f, 2.237f)
                curveToRelative(3.2f, 0.858f, 6.274f, -0.23f, 6.863f, -2.431f)
                curveToRelative(0.233f, -0.868f, 0.044f, -1.779f, -0.465f, -2.617f)
                moveTo(3.75f, 12f)
                horizontalLineToRelative(16.5f)
            }
        }.build()

        return _Strikethrough!!
    }

@Suppress("ObjectPropertyName")
private var _Strikethrough: ImageVector? = null
