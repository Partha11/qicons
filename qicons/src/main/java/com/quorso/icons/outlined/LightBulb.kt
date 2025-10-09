package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.LightBulb: ImageVector
    get() {
        if (_LightBulb != null) {
            return _LightBulb!!
        }
        _LightBulb = ImageVector.Builder(
            name = "Outlined.LightBulb",
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
                moveTo(12f, 18f)
                verticalLineToRelative(-5.25f)
                moveToRelative(0f, 0f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -0.189f)
                moveToRelative(-1.5f, 0.189f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -0.189f)
                moveToRelative(3.75f, 7.478f)
                arcToRelative(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, 0f)
                moveToRelative(3.75f, 2.383f)
                arcToRelative(14.406f, 14.406f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                moveTo(14.25f, 18f)
                verticalLineToRelative(-0.192f)
                curveToRelative(0f, -0.983f, 0.658f, -1.823f, 1.508f, -2.316f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7.517f, 0f)
                curveToRelative(0.85f, 0.493f, 1.509f, 1.333f, 1.509f, 2.316f)
                verticalLineTo(18f)
            }
        }.build()

        return _LightBulb!!
    }

@Suppress("ObjectPropertyName")
private var _LightBulb: ImageVector? = null
