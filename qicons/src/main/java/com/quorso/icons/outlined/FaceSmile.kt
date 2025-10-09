package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.FaceSmile: ImageVector
    get() {
        if (_FaceSmile != null) {
            return _FaceSmile!!
        }
        _FaceSmile = ImageVector.Builder(
            name = "Outlined.FaceSmile",
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
                moveTo(15.182f, 15.182f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.364f, 0f)
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                close()
                moveTo(9.75f, 9.75f)
                curveToRelative(0f, 0.414f, -0.168f, 0.75f, -0.375f, 0.75f)
                reflectiveCurveTo(9f, 10.164f, 9f, 9.75f)
                reflectiveCurveTo(9.168f, 9f, 9.375f, 9f)
                reflectiveCurveToRelative(0.375f, 0.336f, 0.375f, 0.75f)
                close()
                moveTo(9.375f, 9.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.015f)
                horizontalLineToRelative(-0.008f)
                lineTo(9.375f, 9.75f)
                close()
                moveTo(15f, 9.75f)
                curveToRelative(0f, 0.414f, -0.168f, 0.75f, -0.375f, 0.75f)
                reflectiveCurveToRelative(-0.375f, -0.336f, -0.375f, -0.75f)
                reflectiveCurveToRelative(0.168f, -0.75f, 0.375f, -0.75f)
                reflectiveCurveToRelative(0.375f, 0.336f, 0.375f, 0.75f)
                close()
                moveTo(14.625f, 9.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.015f)
                horizontalLineToRelative(-0.008f)
                lineTo(14.625f, 9.75f)
                close()
            }
        }.build()

        return _FaceSmile!!
    }

@Suppress("ObjectPropertyName")
private var _FaceSmile: ImageVector? = null
